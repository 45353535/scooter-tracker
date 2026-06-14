package yads;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class vf2 {

    @NotNull
    public static final uf2 Companion = new uf2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KSerializer[] f117003d = {yf2.Companion.serializer(), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yf2 f117004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f117006c;

    public /* synthetic */ vf2(int i10, yf2 yf2Var, String str, Integer num) {
        if (7 != (i10 & 7)) {
            yg.e2.a(i10, 7, tf2.f116229a.getDescriptor());
        }
        this.f117004a = yf2Var;
        this.f117005b = str;
        this.f117006c = num;
    }

    public vf2(yf2 yf2Var, String str, Integer num) {
        this.f117004a = yf2Var;
        this.f117005b = str;
        this.f117006c = num;
    }
}
