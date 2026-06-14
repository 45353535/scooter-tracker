package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes7.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    @VisibleForTesting
    protected int zaa = 0;

    @NonNull
    public static Intent zaa(@NonNull Context context, @NonNull PendingIntent pendingIntent, int i10, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", z10);
        return intent;
    }

    private final void zab() {
        GoogleApiActivity googleApiActivity;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            GoogleApiAvailability.getInstance().showErrorDialogFragment(this, ((Integer) Preconditions.checkNotNull(num)).intValue(), 2, this);
            this.zaa = 1;
            return;
        }
        try {
            googleApiActivity = this;
        } catch (ActivityNotFoundException e10) {
            e = e10;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
        }
        try {
            googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            googleApiActivity.zaa = 1;
        } catch (ActivityNotFoundException e12) {
            e = e12;
            if (extras.getBoolean("notify_manager", true)) {
                GoogleApiManager.zak(this).zax(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String strConcat = "Activity not found while launching " + pendingIntent.toString() + ".";
                if (Build.FINGERPRINT.contains("generic")) {
                    strConcat = strConcat.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e("GoogleApiActivity", strConcat, e);
            }
            googleApiActivity.zaa = 1;
            finish();
        } catch (IntentSender.SendIntentException e13) {
            e = e13;
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, @NonNull Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.zaa = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                GoogleApiManager googleApiManagerZak = GoogleApiManager.zak(this);
                if (i11 == -1) {
                    googleApiManagerZak.zay();
                } else if (i11 == 0) {
                    googleApiManagerZak.zax(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.zaa = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        this.zaa = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zaa = bundle.getInt("resolution");
        }
        if (this.zaa != 1) {
            zab();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putInt("resolution", this.zaa);
        super.onSaveInstanceState(bundle);
    }
}
