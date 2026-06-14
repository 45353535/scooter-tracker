package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", l = {48, 53, 58, 60, 65, 67, 71, 74, 89, 92, 100, 103, 106}, m = "invokeSuspend")
final class InitializeSDK$doWork$2 extends k implements Function2<CoroutineScope, Continuation, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeSDK$doWork$2(InitializeSDK initializeSDK, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, continuation);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0355, code lost:
    
        if (r12 != r0) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0272 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027e A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d9 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0328 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x033b A[Catch: all -> 0x001e, CancellationException -> 0x0022, PHI: r1 r2
  0x033b: PHI (r1v39 java.lang.Object) = (r1v37 java.lang.Object), (r1v37 java.lang.Object), (r1v42 java.lang.Object) binds: [B:125:0x0326, B:127:0x0338, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x033b: PHI (r2v33 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r2v30 com.unity3d.services.core.domain.task.InitializeSDK)
  (r2v30 com.unity3d.services.core.domain.task.InitializeSDK)
  (r2v36 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:125:0x0326, B:127:0x0338, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb A[PHI: r1 r4 r12
  0x00eb: PHI (r1v6 com.unity3d.services.core.domain.task.InitializeSDK) = (r1v2 com.unity3d.services.core.domain.task.InitializeSDK), (r1v14 com.unity3d.services.core.domain.task.InitializeSDK) binds: [B:60:0x0177, B:45:0x00ea] A[DONT_GENERATE, DONT_INLINE]
  0x00eb: PHI (r4v6 kotlinx.coroutines.CoroutineScope) = (r4v2 kotlinx.coroutines.CoroutineScope), (r4v7 kotlinx.coroutines.CoroutineScope) binds: [B:60:0x0177, B:45:0x00ea] A[DONT_GENERATE, DONT_INLINE]
  0x00eb: PHI (r12v23 java.lang.Object) = (r12v21 java.lang.Object), (r12v29 java.lang.Object) binds: [B:60:0x0177, B:45:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c2 A[Catch: all -> 0x001e, CancellationException -> 0x0022, PHI: r1 r2 r4 r12
  0x01c2: PHI (r1v15 com.unity3d.services.core.configuration.Configuration) = 
  (r1v10 com.unity3d.services.core.configuration.Configuration)
  (r1v18 com.unity3d.services.core.configuration.Configuration)
 binds: [B:69:0x01be, B:41:0x00ce] A[DONT_GENERATE, DONT_INLINE]
  0x01c2: PHI (r2v5 com.unity3d.services.core.domain.task.InitializeSDK) = (r2v2 com.unity3d.services.core.domain.task.InitializeSDK), (r2v7 com.unity3d.services.core.domain.task.InitializeSDK) binds: [B:69:0x01be, B:41:0x00ce] A[DONT_GENERATE, DONT_INLINE]
  0x01c2: PHI (r4v8 kotlinx.coroutines.CoroutineScope) = (r4v6 kotlinx.coroutines.CoroutineScope), (r4v11 kotlinx.coroutines.CoroutineScope) binds: [B:69:0x01be, B:41:0x00ce] A[DONT_GENERATE, DONT_INLINE]
  0x01c2: PHI (r12v30 java.lang.Object) = (r12v26 java.lang.Object), (r12v34 java.lang.Object) binds: [B:69:0x01be, B:41:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c8 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e6 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f2 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0212 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0229 A[Catch: all -> 0x001e, CancellationException -> 0x0022, PHI: r1 r2 r4 r5
  0x0229: PHI (r1v23 java.lang.Object) = (r1v20 java.lang.Object), (r1v20 java.lang.Object), (r1v24 java.lang.Object) binds: [B:85:0x0210, B:87:0x0225, B:32:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x0229: PHI (r2v12 com.unity3d.services.core.configuration.Configuration) = 
  (r2v9 com.unity3d.services.core.configuration.Configuration)
  (r2v9 com.unity3d.services.core.configuration.Configuration)
  (r2v14 com.unity3d.services.core.configuration.Configuration)
 binds: [B:85:0x0210, B:87:0x0225, B:32:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x0229: PHI (r4v16 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r4v13 com.unity3d.services.core.domain.task.InitializeSDK)
  (r4v13 com.unity3d.services.core.domain.task.InitializeSDK)
  (r4v18 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:85:0x0210, B:87:0x0225, B:32:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x0229: PHI (r5v12 kotlinx.coroutines.CoroutineScope) = 
  (r5v11 kotlinx.coroutines.CoroutineScope)
  (r5v11 kotlinx.coroutines.CoroutineScope)
  (r5v14 kotlinx.coroutines.CoroutineScope)
 binds: [B:85:0x0210, B:87:0x0225, B:32:0x0096] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024b A[Catch: all -> 0x001e, CancellationException -> 0x0022, PHI: r1 r2 r4 r5 r12
  0x024b: PHI (r1v25 java.lang.Object) = (r1v23 java.lang.Object), (r1v28 java.lang.Object) binds: [B:90:0x0247, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r2v15 com.unity3d.services.core.configuration.Configuration) = 
  (r2v12 com.unity3d.services.core.configuration.Configuration)
  (r2v22 com.unity3d.services.core.configuration.Configuration)
 binds: [B:90:0x0247, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r4v19 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r4v16 com.unity3d.services.core.domain.task.InitializeSDK)
  (r4v21 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:90:0x0247, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r5v15 kotlinx.coroutines.CoroutineScope) = (r5v12 kotlinx.coroutines.CoroutineScope), (r5v21 kotlinx.coroutines.CoroutineScope) binds: [B:90:0x0247, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r12v46 java.lang.Object) = (r12v45 java.lang.Object), (r12v54 java.lang.Object) binds: [B:90:0x0247, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0251 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((InitializeSDK$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
