/*
 * Copyright 2013 GitHub Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.zion.ui.search;

import static android.app.SearchManager.QUERY;
import static android.content.Intent.ACTION_SEARCH;
import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP;
import static android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;

import com.github.zion.R;
import com.github.zion.ui.TabPagerActivity;
import com.github.zion.ui.user.HomeActivity;
import com.github.zion.util.ToastUtils;
import com.github.zion.util.TypefaceUtils;

/**
 * Activity to view search results
 */
public class SearchActivity extends TabPagerActivity<SearchPagerAdapter> {

    private SearchRepositoryListFragment repoFragment;

    private SearchUserListFragment userFragment;

    private String query;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        configurePager();
        handleIntent(getIntent());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu options) {
        getMenuInflater().inflate(R.menu.search, options);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.m_search:
            onSearchRequested();
            return true;
        case R.id.m_clear:
            RepositorySearchSuggestionsProvider.clear(this);
            ToastUtils.show(this, R.string.search_history_cleared);
            return true;
        case android.R.id.home:
            Intent intent = new Intent(this, HomeActivity.class);
            intent.addFlags(FLAG_ACTIVITY_CLEAR_TOP | FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected SearchPagerAdapter createAdapter() {
        return new SearchPagerAdapter(this);
    }

    @Override
    protected String getIcon(int position) {
        switch (position) {
        case 0:
            return TypefaceUtils.ICON_REPO;
        case 1:
            return TypefaceUtils.ICON_PERSON;
        default:
            return super.getIcon(position);
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        handleIntent(intent);
    }

    @Override
    public boolean onSearchRequested() {
        startSearch(query, true, null, false);
        return true;
    }

    private void handleIntent(Intent intent) {
        if (ACTION_SEARCH.equals(intent.getAction()))
            search(intent.getStringExtra(QUERY));
    }

    private void search(final String query) {
        this.query = query;
        getSupportActionBar().setTitle(query);
        RepositorySearchSuggestionsProvider.save(this, query);

        findFragments();

        if (repoFragment != null && userFragment != null) {
            repoFragment.setListShown(false);
            userFragment.setListShown(false);

            repoFragment.refresh();
            userFragment.refresh();
        }
    }

    private void configurePager() {
        configureTabPager();
    }

    private void findFragments() {
        if (repoFragment == null || userFragment == null) {
            FragmentManager fm = getSupportFragmentManager();
            repoFragment = (SearchRepositoryListFragment) fm.findFragmentByTag(
                    "android:switcher:" + pager.getId() + ":" + 0);
            userFragment = (SearchUserListFragment) fm.findFragmentByTag(
                    "android:switcher:" + pager.getId() + ":" + 1);
        }
    }
}
