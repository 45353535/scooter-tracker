package com.pubmatic.sdk.common.utility;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class POBAlertDialog {

    public interface POBDialogListener {
        void onCancel(DialogInterface dialogInterface, int i10);

        void onSuccess(DialogInterface dialogInterface, int i10);
    }

    class a implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBDialogListener f62538a;

        a(POBDialogListener pOBDialogListener) {
            this.f62538a = pOBDialogListener;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f62538a.onCancel(dialogInterface, 0);
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBDialogListener f62539a;

        b(POBDialogListener pOBDialogListener) {
            this.f62539a = pOBDialogListener;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f62539a.onCancel(dialogInterface, i10);
        }
    }

    class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBDialogListener f62540a;

        c(POBDialogListener pOBDialogListener) {
            this.f62540a = pOBDialogListener;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f62540a.onSuccess(dialogInterface, i10);
        }
    }

    @Nullable
    public static AlertDialog.Builder build(Context context, String str, String str2, POBDialogListener pOBDialogListener) {
        boolean z10;
        try {
            z10 = !((Activity) context).isFinishing();
        } catch (Exception unused) {
            z10 = true;
        }
        if (context == null || !z10) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
        builder.setTitle(str).setMessage(str2).setCancelable(true).setPositiveButton("YES", new c(pOBDialogListener)).setNegativeButton("NO", new b(pOBDialogListener)).setOnCancelListener(new a(pOBDialogListener)).create();
        return builder;
    }
}
