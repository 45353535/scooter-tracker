package com.yandex.div.core.player;

import com.taurusx.tax.f.y;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import k8.as;
import k8.ea;
import k8.f7;
import k8.jk;
import k8.le;
import k8.lq;
import k8.pw;
import k8.td;
import k8.u8;
import k8.x9;
import k8.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/core/player/DivVideoActionHandler;", "", "Lcom/yandex/div/core/player/DivVideoViewMapper;", "videoViewMapper", "<init>", "(Lcom/yandex/div/core/player/DivVideoViewMapper;)V", "Lk8/ea;", "divData", "", "id", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lk8/pw;", "searchDivDataForVideo", "(Lk8/ea;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lk8/pw;", "Lk8/f7;", "div", "findDivVideoWithId", "(Lk8/f7;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lk8/pw;", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "divId", "action", "expressionResolver", "", "handleAction", "(Lcom/yandex/div/core/view2/Div2View;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lcom/yandex/div/core/player/DivVideoViewMapper;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivVideoActionHandler {

    @NotNull
    private final DivVideoViewMapper videoViewMapper;

    public DivVideoActionHandler(@NotNull DivVideoViewMapper divVideoViewMapper) {
        this.videoViewMapper = divVideoViewMapper;
    }

    private final pw findDivVideoWithId(f7 div, String id2, ExpressionResolver resolver) {
        f7 f7VarC;
        if (div instanceof pw) {
            if (Intrinsics.areEqual(div.getId(), id2)) {
                return (pw) div;
            }
            return null;
        }
        if (div instanceof td) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems((td) div, resolver)) {
                pw pwVarFindDivVideoWithId = findDivVideoWithId(divItemBuilderResult.getDiv().c(), id2, divItemBuilderResult.getExpressionResolver());
                if (pwVarFindDivVideoWithId != null) {
                    return pwVarFindDivVideoWithId;
                }
            }
            return null;
        }
        if (div instanceof u8) {
            for (DivItemBuilderResult divItemBuilderResult2 : DivCollectionExtensionsKt.buildItems((u8) div, resolver)) {
                pw pwVarFindDivVideoWithId2 = findDivVideoWithId(divItemBuilderResult2.getDiv().c(), id2, divItemBuilderResult2.getExpressionResolver());
                if (pwVarFindDivVideoWithId2 != null) {
                    return pwVarFindDivVideoWithId2;
                }
            }
            return null;
        }
        if (div instanceof le) {
            Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems((le) div).iterator();
            while (it.hasNext()) {
                pw pwVarFindDivVideoWithId3 = findDivVideoWithId(((y0) it.next()).c(), id2, resolver);
                if (pwVarFindDivVideoWithId3 != null) {
                    return pwVarFindDivVideoWithId3;
                }
            }
            return null;
        }
        if (div instanceof jk) {
            for (DivItemBuilderResult divItemBuilderResult3 : DivCollectionExtensionsKt.buildItems((jk) div, resolver)) {
                pw pwVarFindDivVideoWithId4 = findDivVideoWithId(divItemBuilderResult3.getDiv().c(), id2, divItemBuilderResult3.getExpressionResolver());
                if (pwVarFindDivVideoWithId4 != null) {
                    return pwVarFindDivVideoWithId4;
                }
            }
            return null;
        }
        if (div instanceof as) {
            Iterator it2 = ((as) div).f86342q.iterator();
            while (it2.hasNext()) {
                pw pwVarFindDivVideoWithId5 = findDivVideoWithId(((as.c) it2.next()).f86355a.c(), id2, resolver);
                if (pwVarFindDivVideoWithId5 != null) {
                    return pwVarFindDivVideoWithId5;
                }
            }
            return null;
        }
        if (div instanceof x9) {
            List list = ((x9) div).f92318q;
            if (list != null) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    pw pwVarFindDivVideoWithId6 = findDivVideoWithId(((y0) it3.next()).c(), id2, resolver);
                    if (pwVarFindDivVideoWithId6 != null) {
                        return pwVarFindDivVideoWithId6;
                    }
                }
            }
            return null;
        }
        if (div instanceof lq) {
            Iterator it4 = ((lq) div).I.iterator();
            while (it4.hasNext()) {
                y0 y0Var = ((lq.c) it4.next()).f88889c;
                if (y0Var != null && (f7VarC = y0Var.c()) != null) {
                    pw pwVarFindDivVideoWithId7 = findDivVideoWithId(f7VarC, id2, resolver);
                    if (pwVarFindDivVideoWithId7 != null) {
                        return pwVarFindDivVideoWithId7;
                    }
                }
            }
        }
        return null;
    }

    private final pw searchDivDataForVideo(ea divData, String id2, ExpressionResolver resolver) {
        Iterator it = divData.f87205c.iterator();
        while (it.hasNext()) {
            pw pwVarFindDivVideoWithId = findDivVideoWithId(((ea.c) it.next()).f87215a.c(), id2, resolver);
            if (pwVarFindDivVideoWithId != null) {
                return pwVarFindDivVideoWithId;
            }
        }
        return null;
    }

    public final boolean handleAction(@NotNull Div2View div2View, @NotNull String divId, @NotNull String action, @NotNull ExpressionResolver expressionResolver) {
        pw pwVarSearchDivDataForVideo;
        DivPlayer player;
        ea divData = div2View.getDivData();
        if (divData == null || (pwVarSearchDivDataForVideo = searchDivDataForVideo(divData, divId, expressionResolver)) == null || (player = this.videoViewMapper.getPlayer(pwVarSearchDivDataForVideo)) == null) {
            return false;
        }
        if (Intrinsics.areEqual(action, "start")) {
            player.play();
            return true;
        }
        if (Intrinsics.areEqual(action, "pause")) {
            player.pause();
            return true;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("No such video action: " + action);
        }
        return false;
    }
}
