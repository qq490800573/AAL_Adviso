package com.iitp.signagekiosk.databinding;
import com.iitp.signagekiosk.R;
import com.iitp.signagekiosk.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoadingBindingImpl extends FragmentLoadingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.title_container, 3);
        sViewsWithIds.put(R.id.imageView2, 4);
        sViewsWithIds.put(R.id.textView, 5);
        sViewsWithIds.put(R.id.progress_content, 6);
        sViewsWithIds.put(R.id.ic_loading, 7);
        sViewsWithIds.put(R.id.progress_container, 8);
        sViewsWithIds.put(R.id.textView6, 9);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLoadingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentLoadingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ProgressBar) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.Group) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            );
        this.frameLayout.setTag(null);
        this.progressBar.setTag(null);
        this.textView7.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((com.iitp.signagekiosk.loading.LoadingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.iitp.signagekiosk.loading.LoadingViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelProgress((kotlinx.coroutines.flow.StateFlow<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewModelRemainSecond((kotlinx.coroutines.flow.StateFlow<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelProgress(kotlinx.coroutines.flow.StateFlow<java.lang.Integer> ViewModelProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRemainSecond(kotlinx.coroutines.flow.StateFlow<java.lang.Integer> ViewModelRemainSecond, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        kotlinx.coroutines.flow.StateFlow<java.lang.Integer> viewModelProgress = null;
        int viewModelProgressMax = 0;
        kotlinx.coroutines.flow.StateFlow<java.lang.Integer> viewModelRemainSecond = null;
        java.lang.Integer viewModelRemainSecondGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelProgressGetValue = 0;
        java.lang.String textView7AndroidStringLoadingProgressTextViewModelRemainSecond = null;
        com.iitp.signagekiosk.loading.LoadingViewModel viewModel = mViewModel;
        java.lang.Integer viewModelProgressGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.progress
                        viewModelProgress = viewModel.getProgress();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 0, viewModelProgress);


                    if (viewModelProgress != null) {
                        // read viewModel.progress.getValue()
                        viewModelProgressGetValue = viewModelProgress.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.progress.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelProgressGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelProgressGetValue);
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.progressMax
                        viewModelProgressMax = viewModel.getProgressMax();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.remainSecond
                        viewModelRemainSecond = viewModel.getRemainSecond();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 1, viewModelRemainSecond);


                    if (viewModelRemainSecond != null) {
                        // read viewModel.remainSecond.getValue()
                        viewModelRemainSecondGetValue = viewModelRemainSecond.getValue();
                    }


                    // read @android:string/loading_progress_text
                    textView7AndroidStringLoadingProgressTextViewModelRemainSecond = textView7.getResources().getString(R.string.loading_progress_text, viewModelRemainSecondGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.progressBar.setMax(viewModelProgressMax);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.progressBar.setProgress(androidxDatabindingViewDataBindingSafeUnboxViewModelProgressGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView7, textView7AndroidStringLoadingProgressTextViewModelRemainSecond);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.progress
        flag 1 (0x2L): viewModel.remainSecond
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}