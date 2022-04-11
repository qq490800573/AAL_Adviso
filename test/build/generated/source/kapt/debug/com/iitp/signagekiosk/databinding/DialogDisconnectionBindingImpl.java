package com.iitp.signagekiosk.databinding;
import com.iitp.signagekiosk.R;
import com.iitp.signagekiosk.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogDisconnectionBindingImpl extends DialogDisconnectionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView15, 3);
        sViewsWithIds.put(R.id.imageView19, 4);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogDisconnectionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private DialogDisconnectionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.frameLayout.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.textView28.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.connection == variableId) {
            setConnection((com.iitp.signagekiosk.ConnectionStatus) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setConnection(@Nullable com.iitp.signagekiosk.ConnectionStatus Connection) {
        this.mConnection = Connection;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.connection);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String connectionConnectionStatusNETWORKDISCONNECTTextView28AndroidStringErrorNetworkDisconnectionTextView28AndroidStringErrorSensorDisconnection = null;
        com.iitp.signagekiosk.ConnectionStatus connection = mConnection;
        boolean connectionConnectionStatusNETWORKDISCONNECT = false;
        java.lang.String connectionConnectionStatusNETWORKDISCONNECTMboundView2AndroidStringErrorNetworkDisconnection2MboundView2AndroidStringErrorSensorDisconnection2 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                // read connection == ConnectionStatus.NETWORK_DISCONNECT
                connectionConnectionStatusNETWORKDISCONNECT = (connection) == (com.iitp.signagekiosk.ConnectionStatus.NETWORK_DISCONNECT);
            if((dirtyFlags & 0x3L) != 0) {
                if(connectionConnectionStatusNETWORKDISCONNECT) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x10L;
                }
            }


                // read connection == ConnectionStatus.NETWORK_DISCONNECT ? @android:string/error_network_disconnection : @android:string/error_sensor_disconnection
                connectionConnectionStatusNETWORKDISCONNECTTextView28AndroidStringErrorNetworkDisconnectionTextView28AndroidStringErrorSensorDisconnection = ((connectionConnectionStatusNETWORKDISCONNECT) ? (textView28.getResources().getString(R.string.error_network_disconnection)) : (textView28.getResources().getString(R.string.error_sensor_disconnection)));
                // read connection == ConnectionStatus.NETWORK_DISCONNECT ? @android:string/error_network_disconnection_2 : @android:string/error_sensor_disconnection_2
                connectionConnectionStatusNETWORKDISCONNECTMboundView2AndroidStringErrorNetworkDisconnection2MboundView2AndroidStringErrorSensorDisconnection2 = ((connectionConnectionStatusNETWORKDISCONNECT) ? (mboundView2.getResources().getString(R.string.error_network_disconnection_2)) : (mboundView2.getResources().getString(R.string.error_sensor_disconnection_2)));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, connectionConnectionStatusNETWORKDISCONNECTMboundView2AndroidStringErrorNetworkDisconnection2MboundView2AndroidStringErrorSensorDisconnection2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView28, connectionConnectionStatusNETWORKDISCONNECTTextView28AndroidStringErrorNetworkDisconnectionTextView28AndroidStringErrorSensorDisconnection);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): connection
        flag 1 (0x2L): null
        flag 2 (0x3L): connection == ConnectionStatus.NETWORK_DISCONNECT ? @android:string/error_network_disconnection : @android:string/error_sensor_disconnection
        flag 3 (0x4L): connection == ConnectionStatus.NETWORK_DISCONNECT ? @android:string/error_network_disconnection : @android:string/error_sensor_disconnection
        flag 4 (0x5L): connection == ConnectionStatus.NETWORK_DISCONNECT ? @android:string/error_network_disconnection_2 : @android:string/error_sensor_disconnection_2
        flag 5 (0x6L): connection == ConnectionStatus.NETWORK_DISCONNECT ? @android:string/error_network_disconnection_2 : @android:string/error_sensor_disconnection_2
    flag mapping end*/
    //end
}