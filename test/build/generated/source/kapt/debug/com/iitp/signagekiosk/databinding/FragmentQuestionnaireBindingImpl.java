package com.iitp.signagekiosk.databinding;
import com.iitp.signagekiosk.R;
import com.iitp.signagekiosk.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentQuestionnaireBindingImpl extends FragmentQuestionnaireBinding implements com.iitp.signagekiosk.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(60);
        sIncludes.setIncludes(0, 
            new String[] {"layout_result_normal", "layout_result_abnormal"},
            new int[] {25, 26},
            new int[] {com.iitp.signagekiosk.R.layout.layout_result_normal,
                com.iitp.signagekiosk.R.layout.layout_result_abnormal});
        sIncludes.setIncludes(5, 
            new String[] {"layout_answer_age", "layout_answer_gender", "layout_answer_location", "layout_answer_times", "layout_answer_yes_or_no", "layout_answer_right_or_wrong"},
            new int[] {19, 20, 21, 22, 23, 24},
            new int[] {com.iitp.signagekiosk.R.layout.layout_answer_age,
                com.iitp.signagekiosk.R.layout.layout_answer_gender,
                com.iitp.signagekiosk.R.layout.layout_answer_location,
                com.iitp.signagekiosk.R.layout.layout_answer_times,
                com.iitp.signagekiosk.R.layout.layout_answer_yes_or_no,
                com.iitp.signagekiosk.R.layout.layout_answer_right_or_wrong});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.left_bar, 27);
        sViewsWithIds.put(R.id.imageView6, 28);
        sViewsWithIds.put(R.id.textView8, 29);
        sViewsWithIds.put(R.id.imageView21, 30);
        sViewsWithIds.put(R.id.view5, 31);
        sViewsWithIds.put(R.id.textView33, 32);
        sViewsWithIds.put(R.id.imageView20, 33);
        sViewsWithIds.put(R.id.textView29, 34);
        sViewsWithIds.put(R.id.textView30, 35);
        sViewsWithIds.put(R.id.view2, 36);
        sViewsWithIds.put(R.id.view, 37);
        sViewsWithIds.put(R.id.step_container, 38);
        sViewsWithIds.put(R.id.textView9, 39);
        sViewsWithIds.put(R.id.view3, 40);
        sViewsWithIds.put(R.id.step_box_1, 41);
        sViewsWithIds.put(R.id.step_box_2, 42);
        sViewsWithIds.put(R.id.step_box_3, 43);
        sViewsWithIds.put(R.id.voice_container, 44);
        sViewsWithIds.put(R.id.textView10, 45);
        sViewsWithIds.put(R.id.textView18, 46);
        sViewsWithIds.put(R.id.sensor_container, 47);
        sViewsWithIds.put(R.id.textView11, 48);
        sViewsWithIds.put(R.id.frameLayout7, 49);
        sViewsWithIds.put(R.id.textView12, 50);
        sViewsWithIds.put(R.id.imageView7, 51);
        sViewsWithIds.put(R.id.frameLayout6, 52);
        sViewsWithIds.put(R.id.textView13, 53);
        sViewsWithIds.put(R.id.textView15, 54);
        sViewsWithIds.put(R.id.frameLayout8, 55);
        sViewsWithIds.put(R.id.textView14, 56);
        sViewsWithIds.put(R.id.textView17, 57);
        sViewsWithIds.put(R.id.imageView18, 58);
        sViewsWithIds.put(R.id.textView27, 59);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.ImageView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.TextView mboundView14;
    @NonNull
    private final android.widget.ProgressBar mboundView15;
    @NonNull
    private final android.widget.ProgressBar mboundView17;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView18;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView2;
    @NonNull
    private final androidx.constraintlayout.widget.Group mboundView4;
    @Nullable
    private final com.iitp.signagekiosk.databinding.LayoutAnswerAgeBinding mboundView5;
    @Nullable
    private final com.iitp.signagekiosk.databinding.LayoutAnswerGenderBinding mboundView51;
    @Nullable
    private final com.iitp.signagekiosk.databinding.LayoutAnswerLocationBinding mboundView52;
    @Nullable
    private final com.iitp.signagekiosk.databinding.LayoutAnswerTimesBinding mboundView53;
    @Nullable
    private final com.iitp.signagekiosk.databinding.LayoutAnswerYesOrNoBinding mboundView54;
    @Nullable
    private final com.iitp.signagekiosk.databinding.LayoutAnswerRightOrWrongBinding mboundView55;
    @NonNull
    private final android.view.View mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentQuestionnaireBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 60, sIncludes, sViewsWithIds));
    }
    private FragmentQuestionnaireBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 15
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.FrameLayout) bindings[52]
            , (android.widget.FrameLayout) bindings[49]
            , (android.widget.FrameLayout) bindings[55]
            , (android.widget.ImageView) bindings[58]
            , (android.widget.ImageView) bindings[33]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[51]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[27]
            , (com.iitp.signagekiosk.databinding.LayoutResultAbnormalBinding) bindings[26]
            , (com.iitp.signagekiosk.databinding.LayoutResultNormalBinding) bindings[25]
            , (androidx.cardview.widget.CardView) bindings[47]
            , (android.widget.FrameLayout) bindings[41]
            , (android.widget.FrameLayout) bindings[42]
            , (android.widget.FrameLayout) bindings[43]
            , (androidx.cardview.widget.CardView) bindings[38]
            , (android.widget.TextView) bindings[45]
            , (android.widget.TextView) bindings[48]
            , (android.widget.TextView) bindings[50]
            , (android.widget.TextView) bindings[53]
            , (android.widget.TextView) bindings[56]
            , (android.widget.TextView) bindings[54]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[57]
            , (android.widget.TextView) bindings[46]
            , (android.widget.TextView) bindings[59]
            , (android.widget.TextView) bindings[34]
            , (android.widget.TextView) bindings[35]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[39]
            , (android.view.View) bindings[37]
            , (android.view.View) bindings[36]
            , (android.view.View) bindings[40]
            , (android.view.View) bindings[31]
            , (com.iitp.signagekiosk.util.voiceanimation.VoiceView) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[44]
            );
        this.answerView.setTag(null);
        this.constraintLayout.setTag(null);
        this.frameLayout.setTag(null);
        this.imageView5.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView12 = (android.widget.ImageView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.TextView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.ProgressBar) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView17 = (android.widget.ProgressBar) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView18 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView2 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (androidx.constraintlayout.widget.Group) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.iitp.signagekiosk.databinding.LayoutAnswerAgeBinding) bindings[19];
        setContainedBinding(this.mboundView5);
        this.mboundView51 = (com.iitp.signagekiosk.databinding.LayoutAnswerGenderBinding) bindings[20];
        setContainedBinding(this.mboundView51);
        this.mboundView52 = (com.iitp.signagekiosk.databinding.LayoutAnswerLocationBinding) bindings[21];
        setContainedBinding(this.mboundView52);
        this.mboundView53 = (com.iitp.signagekiosk.databinding.LayoutAnswerTimesBinding) bindings[22];
        setContainedBinding(this.mboundView53);
        this.mboundView54 = (com.iitp.signagekiosk.databinding.LayoutAnswerYesOrNoBinding) bindings[23];
        setContainedBinding(this.mboundView54);
        this.mboundView55 = (com.iitp.signagekiosk.databinding.LayoutAnswerRightOrWrongBinding) bindings[24];
        setContainedBinding(this.mboundView55);
        this.mboundView8 = (android.view.View) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        setContainedBinding(this.resultAbnormal);
        setContainedBinding(this.resultNormal);
        this.textView16.setTag(null);
        this.textView31.setTag(null);
        this.textView32.setTag(null);
        this.voice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.iitp.signagekiosk.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10000L;
        }
        mboundView5.invalidateAll();
        mboundView51.invalidateAll();
        mboundView52.invalidateAll();
        mboundView53.invalidateAll();
        mboundView54.invalidateAll();
        mboundView55.invalidateAll();
        resultNormal.invalidateAll();
        resultAbnormal.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView5.hasPendingBindings()) {
            return true;
        }
        if (mboundView51.hasPendingBindings()) {
            return true;
        }
        if (mboundView52.hasPendingBindings()) {
            return true;
        }
        if (mboundView53.hasPendingBindings()) {
            return true;
        }
        if (mboundView54.hasPendingBindings()) {
            return true;
        }
        if (mboundView55.hasPendingBindings()) {
            return true;
        }
        if (resultNormal.hasPendingBindings()) {
            return true;
        }
        if (resultAbnormal.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.iitp.signagekiosk.questionnaire.QuestionnaireViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.iitp.signagekiosk.questionnaire.QuestionnaireViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView5.setLifecycleOwner(lifecycleOwner);
        mboundView51.setLifecycleOwner(lifecycleOwner);
        mboundView52.setLifecycleOwner(lifecycleOwner);
        mboundView53.setLifecycleOwner(lifecycleOwner);
        mboundView54.setLifecycleOwner(lifecycleOwner);
        mboundView55.setLifecycleOwner(lifecycleOwner);
        resultNormal.setLifecycleOwner(lifecycleOwner);
        resultAbnormal.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelResultAbnormal((kotlinx.coroutines.flow.StateFlow<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelHeartRate((kotlinx.coroutines.flow.StateFlow<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeResultAbnormal((com.iitp.signagekiosk.databinding.LayoutResultAbnormalBinding) object, fieldId);
            case 3 :
                return onChangeViewModelOnStep3((kotlinx.coroutines.flow.StateFlow<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelPrevAnswer((kotlinx.coroutines.flow.StateFlow<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelMotion((kotlinx.coroutines.flow.StateFlow<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelResultNormal((kotlinx.coroutines.flow.StateFlow<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewModelQuestion((kotlinx.coroutines.flow.StateFlow<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModelTemperature((kotlinx.coroutines.flow.StateFlow<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewModelCanGoPrevious((kotlinx.coroutines.flow.StateFlow<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeViewModelVoiceOn((kotlinx.coroutines.flow.StateFlow<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeViewModelVoiceVolume((kotlinx.coroutines.flow.StateFlow<java.lang.Integer>) object, fieldId);
            case 12 :
                return onChangeViewModelRespiration((kotlinx.coroutines.flow.StateFlow<java.lang.String>) object, fieldId);
            case 13 :
                return onChangeResultNormal((com.iitp.signagekiosk.databinding.LayoutResultNormalBinding) object, fieldId);
            case 14 :
                return onChangeViewModelAnswerType((kotlinx.coroutines.flow.StateFlow<com.iitp.saltlux_talkbot.AnswerType>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelResultAbnormal(kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> ViewModelResultAbnormal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHeartRate(kotlinx.coroutines.flow.StateFlow<java.lang.String> ViewModelHeartRate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeResultAbnormal(com.iitp.signagekiosk.databinding.LayoutResultAbnormalBinding ResultAbnormal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOnStep3(kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> ViewModelOnStep3, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPrevAnswer(kotlinx.coroutines.flow.StateFlow<java.lang.String> ViewModelPrevAnswer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMotion(kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> ViewModelMotion, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelResultNormal(kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> ViewModelResultNormal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelQuestion(kotlinx.coroutines.flow.StateFlow<java.lang.String> ViewModelQuestion, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTemperature(kotlinx.coroutines.flow.StateFlow<java.lang.String> ViewModelTemperature, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCanGoPrevious(kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> ViewModelCanGoPrevious, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVoiceOn(kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> ViewModelVoiceOn, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVoiceVolume(kotlinx.coroutines.flow.StateFlow<java.lang.Integer> ViewModelVoiceVolume, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRespiration(kotlinx.coroutines.flow.StateFlow<java.lang.String> ViewModelRespiration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeResultNormal(com.iitp.signagekiosk.databinding.LayoutResultNormalBinding ResultNormal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAnswerType(kotlinx.coroutines.flow.StateFlow<com.iitp.saltlux_talkbot.AnswerType> ViewModelAnswerType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> viewModelResultAbnormal = null;
        int viewModelOnStep3MboundView8AndroidColorBrightSkyBlueMboundView8AndroidColorVeryLightPinkThree = 0;
        int viewModelOnStep3ViewGONEViewVISIBLE = 0;
        kotlinx.coroutines.flow.StateFlow<java.lang.String> viewModelHeartRate = null;
        boolean viewModelAnswerTypeEqualsAnswerTypeAGE = false;
        boolean viewModelAnswerTypeEqualsAnswerTypeRIGHTORWRONG = false;
        java.lang.Boolean viewModelMotionGetValue = null;
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> viewModelOnStep3 = null;
        kotlinx.coroutines.flow.StateFlow<java.lang.String> viewModelPrevAnswer = null;
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> viewModelMotion = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelResultAbnormalGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceOnGetValue = false;
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> viewModelResultNormal = null;
        java.lang.String viewModelHeartRateGetValue = null;
        boolean viewModelAnswerTypeEqualsAnswerTypeYESORNO = false;
        android.graphics.drawable.Drawable viewModelVoiceOnMboundView12AndroidDrawableVoiceOnMboundView12AndroidDrawableVoiceOff = null;
        boolean viewModelHeartRateEmpty = false;
        kotlinx.coroutines.flow.StateFlow<java.lang.String> viewModelQuestion = null;
        int viewModelResultNormalViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelOnStep3GetValue = null;
        int viewModelAnswerTypeAnswerTypeNONEViewGONEViewVISIBLE = 0;
        int viewModelResultAbnormalViewVISIBLEViewGONE = 0;
        java.lang.String viewModelTemperatureGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelCanGoPreviousGetValue = false;
        java.lang.Boolean viewModelCanGoPreviousGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceVolumeGetValue = 0;
        boolean viewModelAnswerTypeEqualsAnswerTypeLOCATION = false;
        java.lang.String viewModelPrevAnswerGetValue = null;
        boolean viewModelAnswerTypeEqualsAnswerTypeGENDER = false;
        kotlinx.coroutines.flow.StateFlow<java.lang.String> viewModelTemperature = null;
        boolean viewModelAnswerTypeEqualsAnswerTypeTIMES = false;
        java.lang.String viewModelRespirationGetValue = null;
        java.lang.Boolean viewModelVoiceOnGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelResultNormalGetValue = false;
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> viewModelCanGoPrevious = null;
        boolean viewModelRespirationEmpty = false;
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> viewModelVoiceOn = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelMotionGetValue = false;
        kotlinx.coroutines.flow.StateFlow<java.lang.Integer> viewModelVoiceVolume = null;
        int viewModelOnStep3MboundView10AndroidColorDuskMboundView10AndroidColorCoolGrey = 0;
        int viewModelCanGoPreviousViewVISIBLEViewINVISIBLE = 0;
        boolean viewModelAnswerTypeAnswerTypeNONE = false;
        kotlinx.coroutines.flow.StateFlow<java.lang.String> viewModelRespiration = null;
        int viewModelHeartRateEmptyViewVISIBLEViewGONE = 0;
        int viewModelMotionViewVISIBLEViewINVISIBLE = 0;
        com.iitp.saltlux_talkbot.AnswerType viewModelAnswerTypeGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelOnStep3GetValue = false;
        java.lang.Boolean viewModelResultNormalGetValue = null;
        int viewModelOnStep3MboundView9AndroidColorBlueBlueMboundView9AndroidColorCoolGrey = 0;
        java.lang.Boolean viewModelResultAbnormalGetValue = null;
        java.lang.Integer viewModelVoiceVolumeGetValue = null;
        int viewModelRespirationEmptyViewVISIBLEViewGONE = 0;
        java.lang.String viewModelQuestionGetValue = null;
        com.iitp.signagekiosk.questionnaire.QuestionnaireViewModel viewModel = mViewModel;
        kotlinx.coroutines.flow.StateFlow<com.iitp.saltlux_talkbot.AnswerType> viewModelAnswerType = null;

        if ((dirtyFlags & 0x1dffbL) != 0) {


            if ((dirtyFlags & 0x18001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.resultAbnormal
                        viewModelResultAbnormal = viewModel.getResultAbnormal();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 0, viewModelResultAbnormal);


                    if (viewModelResultAbnormal != null) {
                        // read viewModel.resultAbnormal.getValue()
                        viewModelResultAbnormalGetValue = viewModelResultAbnormal.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.resultAbnormal.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelResultAbnormalGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelResultAbnormalGetValue);
                if((dirtyFlags & 0x18001L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelResultAbnormalGetValue) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.resultAbnormal.getValue()) ? View.VISIBLE : View.GONE
                    viewModelResultAbnormalViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelResultAbnormalGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x18002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.heartRate
                        viewModelHeartRate = viewModel.getHeartRate();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 1, viewModelHeartRate);


                    if (viewModelHeartRate != null) {
                        // read viewModel.heartRate.getValue()
                        viewModelHeartRateGetValue = viewModelHeartRate.getValue();
                    }


                    if (viewModelHeartRateGetValue != null) {
                        // read viewModel.heartRate.getValue().empty
                        viewModelHeartRateEmpty = viewModelHeartRateGetValue.isEmpty();
                    }
                if((dirtyFlags & 0x18002L) != 0) {
                    if(viewModelHeartRateEmpty) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }


                    // read viewModel.heartRate.getValue().empty ? View.VISIBLE : View.GONE
                    viewModelHeartRateEmptyViewVISIBLEViewGONE = ((viewModelHeartRateEmpty) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x18008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.onStep3
                        viewModelOnStep3 = viewModel.getOnStep3();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 3, viewModelOnStep3);


                    if (viewModelOnStep3 != null) {
                        // read viewModel.onStep3.getValue()
                        viewModelOnStep3GetValue = viewModelOnStep3.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onStep3.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelOnStep3GetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelOnStep3GetValue);
                if((dirtyFlags & 0x18008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelOnStep3GetValue) {
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x40000000L;
                            dirtyFlags |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x20000000L;
                            dirtyFlags |= 0x2000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onStep3.getValue()) ? @android:color/bright_sky_blue : @android:color/very_light_pink_three
                    viewModelOnStep3MboundView8AndroidColorBrightSkyBlueMboundView8AndroidColorVeryLightPinkThree = ((androidxDatabindingViewDataBindingSafeUnboxViewModelOnStep3GetValue) ? (getColorFromResource(mboundView8, R.color.bright_sky_blue)) : (getColorFromResource(mboundView8, R.color.very_light_pink_three)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onStep3.getValue()) ? View.GONE : View.VISIBLE
                    viewModelOnStep3ViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelOnStep3GetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onStep3.getValue()) ? @android:color/dusk : @android:color/cool_grey
                    viewModelOnStep3MboundView10AndroidColorDuskMboundView10AndroidColorCoolGrey = ((androidxDatabindingViewDataBindingSafeUnboxViewModelOnStep3GetValue) ? (getColorFromResource(mboundView10, R.color.dusk)) : (getColorFromResource(mboundView10, R.color.cool_grey)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onStep3.getValue()) ? @android:color/blue_blue : @android:color/cool_grey
                    viewModelOnStep3MboundView9AndroidColorBlueBlueMboundView9AndroidColorCoolGrey = ((androidxDatabindingViewDataBindingSafeUnboxViewModelOnStep3GetValue) ? (getColorFromResource(mboundView9, R.color.blue_blue)) : (getColorFromResource(mboundView9, R.color.cool_grey)));
            }
            if ((dirtyFlags & 0x18010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.prevAnswer
                        viewModelPrevAnswer = viewModel.getPrevAnswer();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 4, viewModelPrevAnswer);


                    if (viewModelPrevAnswer != null) {
                        // read viewModel.prevAnswer.getValue()
                        viewModelPrevAnswerGetValue = viewModelPrevAnswer.getValue();
                    }
            }
            if ((dirtyFlags & 0x18020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.motion
                        viewModelMotion = viewModel.getMotion();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 5, viewModelMotion);


                    if (viewModelMotion != null) {
                        // read viewModel.motion.getValue()
                        viewModelMotionGetValue = viewModelMotion.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.motion.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelMotionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelMotionGetValue);
                if((dirtyFlags & 0x18020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelMotionGetValue) {
                            dirtyFlags |= 0x1000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.motion.getValue()) ? View.VISIBLE : View.INVISIBLE
                    viewModelMotionViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelMotionGetValue) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0x18040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.resultNormal
                        viewModelResultNormal = viewModel.getResultNormal();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 6, viewModelResultNormal);


                    if (viewModelResultNormal != null) {
                        // read viewModel.resultNormal.getValue()
                        viewModelResultNormalGetValue = viewModelResultNormal.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.resultNormal.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelResultNormalGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelResultNormalGetValue);
                if((dirtyFlags & 0x18040L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelResultNormalGetValue) {
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.resultNormal.getValue()) ? View.VISIBLE : View.GONE
                    viewModelResultNormalViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelResultNormalGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x18080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.question
                        viewModelQuestion = viewModel.getQuestion();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 7, viewModelQuestion);


                    if (viewModelQuestion != null) {
                        // read viewModel.question.getValue()
                        viewModelQuestionGetValue = viewModelQuestion.getValue();
                    }
            }
            if ((dirtyFlags & 0x18100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.temperature
                        viewModelTemperature = viewModel.getTemperature();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 8, viewModelTemperature);


                    if (viewModelTemperature != null) {
                        // read viewModel.temperature.getValue()
                        viewModelTemperatureGetValue = viewModelTemperature.getValue();
                    }
            }
            if ((dirtyFlags & 0x18200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.canGoPrevious
                        viewModelCanGoPrevious = viewModel.getCanGoPrevious();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 9, viewModelCanGoPrevious);


                    if (viewModelCanGoPrevious != null) {
                        // read viewModel.canGoPrevious.getValue()
                        viewModelCanGoPreviousGetValue = viewModelCanGoPrevious.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.canGoPrevious.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelCanGoPreviousGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelCanGoPreviousGetValue);
                if((dirtyFlags & 0x18200L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelCanGoPreviousGetValue) {
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.canGoPrevious.getValue()) ? View.VISIBLE : View.INVISIBLE
                    viewModelCanGoPreviousViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelCanGoPreviousGetValue) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0x18400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.voiceOn
                        viewModelVoiceOn = viewModel.getVoiceOn();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 10, viewModelVoiceOn);


                    if (viewModelVoiceOn != null) {
                        // read viewModel.voiceOn.getValue()
                        viewModelVoiceOnGetValue = viewModelVoiceOn.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.voiceOn.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceOnGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelVoiceOnGetValue);
                if((dirtyFlags & 0x18400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceOnGetValue) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.voiceOn.getValue()) ? @android:drawable/voice_on : @android:drawable/voice_off
                    viewModelVoiceOnMboundView12AndroidDrawableVoiceOnMboundView12AndroidDrawableVoiceOff = ((androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceOnGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView12.getContext(), R.drawable.voice_on)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView12.getContext(), R.drawable.voice_off)));
            }
            if ((dirtyFlags & 0x18800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.voiceVolume
                        viewModelVoiceVolume = viewModel.getVoiceVolume();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 11, viewModelVoiceVolume);


                    if (viewModelVoiceVolume != null) {
                        // read viewModel.voiceVolume.getValue()
                        viewModelVoiceVolumeGetValue = viewModelVoiceVolume.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.voiceVolume.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceVolumeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelVoiceVolumeGetValue);
            }
            if ((dirtyFlags & 0x19000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.respiration
                        viewModelRespiration = viewModel.getRespiration();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 12, viewModelRespiration);


                    if (viewModelRespiration != null) {
                        // read viewModel.respiration.getValue()
                        viewModelRespirationGetValue = viewModelRespiration.getValue();
                    }


                    if (viewModelRespirationGetValue != null) {
                        // read viewModel.respiration.getValue().empty
                        viewModelRespirationEmpty = viewModelRespirationGetValue.isEmpty();
                    }
                if((dirtyFlags & 0x19000L) != 0) {
                    if(viewModelRespirationEmpty) {
                            dirtyFlags |= 0x10000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000L;
                    }
                }


                    // read viewModel.respiration.getValue().empty ? View.VISIBLE : View.GONE
                    viewModelRespirationEmptyViewVISIBLEViewGONE = ((viewModelRespirationEmpty) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1c000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.answerType
                        viewModelAnswerType = viewModel.getAnswerType();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 14, viewModelAnswerType);


                    if (viewModelAnswerType != null) {
                        // read viewModel.answerType.getValue()
                        viewModelAnswerTypeGetValue = viewModelAnswerType.getValue();
                    }


                    if (viewModelAnswerTypeGetValue != null) {
                        // read viewModel.answerType.getValue().equals(AnswerType.AGE)
                        viewModelAnswerTypeEqualsAnswerTypeAGE = viewModelAnswerTypeGetValue.equals(com.iitp.saltlux_talkbot.AnswerType.AGE);
                        // read viewModel.answerType.getValue().equals(AnswerType.RIGHT_OR_WRONG)
                        viewModelAnswerTypeEqualsAnswerTypeRIGHTORWRONG = viewModelAnswerTypeGetValue.equals(com.iitp.saltlux_talkbot.AnswerType.RIGHT_OR_WRONG);
                        // read viewModel.answerType.getValue().equals(AnswerType.YES_OR_NO)
                        viewModelAnswerTypeEqualsAnswerTypeYESORNO = viewModelAnswerTypeGetValue.equals(com.iitp.saltlux_talkbot.AnswerType.YES_OR_NO);
                        // read viewModel.answerType.getValue().equals(AnswerType.LOCATION)
                        viewModelAnswerTypeEqualsAnswerTypeLOCATION = viewModelAnswerTypeGetValue.equals(com.iitp.saltlux_talkbot.AnswerType.LOCATION);
                        // read viewModel.answerType.getValue().equals(AnswerType.GENDER)
                        viewModelAnswerTypeEqualsAnswerTypeGENDER = viewModelAnswerTypeGetValue.equals(com.iitp.saltlux_talkbot.AnswerType.GENDER);
                        // read viewModel.answerType.getValue().equals(AnswerType.TIMES)
                        viewModelAnswerTypeEqualsAnswerTypeTIMES = viewModelAnswerTypeGetValue.equals(com.iitp.saltlux_talkbot.AnswerType.TIMES);
                    }
                    // read viewModel.answerType.getValue() == AnswerType.NONE
                    viewModelAnswerTypeAnswerTypeNONE = (viewModelAnswerTypeGetValue) == (com.iitp.saltlux_talkbot.AnswerType.NONE);
                if((dirtyFlags & 0x1c000L) != 0) {
                    if(viewModelAnswerTypeAnswerTypeNONE) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }


                    // read viewModel.answerType.getValue() == AnswerType.NONE ? View.GONE : View.VISIBLE
                    viewModelAnswerTypeAnswerTypeNONEViewGONEViewVISIBLE = ((viewModelAnswerTypeAnswerTypeNONE) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x18200L) != 0) {
            // api target 1

            this.constraintLayout.setVisibility(viewModelCanGoPreviousViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x10000L) != 0) {
            // api target 1

            this.imageView5.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x18008L) != 0) {
            // api target 1

            this.mboundView10.setTextColor(viewModelOnStep3MboundView10AndroidColorDuskMboundView10AndroidColorCoolGrey);
            this.mboundView2.setVisibility(viewModelOnStep3ViewGONEViewVISIBLE);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView8, androidx.databinding.adapters.Converters.convertColorToDrawable(viewModelOnStep3MboundView8AndroidColorBrightSkyBlueMboundView8AndroidColorVeryLightPinkThree));
            this.mboundView9.setTextColor(viewModelOnStep3MboundView9AndroidColorBlueBlueMboundView9AndroidColorCoolGrey);
        }
        if ((dirtyFlags & 0x18400L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView12, viewModelVoiceOnMboundView12AndroidDrawableVoiceOnMboundView12AndroidDrawableVoiceOff);
        }
        if ((dirtyFlags & 0x18100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, viewModelTemperatureGetValue);
        }
        if ((dirtyFlags & 0x19000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, viewModelRespirationGetValue);
            this.mboundView15.setVisibility(viewModelRespirationEmptyViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x18002L) != 0) {
            // api target 1

            this.mboundView17.setVisibility(viewModelHeartRateEmptyViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView16, viewModelHeartRateGetValue);
        }
        if ((dirtyFlags & 0x18020L) != 0) {
            // api target 1

            this.mboundView18.setVisibility(viewModelMotionViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x1c000L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelAnswerTypeAnswerTypeNONEViewGONEViewVISIBLE);
            this.mboundView5.setIsVisible(viewModelAnswerTypeEqualsAnswerTypeAGE);
            this.mboundView51.setIsVisible(viewModelAnswerTypeEqualsAnswerTypeGENDER);
            this.mboundView52.setIsVisible(viewModelAnswerTypeEqualsAnswerTypeLOCATION);
            this.mboundView53.setIsVisible(viewModelAnswerTypeEqualsAnswerTypeTIMES);
            this.mboundView54.setIsVisible(viewModelAnswerTypeEqualsAnswerTypeYESORNO);
            this.mboundView55.setIsVisible(viewModelAnswerTypeEqualsAnswerTypeRIGHTORWRONG);
        }
        if ((dirtyFlags & 0x18001L) != 0) {
            // api target 1

            this.resultAbnormal.getRoot().setVisibility(viewModelResultAbnormalViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x18000L) != 0) {
            // api target 1

            this.resultAbnormal.setViewModel(viewModel);
            this.resultNormal.setViewModel(viewModel);
        }
        if ((dirtyFlags & 0x18040L) != 0) {
            // api target 1

            this.resultNormal.getRoot().setVisibility(viewModelResultNormalViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x18010L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView31, viewModelPrevAnswerGetValue);
        }
        if ((dirtyFlags & 0x18080L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView32, viewModelQuestionGetValue);
        }
        if ((dirtyFlags & 0x18800L) != 0) {
            // api target 1

            com.iitp.signagekiosk.questionnaire.QuestionnaireFragmentKt.setVolume(this.voice, androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceVolumeGetValue);
        }
        executeBindingsOn(mboundView5);
        executeBindingsOn(mboundView51);
        executeBindingsOn(mboundView52);
        executeBindingsOn(mboundView53);
        executeBindingsOn(mboundView54);
        executeBindingsOn(mboundView55);
        executeBindingsOn(resultNormal);
        executeBindingsOn(resultAbnormal);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.iitp.signagekiosk.questionnaire.QuestionnaireViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onClickToHome();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.resultAbnormal
        flag 1 (0x2L): viewModel.heartRate
        flag 2 (0x3L): resultAbnormal
        flag 3 (0x4L): viewModel.onStep3
        flag 4 (0x5L): viewModel.prevAnswer
        flag 5 (0x6L): viewModel.motion
        flag 6 (0x7L): viewModel.resultNormal
        flag 7 (0x8L): viewModel.question
        flag 8 (0x9L): viewModel.temperature
        flag 9 (0xaL): viewModel.canGoPrevious
        flag 10 (0xbL): viewModel.voiceOn
        flag 11 (0xcL): viewModel.voiceVolume
        flag 12 (0xdL): viewModel.respiration
        flag 13 (0xeL): resultNormal
        flag 14 (0xfL): viewModel.answerType
        flag 15 (0x10L): viewModel
        flag 16 (0x11L): null
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onStep3.getValue()) ? @android:color/bright_sky_blue : @android:color/very_light_pink_three
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onStep3.getValue()) ? @android:color/bright_sky_blue : @android:color/very_light_pink_three
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onStep3.getValue()) ? View.GONE : View.VISIBLE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onStep3.getValue()) ? View.GONE : View.VISIBLE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.voiceOn.getValue()) ? @android:drawable/voice_on : @android:drawable/voice_off
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.voiceOn.getValue()) ? @android:drawable/voice_on : @android:drawable/voice_off
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.resultNormal.getValue()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.resultNormal.getValue()) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): viewModel.answerType.getValue() == AnswerType.NONE ? View.GONE : View.VISIBLE
        flag 26 (0x1bL): viewModel.answerType.getValue() == AnswerType.NONE ? View.GONE : View.VISIBLE
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.resultAbnormal.getValue()) ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.resultAbnormal.getValue()) ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onStep3.getValue()) ? @android:color/dusk : @android:color/cool_grey
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onStep3.getValue()) ? @android:color/dusk : @android:color/cool_grey
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.canGoPrevious.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.canGoPrevious.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 33 (0x22L): viewModel.heartRate.getValue().empty ? View.VISIBLE : View.GONE
        flag 34 (0x23L): viewModel.heartRate.getValue().empty ? View.VISIBLE : View.GONE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.motion.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.motion.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onStep3.getValue()) ? @android:color/blue_blue : @android:color/cool_grey
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onStep3.getValue()) ? @android:color/blue_blue : @android:color/cool_grey
        flag 39 (0x28L): viewModel.respiration.getValue().empty ? View.VISIBLE : View.GONE
        flag 40 (0x29L): viewModel.respiration.getValue().empty ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}