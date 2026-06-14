package com.ironsource;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4392k4 implements InterfaceC4343h5<C4652z8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Y5 f43440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f43441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4651z7 f43442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<Result, Unit> f43443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private C4652z8 f43444e;

    /* JADX WARN: Multi-variable type inference failed */
    public C4392k4(@NotNull Y5 fileUrl, @NotNull String destinationPath, @NotNull InterfaceC4651z7 downloadManager, @NotNull Function1<? super Result, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.f43440a = fileUrl;
        this.f43441b = destinationPath;
        this.f43442c = downloadManager;
        this.f43443d = onFinish;
        this.f43444e = new C4652z8(c());
    }

    @Override // com.ironsource.Lc
    public void a(@NotNull C4652z8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        i().invoke(Result.a(Result.b(file)));
    }

    @Override // com.ironsource.InterfaceC4343h5
    public void b(@NotNull C4652z8 c4652z8) {
        Intrinsics.checkNotNullParameter(c4652z8, "<set-?>");
        this.f43444e = c4652z8;
    }

    @Override // com.ironsource.InterfaceC4343h5
    @NotNull
    public String c() {
        return this.f43441b;
    }

    @Override // com.ironsource.InterfaceC4343h5
    @NotNull
    public Y5 d() {
        return this.f43440a;
    }

    @Override // com.ironsource.InterfaceC4343h5
    @NotNull
    public Function1<Result, Unit> i() {
        return this.f43443d;
    }

    @Override // com.ironsource.InterfaceC4343h5
    public /* synthetic */ boolean j() {
        return rk.a(this);
    }

    @Override // com.ironsource.InterfaceC4343h5
    @NotNull
    public C4652z8 k() {
        return this.f43444e;
    }

    @Override // com.ironsource.InterfaceC4343h5
    @NotNull
    public InterfaceC4651z7 l() {
        return this.f43442c;
    }

    @Override // com.ironsource.InterfaceC4343h5
    public /* synthetic */ void m() {
        rk.b(this);
    }

    @Override // com.ironsource.Lc
    public void a(@Nullable C4652z8 c4652z8, @NotNull C4516r8 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Result, Unit> function1I = i();
        Result.Companion companion = Result.f93230c;
        function1I.invoke(Result.a(Result.b(kotlin.d.a(new Exception("Unable to download mobileController.html: " + error.b())))));
    }
}
