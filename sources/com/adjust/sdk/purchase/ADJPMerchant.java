package com.adjust.sdk.purchase;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class ADJPMerchant extends HandlerThread implements OnADJPRequestFinished {
    private ADJPConfig config;
    private InternalHandler internalHandler;
    private ADJPRequestHandler requestWorker;

    private static final class InternalHandler extends Handler {
        private static final int VERIFY = 72400;
        private final WeakReference<ADJPMerchant> merchantReference;

        protected InternalHandler(Looper looper, ADJPMerchant aDJPMerchant) {
            super(looper);
            this.merchantReference = new WeakReference<>(aDJPMerchant);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            ADJPMerchant aDJPMerchant = this.merchantReference.get();
            if (aDJPMerchant != null && message.arg1 == VERIFY) {
                aDJPMerchant.verifyInternal((ADJPMerchantItem) message.obj);
            }
        }
    }

    public ADJPMerchant() {
        super(ADJPConstants.TAG, 1);
        setDaemon(true);
        start();
        this.requestWorker = new ADJPRequestHandler(this);
        this.internalHandler = new InternalHandler(getLooper(), this);
    }

    private void addString(Map<String, String> map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void verifyInternal(ADJPMerchantItem aDJPMerchantItem) {
        HashMap map = new HashMap();
        addString(map, ADJPConstants.KEY_SDK_VERSION, this.config.getClientSdk());
        addString(map, "app_token", this.config.getAppToken());
        addString(map, ADJPConstants.KEY_ENVIRONMENT, this.config.getEnvironment());
        addString(map, ADJPConstants.KEY_GPS_PRODUCT_ID, aDJPMerchantItem.getItemSku());
        addString(map, ADJPConstants.KEY_GPS_PURCHASE_TOKEN, aDJPMerchantItem.getItemToken());
        addString(map, ADJPConstants.KEY_GPS_DEVELOPER_PAYLOAD, aDJPMerchantItem.getDeveloperPayload());
        this.requestWorker.sendPackage(new ADJPVerificationPackage(map, aDJPMerchantItem.getCallback()));
    }

    public void initialize(ADJPConfig aDJPConfig) {
        this.config = aDJPConfig;
    }

    @Override // com.adjust.sdk.purchase.OnADJPRequestFinished
    public void requestFinished(Map<String, Object> map, final ADJPVerificationPackage aDJPVerificationPackage) {
        final ADJPVerificationInfo aDJPVerificationInfo = new ADJPVerificationInfo((String) map.get(ADJPConstants.KEY_ADJUST_MESSAGE), (Integer) map.get(ADJPConstants.KEY_ADJUST_STATUS_CODE), (ADJPVerificationState) map.get(ADJPConstants.KEY_ADJUST_STATE));
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.adjust.sdk.purchase.ADJPMerchant.1
            @Override // java.lang.Runnable
            public void run() {
                aDJPVerificationPackage.getCallback().onVerificationFinished(aDJPVerificationInfo);
            }
        });
    }

    public void verifyPurchase(String str, String str2, String str3, OnADJPVerificationFinished onADJPVerificationFinished) {
        ADJPMerchantItem aDJPMerchantItem = new ADJPMerchantItem(str, str2, str3, onADJPVerificationFinished);
        if (aDJPMerchantItem.isValid(null)) {
            Message messageObtain = Message.obtain();
            messageObtain.arg1 = 72400;
            messageObtain.obj = aDJPMerchantItem;
            this.internalHandler.sendMessage(messageObtain);
            return;
        }
        if (aDJPMerchantItem.getCallback() != null) {
            ADJPVerificationInfo aDJPVerificationInfo = new ADJPVerificationInfo();
            aDJPVerificationInfo.setMessage(null);
            aDJPVerificationInfo.setStatusCode(-1);
            aDJPVerificationInfo.setVerificationState(ADJPVerificationState.ADJPVerificationStateNotVerified);
            aDJPMerchantItem.getCallback().onVerificationFinished(aDJPVerificationInfo);
        }
    }
}
