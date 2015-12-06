# ForkHub [![Google Play](http://developer.android.com/images/brand/en_generic_rgb_wo_45.png)](https://play.google.com/store/apps/details?id=jp.forkhub)

The official [GitHub Android App](https://github.com/github/android/) hasn't been updated in a while and has been accumulating a few bugs and missing features, so I've decided to fork it and keep improving it.

I'll start by merging bug fixes that have been lying around for months, and once I'm comfortable again with the state of the app, I'd like to start adding new features.

You can see a comprehensive list of changes made to the original app in the [change log](https://github.com/jonan/ForkHub/blob/master/CHANGELOG.md).

[![Download from Google Play](https://cloud.githubusercontent.com/assets/3838734/3855877/4cf2a2dc-1eec-11e4-9634-2a1adf8f1c39.jpg)](https://play.google.com/store/apps/details?id=jp.forkhub)

Please see the [issues](https://github.com/jonan/ForkHub/issues) section to
report any bugs or feature requests and to see the list of known issues.

## Acknowledgements

This project uses the [GitHub Java API](https://github.com/eclipse/egit-github/tree/master/org.eclipse.egit.github.core)
built on top of [API v3](https://developer.github.com/v3/).

It also uses many other open source libraries such as:

* [Picasso](http://square.github.io/picasso/)
* [CodeMirror](https://github.com/codemirror/CodeMirror)
* [ViewPagerIndicator](https://github.com/JakeWharton/Android-ViewPagerIndicator)
* [RoboGuice](https://github.com/roboguice/roboguice)

These are just a few of the major dependencies, the entire list of dependencies
is listed in the [app's Gradle file](https://github.com/jonan/ForkHub/blob/master/app/build.gradle).

## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/jonan/ForkHub/pulls).

Any contributions, large or small, major features, bug fixes, additional
language translations, unit/integration tests are welcomed and appreciated
but will be thoroughly reviewed and discussed.

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

## This fork:

### Videocapture

https://youtu.be/Ya9Md0G3IE0 

### To submit

https://classroom.github.com/assignment-invitations/d1d4b9b5dfaa5eb8602e6843f35a0949

### Clone

```shell
$ git clone https://github.com/jonan/ForkHub
Cloning into 'ForkHub'...
remote: Counting objects: 32768, done.
remote: Total 32768 (delta 0), reused 0 (delta 0), pack-reused 32768
Receiving objects: 100% (32768/32768), 8.57 MiB | 57 KiB/s, done.
Resolving deltas: 100% (18634/18634), done.
```


### Tasks

```shell
$ ./gradlew tasks
Download https://jcenter.bintray.com/com/github/triplet/gradle/play-publisher/1.1.4/play-publisher-1.1.4.pom
Download https://jcenter.bintray.com/com/google/apis/google-api-services-androidpublisher/v2-rev19-1.20.0/google-api-services-androidpublisher-v2-rev19-1.20.0.pom
Download https://jcenter.bintray.com/commons-lang/commons-lang/2.6/commons-lang-2.6.pom
Download https://jcenter.bintray.com/org/apache/commons/commons-parent/17/commons-parent-17.pom
Download https://jcenter.bintray.com/commons-io/commons-io/1.4/commons-io-1.4.pom
Download https://jcenter.bintray.com/org/apache/commons/commons-parent/7/commons-parent-7.pom
Download https://jcenter.bintray.com/com/google/api-client/google-api-client/1.20.0/google-api-client-1.20.0.pom
Download https://jcenter.bintray.com/com/google/api-client/google-api-client-parent/1.20.0/google-api-client-parent-1.20.0.pom
Download https://jcenter.bintray.com/com/google/oauth-client/google-oauth-client/1.20.0/google-oauth-client-1.20.0.pom
Download https://jcenter.bintray.com/com/google/oauth-client/google-oauth-client-parent/1.20.0/google-oauth-client-parent-1.20.0.pom
Download https://jcenter.bintray.com/com/google/http-client/google-http-client-jackson2/1.20.0/google-http-client-jackson2-1.20.0.pom
Download https://jcenter.bintray.com/com/google/http-client/google-http-client-parent/1.20.0/google-http-client-parent-1.20.0.pom
Download https://jcenter.bintray.com/com/google/http-client/google-http-client/1.20.0/google-http-client-1.20.0.pom
Download https://jcenter.bintray.com/com/google/code/findbugs/jsr305/1.3.9/jsr305-1.3.9.pom
Download https://jcenter.bintray.com/com/fasterxml/jackson/core/jackson-core/2.1.3/jackson-core-2.1.3.pom
Download https://jcenter.bintray.com/com/fasterxml/oss-parent/4/oss-parent-4.pom
Download https://jcenter.bintray.com/org/apache/httpcomponents/httpclient/4.0.1/httpclient-4.0.1.pom
Download https://jcenter.bintray.com/org/apache/httpcomponents/httpcomponents-client/4.0.1/httpcomponents-client-4.0.1.pom
Download https://jcenter.bintray.com/org/apache/httpcomponents/project/4.0/project-4.0.pom
Download https://jcenter.bintray.com/org/apache/httpcomponents/httpcore/4.0.1/httpcore-4.0.1.pom
Download https://jcenter.bintray.com/org/apache/httpcomponents/httpcomponents-core/4.0.1/httpcomponents-core-4.0.1.pom
Download https://jcenter.bintray.com/commons-codec/commons-codec/1.3/commons-codec-1.3.pom
Download https://jcenter.bintray.com/com/github/triplet/gradle/play-publisher/1.1.4/play-publisher-1.1.4.jar
Download https://jcenter.bintray.com/com/google/apis/google-api-services-androidpublisher/v2-rev19-1.20.0/google-api-services-androidpublisher-v2-rev19-1.20.0.jar
Download https://jcenter.bintray.com/commons-lang/commons-lang/2.6/commons-lang-2.6.jar
Download https://jcenter.bintray.com/commons-io/commons-io/1.4/commons-io-1.4.jar
Download https://jcenter.bintray.com/com/google/api-client/google-api-client/1.20.0/google-api-client-1.20.0.jar
Download https://jcenter.bintray.com/com/google/oauth-client/google-oauth-client/1.20.0/google-oauth-client-1.20.0.jar
Download https://jcenter.bintray.com/com/google/http-client/google-http-client-jackson2/1.20.0/google-http-client-jackson2-1.20.0.jar
Download https://jcenter.bintray.com/com/google/http-client/google-http-client/1.20.0/google-http-client-1.20.0.jar
Download https://jcenter.bintray.com/com/google/code/findbugs/jsr305/1.3.9/jsr305-1.3.9.jar
Download https://jcenter.bintray.com/com/fasterxml/jackson/core/jackson-core/2.1.3/jackson-core-2.1.3.jar
Download https://jcenter.bintray.com/com/squareup/picasso/picasso/2.5.2/picasso-2.5.2.pom
Download https://jcenter.bintray.com/com/squareup/picasso/picasso-parent/2.5.2/picasso-parent-2.5.2.pom
Download https://jcenter.bintray.com/com/squareup/okhttp/okhttp-urlconnection/2.6.0/okhttp-urlconnection-2.6.0.pom
Download https://jcenter.bintray.com/com/squareup/okhttp/parent/2.6.0/parent-2.6.0.pom
Download https://jcenter.bintray.com/org/roboguice/roboguice/2.0/roboguice-2.0.pom
Download https://jcenter.bintray.com/com/google/code/gson/gson/2.4/gson-2.4.pom
Download https://repo.eclipse.org/content/groups/releases/org/eclipse/mylyn/github/org.eclipse.egit.github.core/4.1.0.201509280440-r/org.eclipse.egit.github.core-4.1.0.201509280440-r.pom
Download https://repo.eclipse.org/content/groups/releases/org/eclipse/mylyn/github/github-parent/4.1.0.201509280440-r/github-parent-4.1.0.201509280440-r.pom
Download https://jcenter.bintray.com/com/google/inject/extensions/guice-assistedinject/3.0/guice-assistedinject-3.0.pom
Download https://jcenter.bintray.com/com/google/inject/extensions/extensions-parent/3.0/extensions-parent-3.0.pom
Download https://jcenter.bintray.com/com/google/inject/guice-parent/3.0/guice-parent-3.0.pom
Download https://jcenter.bintray.com/com/google/google/5/google-5.pom
Download http://dl.bintray.com/populov/maven/com/viewpagerindicator/library/2.4.1/library-2.4.1.pom
Download https://jcenter.bintray.com/com/squareup/okhttp/okhttp/2.6.0/okhttp-2.6.0.pom
Download https://jcenter.bintray.com/com/google/inject/guice/3.0/guice-3.0.pom
Download https://jcenter.bintray.com/com/squareup/okio/okio/1.6.0/okio-1.6.0.pom
Download https://jcenter.bintray.com/com/squareup/okio/okio-parent/1.6.0/okio-parent-1.6.0.pom
Download https://jcenter.bintray.com/aopalliance/aopalliance/1.0/aopalliance-1.0.pom
Download https://jcenter.bintray.com/org/sonatype/sisu/inject/cglib/2.2.1-v20090111/cglib-2.2.1-v20090111.pom
Download https://jcenter.bintray.com/org/sonatype/forge/forge-parent/6/forge-parent-6.pom
Download https://jcenter.bintray.com/asm/asm/3.1/asm-3.1.pom
Download https://jcenter.bintray.com/asm/asm-parent/3.1/asm-parent-3.1.pom
Download https://jcenter.bintray.com/com/squareup/picasso/picasso/2.5.2/picasso-2.5.2.jar
Download https://jcenter.bintray.com/com/squareup/okio/okio/1.6.0/okio-1.6.0.jar
Download https://jcenter.bintray.com/com/squareup/okhttp/okhttp/2.6.0/okhttp-2.6.0.jar
Download https://jcenter.bintray.com/com/squareup/okhttp/okhttp-urlconnection/2.6.0/okhttp-urlconnection-2.6.0.jar
Download https://jcenter.bintray.com/aopalliance/aopalliance/1.0/aopalliance-1.0.jar
Download https://jcenter.bintray.com/asm/asm/3.1/asm-3.1.jar
Download https://jcenter.bintray.com/org/sonatype/sisu/inject/cglib/2.2.1-v20090111/cglib-2.2.1-v20090111.jar
Download https://jcenter.bintray.com/com/google/inject/guice/3.0/guice-3.0-no_aop.jar
Download https://jcenter.bintray.com/org/roboguice/roboguice/2.0/roboguice-2.0.jar
Download https://jcenter.bintray.com/com/google/code/gson/gson/2.4/gson-2.4.jar
Download https://repo.eclipse.org/content/groups/releases/org/eclipse/mylyn/github/org.eclipse.egit.github.core/4.1.0.201509280440-r/org.eclipse.egit.github.core-4.1.0.201509280440-r.jar
Download https://jcenter.bintray.com/com/google/inject/extensions/guice-assistedinject/3.0/guice-assistedinject-3.0.jar
Download http://dl.bintray.com/populov/maven/com/viewpagerindicator/library/2.4.1/library-2.4.1.aar
Could not find ZipAlign task. Did you specify a signingConfig for the variation Release?
:tasks

------------------------------------------------------------
All tasks runnable from root project
------------------------------------------------------------

Android tasks
-------------
androidDependencies - Displays the Android dependencies of the project.
signingReport - Displays the signing info for each variant.
sourceSets - Prints out all the source sets defined in this project.

Build tasks
-----------
assemble - Assembles all variants of all applications and secondary packages.
assembleAndroidTest - Assembles all the Test applications.
assembleDebug - Assembles all Debug builds.
assembleRelease - Assembles all Release builds.
build - Assembles and tests this project.
buildDependents - Assembles and tests this project and all projects that depend on it.
buildNeeded - Assembles and tests this project and all projects it depends on.
clean - Deletes the build directory.
compileDebugAndroidTestSources
compileDebugSources
compileDebugUnitTestSources
compileReleaseSources
compileReleaseUnitTestSources
mockableAndroidJar - Creates a version of android.jar that's suitable for unit tests.

Build Setup tasks
-----------------
init - Initializes a new Gradle build. [incubating]
wrapper - Generates Gradle wrapper files. [incubating]

Help tasks
----------
components - Displays the components produced by root project 'ForkHub'. [incubating]
dependencies - Displays all dependencies declared in root project 'ForkHub'.
dependencyInsight - Displays the insight into a specific dependency in root project 'ForkHub'.
help - Displays a help message.
projects - Displays the sub-projects of root project 'ForkHub'.
properties - Displays the properties of root project 'ForkHub'.
tasks - Displays the tasks runnable from root project 'ForkHub' (some of the displayed tasks may belong to subprojects).

Install tasks
-------------
installDebug - Installs the Debug build.
installDebugAndroidTest - Installs the android (on device) tests for the Debug build.
uninstallAll - Uninstall all applications.
uninstallDebug - Uninstalls the Debug build.
uninstallDebugAndroidTest - Uninstalls the android (on device) tests for the Debug build.
uninstallRelease - Uninstalls the Release build.

Play Store tasks
----------------
bootstrapReleasePlayResources - Downloads the play store listing for the Release build. No download of image resources. See #18.
generateReleasePlayResources - Collects play store resources for the Release build
publishListingRelease - Updates the play store listing for the Release build

Verification tasks
------------------
check - Runs all checks.
connectedAndroidTest - Installs and runs instrumentation tests for all flavors on connected devices.
connectedCheck - Runs all device checks on currently connected devices.
connectedDebugAndroidTest - Installs and runs the tests for debug on connected devices.
deviceAndroidTest - Installs and runs instrumentation tests using all Device Providers.
deviceCheck - Runs all device checks using Device Providers and Test Servers.
lint - Runs lint on all variants.
lintDebug - Runs lint on the Debug build.
lintRelease - Runs lint on the Release build.
test - Run unit tests for all variants.
testDebugUnitTest - Run unit tests for the debug build.
testReleaseUnitTest - Run unit tests for the release build.

Other tasks
-----------
jarDebugClasses
jarReleaseClasses
lintVitalRelease - Runs lint on just the fatal issues in the Release build.

To see all tasks and more detail, run with --all.

BUILD SUCCESSFUL

Total time: 3 mins 1.221 secs
```

### Install

```shell
$ ./gradlew installDebug
Could not find ZipAlign task. Did you specify a signingConfig for the variation Release?
:app:preBuild UP-TO-DATE
:app:preDebugBuild UP-TO-DATE
:app:checkDebugManifest
:app:preReleaseBuild UP-TO-DATE
:app:prepareComAndroidSupportAppcompatV72301Library
:app:prepareComAndroidSupportDesign2301Library
:app:prepareComAndroidSupportSupportV42301Library
:app:prepareComViewpagerindicatorLibrary241Library
:app:prepareLibLibrary
:app:prepareDebugDependencies
:app:compileDebugAidl
:app:compileDebugRenderscript
:app:generateDebugBuildConfig
:app:generateDebugAssets UP-TO-DATE
:app:mergeDebugAssets
:app:generateDebugResValues
:app:generateDebugResources
:app:mergeDebugResources
:app:processDebugManifest
:app:processDebugResources
Unknown source file : warning: string 'login_or_email' has no default translation.

:app:generateDebugSources
:app:processDebugJavaRes UP-TO-DATE
:app:compileDebugJavaWithJavac
Note: Some input files use or override a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
:app:compileDebugNdk UP-TO-DATE
:app:compileDebugSources
:app:preDexDebug
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.beans.BeanMapEmitter$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.beans.BeanMapEmitter$2) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.beans.BeanMapEmitter$3) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.ClassEmitter$2) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.AbstractClassGenerator$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.ClassEmitter$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.ClassEmitter$3) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.ClassNameReader$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.EmitUtils$11) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.EmitUtils$12) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.EmitUtils$13) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.EmitUtils$14) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.DebuggingClassWriter$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.EmitUtils$3) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.EmitUtils$4) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.EmitUtils$8) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.EmitUtils$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.EmitUtils$10) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.EmitUtils$15) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.EmitUtils$16) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.EmitUtils$2) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.KeyFactory$2) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.EmitUtils$5) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.EmitUtils$6) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.EmitUtils$7) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.EmitUtils$9) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.KeyFactory$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.ReflectUtils$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.ReflectUtils$3) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.ReflectUtils$4) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.core.ReflectUtils$2) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.proxy.Enhancer$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.proxy.Enhancer$2) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.proxy.Enhancer$3) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.proxy.Enhancer$4) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.proxy.Enhancer$5) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.proxy.Enhancer$6) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.proxy.MethodInterceptorGenerator$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.proxy.MethodInterceptorGenerator$2) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.proxy.NoOp$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.proxy.Proxy$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.reflect.FastClassEmitter$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.reflect.FastClassEmitter$2) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.reflect.FastClassEmitter$3) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.reflect.FastClassEmitter$4) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.reflect.MulticastDelegate$Generator$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.transform.AbstractClassLoader$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.transform.impl.AddDelegateTransformer$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.transform.impl.AddInitTransformer$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.transform.impl.FieldProviderTransformer$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.transform.impl.FieldProviderTransformer$2) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.transform.impl.FieldProviderTransformer$3) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.transform.impl.FieldProviderTransformer$4) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.transform.impl.InterceptFieldTransformer$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.transform.impl.UndeclaredThrowableStrategy$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.transform.impl.UndeclaredThrowableTransformer$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.
Unknown source file : warning: Ignoring InnerClasses attribute for an anonymous inner class
Unknown source file : (net.sf.cglib.util.StringSwitcher$Generator$1) that doesn't come with an
Unknown source file : associated EnclosingMethod attribute. This class was probably produced by a
Unknown source file : compiler that did not target the modern .class file format. The recommended
Unknown source file : solution is to recompile the class from source, using an up-to-date compiler
Unknown source file : and without specifying any "-target" type options. The consequence of ignoring
Unknown source file : this warning is that reflective operations on this class will incorrectly
Unknown source file : indicate that it is *not* an inner class.

:app:dexDebug
:app:validateDebugSigning
:app:packageDebug
:app:zipalignDebug
:app:assembleDebug
:app:installDebug
Installing APK 'app-debug.apk' on 'X330 - 4.4.4'
Installed on 1 device.

BUILD SUCCESSFUL

Total time: 4 mins 17.212 secs
```
