package com.iitp.signagekiosk;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iitp.signagekiosk.databinding.ActivityMainBindingImpl;
import com.iitp.signagekiosk.databinding.ActivitySensorBindingImpl;
import com.iitp.signagekiosk.databinding.DialogDisconnectionBindingImpl;
import com.iitp.signagekiosk.databinding.DialogEmergencyBindingImpl;
import com.iitp.signagekiosk.databinding.DialogGuideBindingImpl;
import com.iitp.signagekiosk.databinding.FragmentIntroBindingImpl;
import com.iitp.signagekiosk.databinding.FragmentLoadingBindingImpl;
import com.iitp.signagekiosk.databinding.FragmentQuestionnaireBindingImpl;
import com.iitp.signagekiosk.databinding.LayoutAnswerAgeBindingImpl;
import com.iitp.signagekiosk.databinding.LayoutAnswerGenderBindingImpl;
import com.iitp.signagekiosk.databinding.LayoutAnswerLocationBindingImpl;
import com.iitp.signagekiosk.databinding.LayoutAnswerRightOrWrongBindingImpl;
import com.iitp.signagekiosk.databinding.LayoutAnswerTimesBindingImpl;
import com.iitp.signagekiosk.databinding.LayoutAnswerYesOrNoBindingImpl;
import com.iitp.signagekiosk.databinding.LayoutResultAbnormalBindingImpl;
import com.iitp.signagekiosk.databinding.LayoutResultNormalBindingImpl;
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
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYSENSOR = 2;

  private static final int LAYOUT_DIALOGDISCONNECTION = 3;

  private static final int LAYOUT_DIALOGEMERGENCY = 4;

  private static final int LAYOUT_DIALOGGUIDE = 5;

  private static final int LAYOUT_FRAGMENTINTRO = 6;

  private static final int LAYOUT_FRAGMENTLOADING = 7;

  private static final int LAYOUT_FRAGMENTQUESTIONNAIRE = 8;

  private static final int LAYOUT_LAYOUTANSWERAGE = 9;

  private static final int LAYOUT_LAYOUTANSWERGENDER = 10;

  private static final int LAYOUT_LAYOUTANSWERLOCATION = 11;

  private static final int LAYOUT_LAYOUTANSWERRIGHTORWRONG = 12;

  private static final int LAYOUT_LAYOUTANSWERTIMES = 13;

  private static final int LAYOUT_LAYOUTANSWERYESORNO = 14;

  private static final int LAYOUT_LAYOUTRESULTABNORMAL = 15;

  private static final int LAYOUT_LAYOUTRESULTNORMAL = 16;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(16);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iitp.signagekiosk.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iitp.signagekiosk.R.layout.activity_sensor, LAYOUT_ACTIVITYSENSOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iitp.signagekiosk.R.layout.dialog_disconnection, LAYOUT_DIALOGDISCONNECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iitp.signagekiosk.R.layout.dialog_emergency, LAYOUT_DIALOGEMERGENCY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iitp.signagekiosk.R.layout.dialog_guide, LAYOUT_DIALOGGUIDE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iitp.signagekiosk.R.layout.fragment_intro, LAYOUT_FRAGMENTINTRO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iitp.signagekiosk.R.layout.fragment_loading, LAYOUT_FRAGMENTLOADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iitp.signagekiosk.R.layout.fragment_questionnaire, LAYOUT_FRAGMENTQUESTIONNAIRE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iitp.signagekiosk.R.layout.layout_answer_age, LAYOUT_LAYOUTANSWERAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iitp.signagekiosk.R.layout.layout_answer_gender, LAYOUT_LAYOUTANSWERGENDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iitp.signagekiosk.R.layout.layout_answer_location, LAYOUT_LAYOUTANSWERLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iitp.signagekiosk.R.layout.layout_answer_right_or_wrong, LAYOUT_LAYOUTANSWERRIGHTORWRONG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iitp.signagekiosk.R.layout.layout_answer_times, LAYOUT_LAYOUTANSWERTIMES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iitp.signagekiosk.R.layout.layout_answer_yes_or_no, LAYOUT_LAYOUTANSWERYESORNO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iitp.signagekiosk.R.layout.layout_result_abnormal, LAYOUT_LAYOUTRESULTABNORMAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iitp.signagekiosk.R.layout.layout_result_normal, LAYOUT_LAYOUTRESULTNORMAL);
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
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSENSOR: {
          if ("layout/activity_sensor_0".equals(tag)) {
            return new ActivitySensorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sensor is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGDISCONNECTION: {
          if ("layout/dialog_disconnection_0".equals(tag)) {
            return new DialogDisconnectionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_disconnection is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGEMERGENCY: {
          if ("layout/dialog_emergency_0".equals(tag)) {
            return new DialogEmergencyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_emergency is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGGUIDE: {
          if ("layout/dialog_guide_0".equals(tag)) {
            return new DialogGuideBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_guide is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTINTRO: {
          if ("layout/fragment_intro_0".equals(tag)) {
            return new FragmentIntroBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_intro is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOADING: {
          if ("layout/fragment_loading_0".equals(tag)) {
            return new FragmentLoadingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_loading is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTQUESTIONNAIRE: {
          if ("layout/fragment_questionnaire_0".equals(tag)) {
            return new FragmentQuestionnaireBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_questionnaire is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTANSWERAGE: {
          if ("layout/layout_answer_age_0".equals(tag)) {
            return new LayoutAnswerAgeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_answer_age is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTANSWERGENDER: {
          if ("layout/layout_answer_gender_0".equals(tag)) {
            return new LayoutAnswerGenderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_answer_gender is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTANSWERLOCATION: {
          if ("layout/layout_answer_location_0".equals(tag)) {
            return new LayoutAnswerLocationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_answer_location is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTANSWERRIGHTORWRONG: {
          if ("layout/layout_answer_right_or_wrong_0".equals(tag)) {
            return new LayoutAnswerRightOrWrongBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_answer_right_or_wrong is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTANSWERTIMES: {
          if ("layout/layout_answer_times_0".equals(tag)) {
            return new LayoutAnswerTimesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_answer_times is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTANSWERYESORNO: {
          if ("layout/layout_answer_yes_or_no_0".equals(tag)) {
            return new LayoutAnswerYesOrNoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_answer_yes_or_no is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTRESULTABNORMAL: {
          if ("layout/layout_result_abnormal_0".equals(tag)) {
            return new LayoutResultAbnormalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_result_abnormal is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTRESULTNORMAL: {
          if ("layout/layout_result_normal_0".equals(tag)) {
            return new LayoutResultNormalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_result_normal is invalid. Received: " + tag);
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
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.iitp.saltlux_talkbot.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "connection");
      sKeys.put(2, "isVisible");
      sKeys.put(3, "text");
      sKeys.put(4, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(16);

    static {
      sKeys.put("layout/activity_main_0", com.iitp.signagekiosk.R.layout.activity_main);
      sKeys.put("layout/activity_sensor_0", com.iitp.signagekiosk.R.layout.activity_sensor);
      sKeys.put("layout/dialog_disconnection_0", com.iitp.signagekiosk.R.layout.dialog_disconnection);
      sKeys.put("layout/dialog_emergency_0", com.iitp.signagekiosk.R.layout.dialog_emergency);
      sKeys.put("layout/dialog_guide_0", com.iitp.signagekiosk.R.layout.dialog_guide);
      sKeys.put("layout/fragment_intro_0", com.iitp.signagekiosk.R.layout.fragment_intro);
      sKeys.put("layout/fragment_loading_0", com.iitp.signagekiosk.R.layout.fragment_loading);
      sKeys.put("layout/fragment_questionnaire_0", com.iitp.signagekiosk.R.layout.fragment_questionnaire);
      sKeys.put("layout/layout_answer_age_0", com.iitp.signagekiosk.R.layout.layout_answer_age);
      sKeys.put("layout/layout_answer_gender_0", com.iitp.signagekiosk.R.layout.layout_answer_gender);
      sKeys.put("layout/layout_answer_location_0", com.iitp.signagekiosk.R.layout.layout_answer_location);
      sKeys.put("layout/layout_answer_right_or_wrong_0", com.iitp.signagekiosk.R.layout.layout_answer_right_or_wrong);
      sKeys.put("layout/layout_answer_times_0", com.iitp.signagekiosk.R.layout.layout_answer_times);
      sKeys.put("layout/layout_answer_yes_or_no_0", com.iitp.signagekiosk.R.layout.layout_answer_yes_or_no);
      sKeys.put("layout/layout_result_abnormal_0", com.iitp.signagekiosk.R.layout.layout_result_abnormal);
      sKeys.put("layout/layout_result_normal_0", com.iitp.signagekiosk.R.layout.layout_result_normal);
    }
  }
}
