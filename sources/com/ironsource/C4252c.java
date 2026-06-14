package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4252c implements InterfaceC4343h5<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Y5 f42785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f42786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4651z7 f42787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<Result, Unit> f42788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private C4652z8 f42789e;

    /* JADX WARN: Multi-variable type inference failed */
    public C4252c(@NotNull Y5 fileUrl, @NotNull String destinationPath, @NotNull InterfaceC4651z7 downloadManager, @NotNull Function1<? super Result, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.f42785a = fileUrl;
        this.f42786b = destinationPath;
        this.f42787c = downloadManager;
        this.f42788d = onFinish;
        this.f42789e = new C4652z8(c(), C4240b4.f42479h);
    }

    @Override // com.ironsource.Lc
    public void a(@NotNull C4652z8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (Intrinsics.areEqual(file.getName(), C4240b4.f42479h)) {
            try {
                i().invoke(Result.a(Result.b(c(file))));
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                Function1<Result, Unit> function1I = i();
                Result.Companion companion = Result.f93230c;
                function1I.invoke(Result.a(Result.b(kotlin.d.a(e10))));
            }
        }
    }

    @Override // com.ironsource.InterfaceC4343h5
    public void b(@NotNull C4652z8 c4652z8) {
        Intrinsics.checkNotNullParameter(c4652z8, "<set-?>");
        this.f42789e = c4652z8;
    }

    @Override // com.ironsource.InterfaceC4343h5
    @NotNull
    public String c() {
        return this.f42786b;
    }

    @Override // com.ironsource.InterfaceC4343h5
    @NotNull
    public Y5 d() {
        return this.f42785a;
    }

    @Override // com.ironsource.InterfaceC4343h5
    @NotNull
    public Function1<Result, Unit> i() {
        return this.f42788d;
    }

    @Override // com.ironsource.InterfaceC4343h5
    public /* synthetic */ boolean j() {
        return rk.a(this);
    }

    @Override // com.ironsource.InterfaceC4343h5
    @NotNull
    public C4652z8 k() {
        return this.f42789e;
    }

    @Override // com.ironsource.InterfaceC4343h5
    @NotNull
    public InterfaceC4651z7 l() {
        return this.f42787c;
    }

    @Override // com.ironsource.InterfaceC4343h5
    public /* synthetic */ void m() {
        rk.b(this);
    }

    private final JSONObject c(C4652z8 c4652z8) {
        return new JSONObject(IronSourceStorageUtils.readFile(c4652z8));
    }

    @Override // com.ironsource.Lc
    public void a(@Nullable C4652z8 c4652z8, @NotNull C4516r8 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Result, Unit> function1I = i();
        Result.Companion companion = Result.f93230c;
        function1I.invoke(Result.a(Result.b(kotlin.d.a(new Exception("Unable to download abTestMap.json: " + error.b())))));
    }
}
