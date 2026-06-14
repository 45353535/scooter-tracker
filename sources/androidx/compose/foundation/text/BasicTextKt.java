package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a{\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001ao\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u001c\u001a\u001e\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"BasicText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "BasicText-VhcvRP8", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V", "selectionIdSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BasicTextKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x031f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m695BasicText4YKlhWE(@org.jetbrains.annotations.NotNull final java.lang.String r34, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r35, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r36, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r37, int r38, boolean r39, int r40, int r41, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instruction units count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m695BasicText4YKlhWE(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: BasicText-BpD7jsM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m696BasicTextBpD7jsM(final java.lang.String r20, androidx.compose.ui.Modifier r21, androidx.compose.ui.text.TextStyle r22, kotlin.jvm.functions.Function1 r23, int r24, boolean r25, int r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m696BasicTextBpD7jsM(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0381 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0145  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m697BasicTextVhcvRP8(@org.jetbrains.annotations.NotNull final androidx.compose.ui.text.AnnotatedString r27, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r28, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r29, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r30, int r31, boolean r32, int r33, int r34, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r35, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m697BasicTextVhcvRP8(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Saver<Long, Long> selectionIdSaver(final SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new Function2<SaverScope, Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt.selectionIdSaver.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Long invoke(SaverScope saverScope, Long l10) {
                return invoke(saverScope, l10.longValue());
            }

            @Nullable
            public final Long invoke(@NotNull SaverScope Saver, long j10) {
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j10)) {
                    return Long.valueOf(j10);
                }
                return null;
            }
        }, new Function1<Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt.selectionIdSaver.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(Long l10) {
                return invoke(l10.longValue());
            }

            @Nullable
            public final Long invoke(long j10) {
                return Long.valueOf(j10);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m694BasicText4YKlhWE(final androidx.compose.ui.text.AnnotatedString r23, androidx.compose.ui.Modifier r24, androidx.compose.ui.text.TextStyle r25, kotlin.jvm.functions.Function1 r26, int r27, boolean r28, int r29, java.util.Map r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m694BasicText4YKlhWE(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }
}
