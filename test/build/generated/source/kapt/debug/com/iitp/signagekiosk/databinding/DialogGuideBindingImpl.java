package com.iitp.signagekiosk.databinding;
import com.iitp.signagekiosk.R;
import com.iitp.signagekiosk.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogGuideBindingImpl extends DialogGuideBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView3, 4);
        sViewsWithIds.put(R.id.textView4, 5);
        sViewsWithIds.put(R.id.frameLayout2, 6);
        sViewsWithIds.put(R.id.constraintLayout3, 7);
        sViewsWithIds.put(R.id.imageView4, 8);
        sViewsWithIds.put(R.id.constraintLayout2, 9);
        sViewsWithIds.put(R.id.imageView12, 10);
        sViewsWithIds.put(R.id.constraintLayout4, 11);
        sViewsWithIds.put(R.id.imageView13, 12);
        sViewsWithIds.put(R.id.constraintLayout5, 13);
        sViewsWithIds.put(R.id.imageView14, 14);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogGuideBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private DialogGuideBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.FrameLayout) bindings[6]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            );
        this.frameLayout.setTag(null);
        this.imageView3.setTag(null);
        this.mboundView2 = (androidx.cardview.widget.CardView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.iitp.signagekiosk.guide.GuideViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.iitp.signagekiosk.guide.GuideViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDrawableResId((kotlinx.coroutines.flow.StateFlow<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewModelWarningResId((kotlinx.coroutines.flow.StateFlow<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeViewModelWarningTagVisible((kotlinx.coroutines.flow.StateFlow<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelDrawableResId(kotlinx.coroutines.flow.StateFlow<java.lang.Integer> ViewModelDrawableResId, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWarningResId(kotlinx.coroutines.flow.StateFlow<java.lang.Integer> ViewModelWarningResId, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWarningTagVisible(kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> ViewModelWarningTagVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        kotlinx.coroutines.flow.StateFlow<java.lang.Integer> viewModelDrawableResId = null;
        int viewModelWarningTagVisibleViewVISIBLEViewGONE = 0;
        kotlinx.coroutines.flow.StateFlow<java.lang.Integer> viewModelWarningResId = null;
        android.graphics.drawable.Drawable contextCompatGetDrawableContextViewModelDrawableResId = null;
        java.lang.Boolean viewModelWarningTagVisibleGetValue = null;
        java.lang.String contextGetStringViewModelWarningResId = null;
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> viewModelWarningTagVisible = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelDrawableResIdGetValue = 0;
        java.lang.Integer viewModelWarningResIdGetValue = null;
        com.iitp.signagekiosk.guide.GuideViewModel viewModel = mViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelWarningTagVisibleGetValue = false;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelWarningResIdGetValue = 0;
        java.lang.Integer viewModelDrawableResIdGetValue = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.drawableResId
                        viewModelDrawableResId = viewModel.getDrawableResId();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 0, viewModelDrawableResId);


                    if (viewModelDrawableResId != null) {
                        // read viewModel.drawableResId.getValue()
                        viewModelDrawableResIdGetValue = viewModelDrawableResId.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.drawableResId.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelDrawableResIdGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelDrawableResIdGetValue);


                    // read ContextCompat.getDrawable(context, androidx.databinding.ViewDataBinding.safeUnbox(viewModel.drawableResId.getValue()))
                    contextCompatGetDrawableContextViewModelDrawableResId = androidx.core.content.ContextCompat.getDrawable(getRoot().getContext(), androidxDatabindingViewDataBindingSafeUnboxViewModelDrawableResIdGetValue);
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.warningResId
                        viewModelWarningResId = viewModel.getWarningResId();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 1, viewModelWarningResId);


                    if (viewModelWarningResId != null) {
                        // read viewModel.warningResId.getValue()
                        viewModelWarningResIdGetValue = viewModelWarningResId.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.warningResId.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelWarningResIdGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelWarningResIdGetValue);


                    // read context.getString(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.warningResId.getValue()))
                    contextGetStringViewModelWarningResId = getRoot().getContext().getString(androidxDatabindingViewDataBindingSafeUnboxViewModelWarningResIdGetValue);
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.warningTagVisible
                        viewModelWarningTagVisible = viewModel.getWarningTagVisible();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 2, viewModelWarningTagVisible);


                    if (viewModelWarningTagVisible != null) {
                        // read viewModel.warningTagVisible.getValue()
                        viewModelWarningTagVisibleGetValue = viewModelWarningTagVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.warningTagVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelWarningTagVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelWarningTagVisibleGetValue);
                if((dirtyFlags & 0x1cL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelWarningTagVisibleGetValue) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.warningTagVisible.getValue()) ? View.VISIBLE : View.GONE
                    viewModelWarningTagVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelWarningTagVisibleGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imageView3, contextCompatGetDrawableContextViewModelDrawableResId);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelWarningTagVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, contextGetStringViewModelWarningResId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.drawableResId
        flag 1 (0x2L): viewModel.warningResId
        flag 2 (0x3L): viewModel.warningTagVisible
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.warningTagVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.warningTagVisible.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}