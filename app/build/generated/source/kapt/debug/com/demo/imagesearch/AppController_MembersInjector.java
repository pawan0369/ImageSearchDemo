// Generated by Dagger (https://google.github.io/dagger).
package com.demo.imagesearch;

import android.app.Activity;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class AppController_MembersInjector implements MembersInjector<AppController> {
  private final Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider;

  public AppController_MembersInjector(
      Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider) {
    this.activityInjectorProvider = activityInjectorProvider;
  }

  public static MembersInjector<AppController> create(
      Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider) {
    return new AppController_MembersInjector(activityInjectorProvider);
  }

  @Override
  public void injectMembers(AppController instance) {
    injectActivityInjector(instance, activityInjectorProvider.get());
  }

  public static void injectActivityInjector(
      AppController instance, DispatchingAndroidInjector<Activity> activityInjector) {
    instance.activityInjector = activityInjector;
  }
}
