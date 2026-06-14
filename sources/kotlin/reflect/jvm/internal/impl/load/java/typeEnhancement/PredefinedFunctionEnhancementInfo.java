package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PredefinedFunctionEnhancementInfo {

    @Nullable
    private final String errorsSinceLanguageVersion;

    @NotNull
    private final List<TypeEnhancementInfo> parametersInfo;

    @Nullable
    private final TypeEnhancementInfo returnTypeInfo;

    @Nullable
    private final PredefinedFunctionEnhancementInfo warningModeClone;

    public PredefinedFunctionEnhancementInfo() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final String getErrorsSinceLanguageVersion() {
        return this.errorsSinceLanguageVersion;
    }

    @NotNull
    public final List<TypeEnhancementInfo> getParametersInfo() {
        return this.parametersInfo;
    }

    @Nullable
    public final TypeEnhancementInfo getReturnTypeInfo() {
        return this.returnTypeInfo;
    }

    @Nullable
    public final PredefinedFunctionEnhancementInfo getWarningModeClone() {
        return this.warningModeClone;
    }

    public PredefinedFunctionEnhancementInfo(@Nullable TypeEnhancementInfo typeEnhancementInfo, @NotNull List<TypeEnhancementInfo> parametersInfo, @Nullable String str) {
        Intrinsics.checkNotNullParameter(parametersInfo, "parametersInfo");
        this.returnTypeInfo = typeEnhancementInfo;
        this.parametersInfo = parametersInfo;
        this.errorsSinceLanguageVersion = str;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo = null;
        if (str != null) {
            TypeEnhancementInfo typeEnhancementInfoCopyForWarnings = typeEnhancementInfo != null ? typeEnhancementInfo.copyForWarnings() : null;
            List<TypeEnhancementInfo> list = parametersInfo;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (TypeEnhancementInfo typeEnhancementInfo2 : list) {
                arrayList.add(typeEnhancementInfo2 != null ? typeEnhancementInfo2.copyForWarnings() : null);
            }
            predefinedFunctionEnhancementInfo = new PredefinedFunctionEnhancementInfo(typeEnhancementInfoCopyForWarnings, arrayList, null);
        }
        this.warningModeClone = predefinedFunctionEnhancementInfo;
    }

    public /* synthetic */ PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : typeEnhancementInfo, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? null : str);
    }
}
