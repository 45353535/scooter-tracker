package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.ironsource.InterfaceC4518ra;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4331ga extends WebView implements InterfaceC4535sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4518ra f43182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Nc f43183b;

    public /* synthetic */ C4331ga(Context context, InterfaceC4518ra interfaceC4518ra, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? new InterfaceC4518ra.a(0, 1, null) : interfaceC4518ra);
    }

    @Override // com.ironsource.InterfaceC4535sa
    public void a(@NotNull String script) {
        Intrinsics.checkNotNullParameter(script, "script");
        InterfaceC4518ra interfaceC4518ra = this.f43182a;
        InterfaceC4518ra interfaceC4518ra2 = null;
        if (interfaceC4518ra == null) {
            Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
            interfaceC4518ra = null;
        }
        if (!interfaceC4518ra.a()) {
            InterfaceC4518ra interfaceC4518ra3 = this.f43182a;
            if (interfaceC4518ra3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
                interfaceC4518ra3 = null;
            }
            interfaceC4518ra3.a(this);
        }
        InterfaceC4518ra interfaceC4518ra4 = this.f43182a;
        if (interfaceC4518ra4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
        } else {
            interfaceC4518ra2 = interfaceC4518ra4;
        }
        interfaceC4518ra2.a(script);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, @NotNull KeyEvent event) {
        Nc nc2;
        Intrinsics.checkNotNullParameter(event, "event");
        if (i10 == 4 && (nc2 = this.f43183b) != null && nc2.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i10, event);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4331ga(@NotNull Context context, @NotNull InterfaceC4518ra javascriptEngine) {
        this(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        this.f43182a = javascriptEngine;
    }

    public final void a(@Nullable Nc nc2) {
        this.f43183b = nc2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4331ga(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        this.f43183b = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4331ga(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4331ga(@NotNull Context context, @NotNull AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
