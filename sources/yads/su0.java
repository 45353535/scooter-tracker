package yads;

import java.io.File;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class su0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tu0 f115948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ev0 f115949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f115950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su0(tu0 tu0Var, ev0 ev0Var, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.f115948b = tu0Var;
        this.f115949c = ev0Var;
        this.f115950d = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new su0(this.f115948b, this.f115949c, this.f115950d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((su0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        try {
            File fileB = this.f115948b.b(this.f115949c);
            File parentFile = fileB.getParentFile();
            if (parentFile != null) {
                kotlin.coroutines.jvm.internal.b.a(parentFile.mkdirs());
            }
            FileOutputStream fileOutputStream = new FileOutputStream(fileB);
            try {
                fileOutputStream.write(this.f115950d);
                fileOutputStream.flush();
                Unit unit = Unit.f93236a;
                uf.c.a(fileOutputStream, null);
                return fileB;
            } finally {
            }
        } catch (Exception unused) {
            boolean z10 = lb1.f113032a;
            return null;
        }
    }
}
