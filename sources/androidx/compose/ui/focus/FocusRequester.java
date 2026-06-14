package androidx.compose.ui.focus;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.webkit.Profile;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ!\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rH\u0000¢\u0006\u0002\b\u000fJ\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\u0012R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "()V", "focusRequesterNodes", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "getFocusRequesterNodes$ui_release$annotations", "getFocusRequesterNodes$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "captureFocus", "", "findFocusTarget", "onFound", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "findFocusTarget$ui_release", "freeFocus", "requestFocus", "", y.f66058y, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusRequester {
    public static final int $stable = 0;

    @NotNull
    private final MutableVector<FocusRequesterModifierNode> focusRequesterNodes = new MutableVector<>(new FocusRequesterModifierNode[16], 0);

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final FocusRequester Default = new FocusRequester();

    @NotNull
    private static final FocusRequester Cancel = new FocusRequester();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion;", "", "()V", "Cancel", "Landroidx/compose/ui/focus/FocusRequester;", "getCancel$annotations", "getCancel", "()Landroidx/compose/ui/focus/FocusRequester;", Profile.DEFAULT_PROFILE_NAME, "getDefault", "createRefs", "Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "FocusRequesterFactory", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0007\u001a\u00020\u0004H\u0086\u0002J\t\u0010\b\u001a\u00020\u0004H\u0086\u0002J\t\u0010\t\u001a\u00020\u0004H\u0086\u0002J\t\u0010\n\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000b\u001a\u00020\u0004H\u0086\u0002J\t\u0010\f\u001a\u00020\u0004H\u0086\u0002J\t\u0010\r\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000f\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0010\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0011\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0012\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0013\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "", "()V", "component1", "Landroidx/compose/ui/focus/FocusRequester;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @ExperimentalComposeUiApi
        public static final class FocusRequesterFactory {
            public static final int $stable = 0;

            @NotNull
            public static final FocusRequesterFactory INSTANCE = new FocusRequesterFactory();

            private FocusRequesterFactory() {
            }

            @NotNull
            public final FocusRequester component1() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component10() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component11() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component12() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component13() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component14() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component15() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component16() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component2() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component3() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component4() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component5() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component6() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component7() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component8() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component9() {
                return new FocusRequester();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void getCancel$annotations() {
        }

        @ExperimentalComposeUiApi
        @NotNull
        public final FocusRequesterFactory createRefs() {
            return FocusRequesterFactory.INSTANCE;
        }

        @ExperimentalComposeUiApi
        @NotNull
        public final FocusRequester getCancel() {
            return FocusRequester.Cancel;
        }

        @NotNull
        public final FocusRequester getDefault() {
            return FocusRequester.Default;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getFocusRequesterNodes$ui_release$annotations() {
    }

    public final boolean captureFocus() {
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        if (size > 0) {
            FocusRequesterModifierNode[] content = mutableVector.getContent();
            int i10 = 0;
            while (!FocusRequesterModifierNodeKt.captureFocus(content[i10])) {
                i10++;
                if (i10 >= size) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0060, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean findFocusTarget$ui_release(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetModifierNode, java.lang.Boolean> r11) {
        /*
            r10 = this;
            java.lang.String r0 = "onFound"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            androidx.compose.ui.focus.FocusRequester r0 = androidx.compose.ui.focus.FocusRequester.Default
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r0)
            java.lang.String r1 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r0 != 0) goto Lbb
            androidx.compose.ui.focus.FocusRequester r0 = androidx.compose.ui.focus.FocusRequester.Cancel
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r0)
            if (r0 != 0) goto Lb5
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> r0 = r10.focusRequesterNodes
            boolean r0 = r0.isNotEmpty()
            if (r0 == 0) goto Lad
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> r0 = r10.focusRequesterNodes
            int r1 = r0.getSize()
            r2 = 0
            if (r1 <= 0) goto Lac
            java.lang.Object[] r0 = r0.getContent()
            r3 = r2
            r4 = r3
        L2e:
            r5 = r0[r3]
            androidx.compose.ui.focus.FocusRequesterModifierNode r5 = (androidx.compose.ui.focus.FocusRequesterModifierNode) r5
            r6 = 1024(0x400, float:1.435E-42)
            int r6 = androidx.compose.ui.node.NodeKind.m3199constructorimpl(r6)
            androidx.compose.ui.Modifier$Node r7 = r5.getNode()
            boolean r7 = r7.getIsAttached()
            if (r7 == 0) goto La4
            androidx.compose.runtime.collection.MutableVector r7 = new androidx.compose.runtime.collection.MutableVector
            r8 = 16
            androidx.compose.ui.Modifier$Node[] r8 = new androidx.compose.ui.Modifier.Node[r8]
            r7.<init>(r8, r2)
            androidx.compose.ui.Modifier$Node r8 = r5.getNode()
            androidx.compose.ui.Modifier$Node r8 = r8.getChild()
            if (r8 != 0) goto L5d
            androidx.compose.ui.Modifier$Node r5 = r5.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r7, r5)
            goto L60
        L5d:
            r7.add(r8)
        L60:
            boolean r5 = r7.isNotEmpty()
            if (r5 == 0) goto L9f
            int r5 = r7.getSize()
            r8 = 1
            int r5 = r5 - r8
            java.lang.Object r5 = r7.removeAt(r5)
            androidx.compose.ui.Modifier$Node r5 = (androidx.compose.ui.Modifier.Node) r5
            int r9 = r5.getAggregateChildKindSet()
            r9 = r9 & r6
            if (r9 != 0) goto L7d
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r7, r5)
            goto L60
        L7d:
            if (r5 == 0) goto L60
            int r9 = r5.getKindSet()
            r9 = r9 & r6
            if (r9 == 0) goto L9a
            boolean r9 = r5 instanceof androidx.compose.ui.focus.FocusTargetModifierNode
            if (r9 == 0) goto L60
            androidx.compose.ui.focus.FocusTargetModifierNode r5 = (androidx.compose.ui.focus.FocusTargetModifierNode) r5
            java.lang.Object r5 = r11.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L60
            r4 = r8
            goto L9f
        L9a:
            androidx.compose.ui.Modifier$Node r5 = r5.getChild()
            goto L7d
        L9f:
            int r3 = r3 + 1
            if (r3 < r1) goto L2e
            return r4
        La4:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r11.<init>(r0)
            throw r11
        Lac:
            return r2
        Lad:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            r11.<init>(r0)
            throw r11
        Lb5:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r1)
            throw r11
        Lbb:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRequester.findFocusTarget$ui_release(kotlin.jvm.functions.Function1):boolean");
    }

    public final boolean freeFocus() {
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        if (size > 0) {
            FocusRequesterModifierNode[] content = mutableVector.getContent();
            int i10 = 0;
            while (!FocusRequesterModifierNodeKt.freeFocus(content[i10])) {
                i10++;
                if (i10 >= size) {
                }
            }
            return true;
        }
        return false;
    }

    @NotNull
    public final MutableVector<FocusRequesterModifierNode> getFocusRequesterNodes$ui_release() {
        return this.focusRequesterNodes;
    }

    public final void requestFocus() {
        findFocusTarget$ui_release(new Function1<FocusTargetModifierNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusRequester.requestFocus.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull FocusTargetModifierNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(FocusTransactionsKt.requestFocus(it));
            }
        });
    }
}
