package com.demo.imagesearch;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.demo.imagesearch.databinding.ActivityDashboardBindingImpl;
import com.demo.imagesearch.databinding.ActivityImageDetailsBindingImpl;
import com.demo.imagesearch.databinding.ListSearchImagesBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDASHBOARD = 1;

  private static final int LAYOUT_ACTIVITYIMAGEDETAILS = 2;

  private static final int LAYOUT_LISTSEARCHIMAGES = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.demo.imagesearch.R.layout.activity_dashboard, LAYOUT_ACTIVITYDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.demo.imagesearch.R.layout.activity_image_details, LAYOUT_ACTIVITYIMAGEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.demo.imagesearch.R.layout.list_search_images, LAYOUT_LISTSEARCHIMAGES);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDASHBOARD: {
          if ("layout/activity_dashboard_0".equals(tag)) {
            return new ActivityDashboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_dashboard is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYIMAGEDETAILS: {
          if ("layout/activity_image_details_0".equals(tag)) {
            return new ActivityImageDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_image_details is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTSEARCHIMAGES: {
          if ("layout/list_search_images_0".equals(tag)) {
            return new ListSearchImagesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_search_images is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "model");
      sKeys.put(2, "vm");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_dashboard_0", com.demo.imagesearch.R.layout.activity_dashboard);
      sKeys.put("layout/activity_image_details_0", com.demo.imagesearch.R.layout.activity_image_details);
      sKeys.put("layout/list_search_images_0", com.demo.imagesearch.R.layout.list_search_images);
    }
  }
}
