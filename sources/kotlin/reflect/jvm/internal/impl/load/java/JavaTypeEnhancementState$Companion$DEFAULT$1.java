package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes3.dex */
/* synthetic */ class JavaTypeEnhancementState$Companion$DEFAULT$1 extends y implements Function1<FqName, ReportLevel> {
    public static final JavaTypeEnhancementState$Companion$DEFAULT$1 INSTANCE = new JavaTypeEnhancementState$Companion$DEFAULT$1();

    JavaTypeEnhancementState$Companion$DEFAULT$1() {
        super(1, JavaNullabilityAnnotationSettingsKt.class, "getDefaultReportLevelForAnnotation", "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ReportLevel invoke(FqName p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return JavaNullabilityAnnotationSettingsKt.getDefaultReportLevelForAnnotation(p02);
    }
}
