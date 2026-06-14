package yads;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.webkit.internal.AssetHelper;
import com.yandex.mobile.ads.R$string;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class b90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntegrationInspectorActivity f108946a;

    public b90(IntegrationInspectorActivity integrationInspectorActivity) {
        this.f108946a = integrationInspectorActivity;
    }

    public static final void a(DialogInterface dialogInterface, int i10) {
    }

    public static final void b(DialogInterface dialogInterface, int i10) {
    }

    public final void a(z80 z80Var) {
        if (z80Var instanceof w80) {
            Toast.makeText(this.f108946a, ((w80) z80Var).f117340a, 0).show();
            return;
        }
        if (z80Var instanceof y80) {
            a(((y80) z80Var).f118110a);
            return;
        }
        if (z80Var instanceof x80) {
            Uri uri = ((x80) z80Var).f117735a;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
            this.f108946a.startActivity(intent);
            return;
        }
        if (z80Var instanceof v80) {
            a(this.f108946a.getString(R$string.logging_is_disabled), this.f108946a.getString(R$string.do_you_want_to_enable_logging), new a90(this));
        } else if (z80Var instanceof u80) {
            this.f108946a.finishAfterTransition();
        }
    }

    public static final void a(Function0 function0, DialogInterface dialogInterface, int i10) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void a(String str) {
        new AlertDialog.Builder(this.f108946a).setMessage(str).setPositiveButton(this.f108946a.getString(R$string.ok), new DialogInterface.OnClickListener() { // from class: yads.j3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                b90.b(dialogInterface, i10);
            }
        }).show();
    }

    public final void a(String str, String str2, final a90 a90Var) {
        new AlertDialog.Builder(this.f108946a).setTitle(str).setMessage(str2).setPositiveButton(this.f108946a.getString(R$string.yes), new DialogInterface.OnClickListener() { // from class: yads.h3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                b90.a(a90Var, dialogInterface, i10);
            }
        }).setNegativeButton(this.f108946a.getString(R$string.no), new DialogInterface.OnClickListener() { // from class: yads.i3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                b90.a(dialogInterface, i10);
            }
        }).show();
    }
}
