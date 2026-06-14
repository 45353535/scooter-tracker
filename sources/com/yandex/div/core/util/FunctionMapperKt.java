package com.yandex.div.core.util;

import com.yandex.div.core.expression.local.LocalFunction;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.ArrayList;
import java.util.List;
import k8.kd;
import k8.ld;
import k8.qb;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "Lk8/kd;", "Lcom/yandex/div/core/expression/local/LocalFunction;", "toLocalFunctions", "(Ljava/util/List;)Ljava/util/List;", "Lk8/qb;", "Lcom/yandex/div/evaluable/EvaluableType;", "toEvaluableType", "(Lk8/qb;)Lcom/yandex/div/evaluable/EvaluableType;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class FunctionMapperKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[qb.values().length];
            try {
                iArr[qb.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qb.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qb.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[qb.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[qb.DATETIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[qb.COLOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[qb.URL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[qb.DICT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[qb.ARRAY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final EvaluableType toEvaluableType(qb qbVar) {
        switch (WhenMappings.$EnumSwitchMapping$0[qbVar.ordinal()]) {
            case 1:
                return EvaluableType.STRING;
            case 2:
                return EvaluableType.INTEGER;
            case 3:
                return EvaluableType.NUMBER;
            case 4:
                return EvaluableType.BOOLEAN;
            case 5:
                return EvaluableType.DATETIME;
            case 6:
                return EvaluableType.COLOR;
            case 7:
                return EvaluableType.URL;
            case 8:
                return EvaluableType.DICT;
            case 9:
                return EvaluableType.ARRAY;
            default:
                throw new m();
        }
    }

    @NotNull
    public static final List<LocalFunction> toLocalFunctions(@NotNull List<kd> list) {
        List<kd> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (kd kdVar : list2) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (ld ldVar : kdVar.f88614a) {
                arrayList2.add(ldVar.f88783a);
                arrayList3.add(new FunctionArgument(toEvaluableType(ldVar.f88784b), false, 2, null));
            }
            arrayList.add(new LocalFunction(kdVar.f88616c, arrayList3, toEvaluableType(kdVar.f88617d), arrayList2, kdVar.f88615b));
        }
        return arrayList;
    }
}
