package f1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b7 extends l4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final boolean b(ig igVar, View view, MotionEvent motionEvent) {
        if (igVar != null) {
            Intrinsics.checkNotNull(motionEvent);
            igVar.b(motionEvent);
        }
        return motionEvent.getAction() == 2;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(@NotNull WebViewClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        super.setWebViewClient(client);
        final ig igVarB = client instanceof w7 ? ((w7) client).b() : null;
        setOnTouchListener(new View.OnTouchListener() { // from class: f1.a7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return b7.b(igVarB, view, motionEvent);
            }
        });
    }
}
