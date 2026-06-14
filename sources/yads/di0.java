package yads;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class di0 implements DivTypefaceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f109932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f109933b;

    public di0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f109932a = applicationContext != null ? applicationContext : context;
        this.f109933b = lf.i.a(new ci0(this));
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getBold() {
        Typeface typeface;
        kv0 kv0Var = (kv0) this.f109933b.getValue();
        return (kv0Var == null || (typeface = kv0Var.f112872d) == null) ? Typeface.DEFAULT_BOLD : typeface;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getLight() {
        kv0 kv0Var = (kv0) this.f109933b.getValue();
        if (kv0Var != null) {
            return kv0Var.f112869a;
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getMedium() {
        kv0 kv0Var = (kv0) this.f109933b.getValue();
        if (kv0Var != null) {
            return kv0Var.f112871c;
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getRegular() {
        kv0 kv0Var = (kv0) this.f109933b.getValue();
        if (kv0Var != null) {
            return kv0Var.f112870b;
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public /* synthetic */ Typeface getTypefaceFor(int i10) {
        return e7.a.a(this, i10);
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public /* synthetic */ boolean isVariable() {
        return e7.a.b(this);
    }
}
