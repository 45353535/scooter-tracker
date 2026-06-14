package net.pubnative.lite.sdk.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import net.pubnative.lite.sdk.HyBid;

/* JADX INFO: loaded from: classes3.dex */
public class PNAdvertisingIdClient {
    private static final String TAG = "PNAdvertisingIdClient";
    protected Handler mHadler;
    protected Listener mListener;

    public static class AdInfo {
        private final String mAdvertisingId;
        private final boolean mLimitAdTrackingEnabled;

        AdInfo(String str, boolean z10) {
            this.mAdvertisingId = str;
            this.mLimitAdTrackingEnabled = z10;
        }

        public String getId() {
            return this.mAdvertisingId;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.mLimitAdTrackingEnabled;
        }
    }

    protected static class AdvertisingConnection implements ServiceConnection {
        boolean retrieved = false;
        private final LinkedBlockingQueue<IBinder> queue = new LinkedBlockingQueue<>(1);

        protected AdvertisingConnection() {
        }

        public IBinder getBinder() {
            if (this.retrieved) {
                throw new IllegalStateException();
            }
            this.retrieved = true;
            return this.queue.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.queue.put(iBinder);
            } catch (InterruptedException e10) {
                HyBid.reportException((Exception) e10);
                Log.e(PNAdvertisingIdClient.TAG, "Error: can't connect to AdvertisingId service", e10);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    protected static class AdvertisingInterface implements IInterface {
        private final IBinder binder;

        public AdvertisingInterface(IBinder iBinder) {
            this.binder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.binder;
        }

        public String getId() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.binder.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } catch (Exception e10) {
                    HyBid.reportException(e10);
                    Log.e(PNAdvertisingIdClient.TAG, "Error: Can't read AdvertisingId from the service", e10);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return null;
                }
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public boolean isLimitAdTrackingEnabled(boolean z10) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z10 ? 1 : 0);
                this.binder.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } catch (Exception e10) {
                HyBid.reportException(e10);
                Log.e(PNAdvertisingIdClient.TAG, "Error: Can't get is limit Ad tracking enabled", e10);
                return false;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public interface Listener {
        void onPNAdvertisingIdFinish(String str, Boolean bool);
    }

    protected void getAdvertisingId(final Context context) {
        new Thread(new Runnable() { // from class: net.pubnative.lite.sdk.utils.PNAdvertisingIdClient.1
            @Override // java.lang.Runnable
            public void run() {
                AdInfo adInfo;
                boolean zIsLimitAdTrackingEnabled;
                Context context2;
                String id2 = null;
                try {
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    AdvertisingConnection advertisingConnection = new AdvertisingConnection();
                    try {
                        try {
                            if (context.bindService(intent, advertisingConnection, 1)) {
                                AdvertisingInterface advertisingInterface = new AdvertisingInterface(advertisingConnection.getBinder());
                                adInfo = new AdInfo(advertisingInterface.getId(), advertisingInterface.isLimitAdTrackingEnabled(true));
                            } else {
                                adInfo = null;
                            }
                        } catch (Exception e10) {
                            HyBid.reportException(e10);
                            Log.e(PNAdvertisingIdClient.TAG, "getAdvertisingIdInfo - Error: " + e10);
                            context2 = context;
                            adInfo = null;
                        }
                        try {
                            context2 = context;
                            context2.unbindService(advertisingConnection);
                        } catch (Exception e11) {
                            e = e11;
                            HyBid.reportException(e);
                            Log.e(PNAdvertisingIdClient.TAG, "getAdvertisingIdInfo - Error: " + e);
                        }
                    } catch (Throwable th2) {
                        context.unbindService(advertisingConnection);
                        throw th2;
                    }
                } catch (Exception e12) {
                    e = e12;
                    adInfo = null;
                }
                if (adInfo != null) {
                    zIsLimitAdTrackingEnabled = adInfo.isLimitAdTrackingEnabled();
                    if (zIsLimitAdTrackingEnabled) {
                        Log.i(PNAdvertisingIdClient.TAG, "Error: cannot get advertising id, limit ad tracking is enabled");
                    } else {
                        id2 = adInfo.getId();
                    }
                } else {
                    zIsLimitAdTrackingEnabled = false;
                }
                PNAdvertisingIdClient.this.invokeOnFinish(id2, zIsLimitAdTrackingEnabled);
            }
        }).start();
    }

    protected void invokeOnFinish(final String str, final boolean z10) {
        this.mHadler.post(new Runnable() { // from class: net.pubnative.lite.sdk.utils.PNAdvertisingIdClient.2
            @Override // java.lang.Runnable
            public void run() {
                Listener listener = PNAdvertisingIdClient.this.mListener;
                if (listener != null) {
                    listener.onPNAdvertisingIdFinish(str, Boolean.valueOf(z10));
                }
            }
        });
    }

    public void request(Context context, Listener listener) {
        this.mListener = listener;
        this.mHadler = new Handler(Looper.getMainLooper());
        getAdvertisingId(context);
    }
}
