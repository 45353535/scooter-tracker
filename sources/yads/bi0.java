package yads;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;

/* JADX INFO: loaded from: classes4.dex */
public final class bi0 implements DivTypefaceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dv0 f109011a;

    public /* synthetic */ bi0(Context context) {
        this(new dv0(context.getApplicationContext()));
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getBold() {
        Typeface typefaceA = this.f109011a.f110085b.a(ev0.f110471b);
        return typefaceA == null ? DivTypefaceProvider.DEFAULT.getBold() : typefaceA;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getLight() {
        Typeface typefaceA = this.f109011a.f110085b.a(ev0.f110472c);
        return typefaceA == null ? DivTypefaceProvider.DEFAULT.getLight() : typefaceA;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getMedium() {
        Typeface typefaceA = this.f109011a.f110085b.a(ev0.f110473d);
        return typefaceA == null ? DivTypefaceProvider.DEFAULT.getMedium() : typefaceA;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getRegular() {
        Typeface typefaceA = this.f109011a.f110085b.a(ev0.f110474e);
        return typefaceA == null ? DivTypefaceProvider.DEFAULT.getRegular() : typefaceA;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public /* synthetic */ Typeface getTypefaceFor(int i10) {
        return e7.a.a(this, i10);
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public /* synthetic */ boolean isVariable() {
        return e7.a.b(this);
    }

    public bi0(dv0 dv0Var) {
        this.f109011a = dv0Var;
    }
}
