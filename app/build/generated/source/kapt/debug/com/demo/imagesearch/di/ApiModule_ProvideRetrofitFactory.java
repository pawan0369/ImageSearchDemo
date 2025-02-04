// Generated by Dagger (https://google.github.io/dagger).
package com.demo.imagesearch.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class ApiModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final ApiModule module;

  private final Provider<GsonConverterFactory> gsonConverterProvider;

  private final Provider<OkHttpClient> httpClientProvider;

  private final Provider<String> baseUrlProvider;

  public ApiModule_ProvideRetrofitFactory(
      ApiModule module,
      Provider<GsonConverterFactory> gsonConverterProvider,
      Provider<OkHttpClient> httpClientProvider,
      Provider<String> baseUrlProvider) {
    this.module = module;
    this.gsonConverterProvider = gsonConverterProvider;
    this.httpClientProvider = httpClientProvider;
    this.baseUrlProvider = baseUrlProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(
        module, gsonConverterProvider.get(), httpClientProvider.get(), baseUrlProvider.get());
  }

  public static ApiModule_ProvideRetrofitFactory create(
      ApiModule module,
      Provider<GsonConverterFactory> gsonConverterProvider,
      Provider<OkHttpClient> httpClientProvider,
      Provider<String> baseUrlProvider) {
    return new ApiModule_ProvideRetrofitFactory(
        module, gsonConverterProvider, httpClientProvider, baseUrlProvider);
  }

  public static Retrofit provideRetrofit(
      ApiModule instance,
      GsonConverterFactory gsonConverter,
      OkHttpClient httpClient,
      String baseUrl) {
    return Preconditions.checkNotNull(
        instance.provideRetrofit(gsonConverter, httpClient, baseUrl),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
