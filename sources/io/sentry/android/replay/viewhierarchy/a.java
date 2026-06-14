package io.sentry.android.replay.viewhierarchy;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import io.sentry.android.replay.s;
import io.sentry.g7;
import io.sentry.v7;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import lf.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f83222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static WeakReference f83223d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f83220a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f83221b = i.a(C1005a.f83225f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f83224e = 8;

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.a$a, reason: collision with other inner class name */
    static final class C1005a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C1005a f83225f = new C1005a();

        C1005a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Method invoke() {
            try {
                Method declaredMethod = LayoutNode.class.getDeclaredMethod("getSemanticsConfiguration", null);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    private a() {
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final io.sentry.android.replay.viewhierarchy.b a(androidx.compose.ui.node.LayoutNode r22, io.sentry.android.replay.viewhierarchy.b r23, int r24, boolean r25, io.sentry.v7 r26) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.viewhierarchy.a.a(androidx.compose.ui.node.LayoutNode, io.sentry.android.replay.viewhierarchy.b, int, boolean, io.sentry.v7):io.sentry.android.replay.viewhierarchy.b");
    }

    private final Method c() {
        return (Method) f83221b.getValue();
    }

    private final String d(boolean z10, SemanticsConfiguration semanticsConfiguration) {
        if (z10) {
            return "android.widget.ImageView";
        }
        if (semanticsConfiguration == null) {
            return AndroidComposeViewAccessibilityDelegateCompat.ClassName;
        }
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (semanticsConfiguration.contains(semanticsProperties.getText()) || semanticsConfiguration.contains(SemanticsActions.INSTANCE.getSetText()) || semanticsConfiguration.contains(semanticsProperties.getEditableText())) ? AndroidComposeViewAccessibilityDelegateCompat.TextClassName : AndroidComposeViewAccessibilityDelegateCompat.ClassName;
    }

    public static final SemanticsConfiguration e(LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        Method methodC = f83220a.c();
        return methodC != null ? (SemanticsConfiguration) methodC.invoke(node, null) : node.getCollapsedSemantics$ui_release();
    }

    private final boolean f(SemanticsConfiguration semanticsConfiguration, boolean z10, v7 v7Var) {
        String str = semanticsConfiguration != null ? (String) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, s.f83081a.a()) : null;
        if (Intrinsics.areEqual(str, "unmask")) {
            return false;
        }
        if (Intrinsics.areEqual(str, "mask")) {
            return true;
        }
        String strD = d(z10, semanticsConfiguration);
        if (v7Var.getSessionReplay().n().contains(strD)) {
            return false;
        }
        return v7Var.getSessionReplay().e().contains(strD);
    }

    private final void g(LayoutNode layoutNode, b bVar, boolean z10, v7 v7Var) {
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        if (children$ui_release.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(children$ui_release.size());
        int size = children$ui_release.size();
        int i10 = 0;
        while (i10 < size) {
            LayoutNode layoutNode2 = children$ui_release.get(i10);
            b bVar2 = bVar;
            boolean z11 = z10;
            v7 v7Var2 = v7Var;
            b bVarA = a(layoutNode2, bVar2, i10, z11, v7Var2);
            if (bVarA != null) {
                arrayList.add(bVarA);
                g(layoutNode2, bVarA, false, v7Var2);
            }
            i10++;
            bVar = bVar2;
            z10 = z11;
            v7Var = v7Var2;
        }
        bVar.f(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(View view, b bVar, v7 options) {
        LayoutNode root;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(options, "options");
        String name = view.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (!StringsKt.g0(name, "AndroidComposeView", false, 2, null) || bVar == null) {
            return false;
        }
        try {
            Owner owner = view instanceof Owner ? (Owner) view : null;
            if (owner != null && (root = owner.getRoot()) != null) {
                g(root, bVar, true, options);
                return true;
            }
            return false;
        } catch (Throwable th2) {
            options.getLogger().b(g7.ERROR, th2, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
            return false;
        }
    }
}
