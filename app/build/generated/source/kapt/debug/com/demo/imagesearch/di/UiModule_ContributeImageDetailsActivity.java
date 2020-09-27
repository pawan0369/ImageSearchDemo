package com.demo.imagesearch.di;

import com.demo.imagesearch.ui.dashboard.ImageDetailsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = UiModule_ContributeImageDetailsActivity.ImageDetailsActivitySubcomponent.class
)
public abstract class UiModule_ContributeImageDetailsActivity {
  private UiModule_ContributeImageDetailsActivity() {}

  @Binds
  @IntoMap
  @ClassKey(ImageDetailsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ImageDetailsActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface ImageDetailsActivitySubcomponent extends AndroidInjector<ImageDetailsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ImageDetailsActivity> {}
  }
}
