/*
 * Copyright 2012 GitHub Inc.
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
package com.github.zion.ui.user;

import com.github.zion.accounts.AccountUtils;
import com.github.zion.core.ResourcePager;

import org.eclipse.egit.github.core.client.PageIterator;
import org.eclipse.egit.github.core.event.Event;

/**
 * Fragment to display an organization's news
 */
public class OrganizationNewsFragment extends UserNewsFragment {

    @Override
    protected ResourcePager<Event> createPager() {
        return new EventPager() {

            @Override
            public PageIterator<Event> createIterator(int page, int size) {
                String account = AccountUtils.getLogin(getActivity());
                return service.pageUserOrgEvents(account, org.getLogin(), page,
                        size);
            }
        };
    }
}
