package androidx.compose.ui.node;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\bR*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\bR*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\bR*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\bR*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\bR*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\bR*\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b#\u0010\u0002\u001a\u0004\b$\u0010\bR*\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\bR*\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\bR*\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b/\u0010\u0002\u001a\u0004\b0\u0010\bR*\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\bR*\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b7\u0010\u0002\u001a\u0004\b8\u0010\bR*\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b;\u0010\u0002\u001a\u0004\b<\u0010\bR*\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/ui/node/Nodes;", "", "()V", "Any", "Landroidx/compose/ui/node/NodeKind;", "Landroidx/compose/ui/Modifier$Node;", "getAny-OLwlOKw$annotations", "getAny-OLwlOKw", "()I", "Draw", "Landroidx/compose/ui/node/DrawModifierNode;", "getDraw-OLwlOKw$annotations", "getDraw-OLwlOKw", "FocusEvent", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "getFocusEvent-OLwlOKw$annotations", "getFocusEvent-OLwlOKw", "FocusProperties", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "getFocusProperties-OLwlOKw$annotations", "getFocusProperties-OLwlOKw", "FocusTarget", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "getFocusTarget-OLwlOKw$annotations", "getFocusTarget-OLwlOKw", "GlobalPositionAware", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "getGlobalPositionAware-OLwlOKw$annotations", "getGlobalPositionAware-OLwlOKw", "IntermediateMeasure", "Landroidx/compose/ui/node/IntermediateLayoutModifierNode;", "getIntermediateMeasure-OLwlOKw$annotations", "getIntermediateMeasure-OLwlOKw", "KeyInput", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "getKeyInput-OLwlOKw$annotations", "getKeyInput-OLwlOKw", "Layout", "Landroidx/compose/ui/node/LayoutModifierNode;", "getLayout-OLwlOKw$annotations", "getLayout-OLwlOKw", "LayoutAware", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "getLayoutAware-OLwlOKw$annotations", "getLayoutAware-OLwlOKw", "Locals", "Landroidx/compose/ui/modifier/ModifierLocalNode;", "getLocals-OLwlOKw$annotations", "getLocals-OLwlOKw", "ParentData", "Landroidx/compose/ui/node/ParentDataModifierNode;", "getParentData-OLwlOKw$annotations", "getParentData-OLwlOKw", "PointerInput", "Landroidx/compose/ui/node/PointerInputModifierNode;", "getPointerInput-OLwlOKw$annotations", "getPointerInput-OLwlOKw", "RotaryInput", "Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;", "getRotaryInput-OLwlOKw$annotations", "getRotaryInput-OLwlOKw", "Semantics", "Landroidx/compose/ui/node/SemanticsModifierNode;", "getSemantics-OLwlOKw$annotations", "getSemantics-OLwlOKw", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Nodes {

    @NotNull
    public static final Nodes INSTANCE = new Nodes();

    private Nodes() {
    }

    /* JADX INFO: renamed from: getAny-OLwlOKw, reason: not valid java name */
    public static final int m3210getAnyOLwlOKw() {
        return NodeKind.m3199constructorimpl(1);
    }

    /* JADX INFO: renamed from: getAny-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m3211getAnyOLwlOKw$annotations() {
    }

    /* JADX INFO: renamed from: getDraw-OLwlOKw, reason: not valid java name */
    public static final int m3212getDrawOLwlOKw() {
        return NodeKind.m3199constructorimpl(4);
    }

    /* JADX INFO: renamed from: getDraw-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m3213getDrawOLwlOKw$annotations() {
    }

    /* JADX INFO: renamed from: getFocusEvent-OLwlOKw, reason: not valid java name */
    public static final int m3214getFocusEventOLwlOKw() {
        return NodeKind.m3199constructorimpl(4096);
    }

    /* JADX INFO: renamed from: getFocusEvent-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m3215getFocusEventOLwlOKw$annotations() {
    }

    /* JADX INFO: renamed from: getFocusProperties-OLwlOKw, reason: not valid java name */
    public static final int m3216getFocusPropertiesOLwlOKw() {
        return NodeKind.m3199constructorimpl(2048);
    }

    /* JADX INFO: renamed from: getFocusProperties-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m3217getFocusPropertiesOLwlOKw$annotations() {
    }

    /* JADX INFO: renamed from: getFocusTarget-OLwlOKw, reason: not valid java name */
    public static final int m3218getFocusTargetOLwlOKw() {
        return NodeKind.m3199constructorimpl(1024);
    }

    /* JADX INFO: renamed from: getFocusTarget-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m3219getFocusTargetOLwlOKw$annotations() {
    }

    /* JADX INFO: renamed from: getGlobalPositionAware-OLwlOKw, reason: not valid java name */
    public static final int m3220getGlobalPositionAwareOLwlOKw() {
        return NodeKind.m3199constructorimpl(256);
    }

    /* JADX INFO: renamed from: getGlobalPositionAware-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m3221getGlobalPositionAwareOLwlOKw$annotations() {
    }

    /* JADX INFO: renamed from: getIntermediateMeasure-OLwlOKw, reason: not valid java name */
    public static final int m3222getIntermediateMeasureOLwlOKw() {
        return NodeKind.m3199constructorimpl(512);
    }

    /* JADX INFO: renamed from: getIntermediateMeasure-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m3223getIntermediateMeasureOLwlOKw$annotations() {
    }

    /* JADX INFO: renamed from: getKeyInput-OLwlOKw, reason: not valid java name */
    public static final int m3224getKeyInputOLwlOKw() {
        return NodeKind.m3199constructorimpl(8192);
    }

    /* JADX INFO: renamed from: getKeyInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m3225getKeyInputOLwlOKw$annotations() {
    }

    /* JADX INFO: renamed from: getLayout-OLwlOKw, reason: not valid java name */
    public static final int m3226getLayoutOLwlOKw() {
        return NodeKind.m3199constructorimpl(2);
    }

    /* JADX INFO: renamed from: getLayout-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m3227getLayoutOLwlOKw$annotations() {
    }

    /* JADX INFO: renamed from: getLayoutAware-OLwlOKw, reason: not valid java name */
    public static final int m3228getLayoutAwareOLwlOKw() {
        return NodeKind.m3199constructorimpl(128);
    }

    /* JADX INFO: renamed from: getLayoutAware-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m3229getLayoutAwareOLwlOKw$annotations() {
    }

    /* JADX INFO: renamed from: getLocals-OLwlOKw, reason: not valid java name */
    public static final int m3230getLocalsOLwlOKw() {
        return NodeKind.m3199constructorimpl(32);
    }

    /* JADX INFO: renamed from: getLocals-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m3231getLocalsOLwlOKw$annotations() {
    }

    /* JADX INFO: renamed from: getParentData-OLwlOKw, reason: not valid java name */
    public static final int m3232getParentDataOLwlOKw() {
        return NodeKind.m3199constructorimpl(64);
    }

    /* JADX INFO: renamed from: getParentData-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m3233getParentDataOLwlOKw$annotations() {
    }

    /* JADX INFO: renamed from: getPointerInput-OLwlOKw, reason: not valid java name */
    public static final int m3234getPointerInputOLwlOKw() {
        return NodeKind.m3199constructorimpl(16);
    }

    /* JADX INFO: renamed from: getPointerInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m3235getPointerInputOLwlOKw$annotations() {
    }

    /* JADX INFO: renamed from: getRotaryInput-OLwlOKw, reason: not valid java name */
    public static final int m3236getRotaryInputOLwlOKw() {
        return NodeKind.m3199constructorimpl(16384);
    }

    /* JADX INFO: renamed from: getRotaryInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m3237getRotaryInputOLwlOKw$annotations() {
    }

    /* JADX INFO: renamed from: getSemantics-OLwlOKw, reason: not valid java name */
    public static final int m3238getSemanticsOLwlOKw() {
        return NodeKind.m3199constructorimpl(8);
    }

    /* JADX INFO: renamed from: getSemantics-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m3239getSemanticsOLwlOKw$annotations() {
    }
}
