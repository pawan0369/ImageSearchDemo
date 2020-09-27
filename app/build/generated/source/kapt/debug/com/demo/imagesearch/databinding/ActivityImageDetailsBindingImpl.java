package com.demo.imagesearch.databinding;
import com.demo.imagesearch.R;
import com.demo.imagesearch.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityImageDetailsBindingImpl extends ActivityImageDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.et_background, 3);
        sViewsWithIds.put(R.id.btn_submit, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityImageDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityImageDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.button.MaterialButton) bindings[4]
            , (android.view.View) bindings[3]
            , (android.widget.EditText) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            );
        this.etComment.setTag(null);
        this.ivImage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.vm == variableId) {
            setVm((com.demo.imagesearch.ui.dashboard.viewmodel.ImageDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.demo.imagesearch.ui.dashboard.viewmodel.ImageDetailsViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmResultComment((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmFinalResult((androidx.lifecycle.LiveData<com.demo.imagesearch.ui.dashboard.model.ImageResult>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmResultComment(androidx.lifecycle.LiveData<java.lang.String> VmResultComment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmFinalResult(androidx.lifecycle.LiveData<com.demo.imagesearch.ui.dashboard.model.ImageResult> VmFinalResult, int fieldId) {
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
        com.demo.imagesearch.ui.dashboard.viewmodel.ImageDetailsViewModel vm = mVm;
        androidx.lifecycle.LiveData<java.lang.String> vmResultComment = null;
        java.lang.String vmFinalResultLink = null;
        java.lang.String vmResultCommentGetValue = null;
        com.demo.imagesearch.ui.dashboard.model.ImageResult vmFinalResultGetValue = null;
        androidx.lifecycle.LiveData<com.demo.imagesearch.ui.dashboard.model.ImageResult> vmFinalResult = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (vm != null) {
                        // read vm.resultComment
                        vmResultComment = vm.resultComment;
                    }
                    updateLiveDataRegistration(0, vmResultComment);


                    if (vmResultComment != null) {
                        // read vm.resultComment.getValue()
                        vmResultCommentGetValue = vmResultComment.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (vm != null) {
                        // read vm.finalResult
                        vmFinalResult = vm.finalResult;
                    }
                    updateLiveDataRegistration(1, vmFinalResult);


                    if (vmFinalResult != null) {
                        // read vm.finalResult.getValue()
                        vmFinalResultGetValue = vmFinalResult.getValue();
                    }


                    if (vmFinalResultGetValue != null) {
                        // read vm.finalResult.getValue().link
                        vmFinalResultLink = vmFinalResultGetValue.getLink();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etComment, vmResultCommentGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.demo.imagesearch.util.ImageViewBinderKt.setImageFormUrl(this.ivImage, vmFinalResultLink);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.resultComment
        flag 1 (0x2L): vm.finalResult
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}