package com.demo.imagesearch.di;

import com.demo.imagesearch.ui.dashboard.DashboardActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = UiModule_ContributeDashboardActivity.DashboardActivitySubcomponent.class)
public abstract class UiModule_ContributeDashboardActivity {
  private UiModule_ContributeDashboardActivity() {}

  @Binds
  @IntoMap
  @ClassKey(DashboardActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DashboardActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface DashboardActivitySubcomponent extends AndroidInjector<DashboardActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DashboardActivity> {}
  }
}
