package androidx.compose.runtime;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\u001aP\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aZ\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\f\u001ad\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000e\u001an\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0010\u001ah\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0011\"\u0004\u0018\u00010\u00062(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"T", "initialValue", "Lkotlin/Function2;", "Landroidx/compose/runtime/ProduceStateScope;", "Lkotlin/coroutines/Continuation;", "", "", "producer", "Landroidx/compose/runtime/State;", "produceState", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "key1", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", UserMetadata.KEYDATA_FILENAME, "(Ljava/lang/Object;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class SnapshotStateKt__ProduceStateKt {

    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1", f = "ProduceState.kt", l = {84}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<ProduceStateScope<T>, Continuation, Object> $producer;
        final /* synthetic */ MutableState<T> $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super ProduceStateScope<T>, ? super Continuation, ? extends Object> function2, MutableState<T> mutableState, Continuation continuation) {
            super(2, continuation);
            this.$producer = function2;
            this.$result = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$producer, this.$result, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1 for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.d.b(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.d.b(r6)
                java.lang.Object r6 = r5.L$0
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<T>, kotlin.coroutines.Continuation, java.lang.Object> r1 = r5.$producer
                androidx.compose.runtime.ProduceStateScopeImpl r3 = new androidx.compose.runtime.ProduceStateScopeImpl
                androidx.compose.runtime.MutableState<T> r4 = r5.$result
                kotlin.coroutines.CoroutineContext r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.label = r2
                java.lang.Object r6 = r1.invoke(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$2", f = "ProduceState.kt", l = {117}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<ProduceStateScope<T>, Continuation, Object> $producer;
        final /* synthetic */ MutableState<T> $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super ProduceStateScope<T>, ? super Continuation, ? extends Object> function2, MutableState<T> mutableState, Continuation continuation) {
            super(2, continuation);
            this.$producer = function2;
            this.$result = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$producer, this.$result, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$2 for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.d.b(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.d.b(r6)
                java.lang.Object r6 = r5.L$0
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<T>, kotlin.coroutines.Continuation, java.lang.Object> r1 = r5.$producer
                androidx.compose.runtime.ProduceStateScopeImpl r3 = new androidx.compose.runtime.ProduceStateScopeImpl
                androidx.compose.runtime.MutableState<T> r4 = r5.$result
                kotlin.coroutines.CoroutineContext r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.label = r2
                java.lang.Object r6 = r1.invoke(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", f = "ProduceState.kt", l = {151}, m = "invokeSuspend")
    static final class AnonymousClass3 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<ProduceStateScope<T>, Continuation, Object> $producer;
        final /* synthetic */ MutableState<T> $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function2<? super ProduceStateScope<T>, ? super Continuation, ? extends Object> function2, MutableState<T> mutableState, Continuation continuation) {
            super(2, continuation);
            this.$producer = function2;
            this.$result = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$producer, this.$result, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3 for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.d.b(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.d.b(r6)
                java.lang.Object r6 = r5.L$0
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<T>, kotlin.coroutines.Continuation, java.lang.Object> r1 = r5.$producer
                androidx.compose.runtime.ProduceStateScopeImpl r3 = new androidx.compose.runtime.ProduceStateScopeImpl
                androidx.compose.runtime.MutableState<T> r4 = r5.$result
                kotlin.coroutines.CoroutineContext r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.label = r2
                java.lang.Object r6 = r1.invoke(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$4", f = "ProduceState.kt", l = {186}, m = "invokeSuspend")
    static final class AnonymousClass4 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<ProduceStateScope<T>, Continuation, Object> $producer;
        final /* synthetic */ MutableState<T> $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(Function2<? super ProduceStateScope<T>, ? super Continuation, ? extends Object> function2, MutableState<T> mutableState, Continuation continuation) {
            super(2, continuation);
            this.$producer = function2;
            this.$result = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$producer, this.$result, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$4 for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.d.b(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.d.b(r6)
                java.lang.Object r6 = r5.L$0
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<T>, kotlin.coroutines.Continuation, java.lang.Object> r1 = r5.$producer
                androidx.compose.runtime.ProduceStateScopeImpl r3 = new androidx.compose.runtime.ProduceStateScopeImpl
                androidx.compose.runtime.MutableState<T> r4 = r5.$result
                kotlin.coroutines.CoroutineContext r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.label = r2
                java.lang.Object r6 = r1.invoke(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5", f = "ProduceState.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE}, m = "invokeSuspend")
    static final class AnonymousClass5 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<ProduceStateScope<T>, Continuation, Object> $producer;
        final /* synthetic */ MutableState<T> $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(Function2<? super ProduceStateScope<T>, ? super Continuation, ? extends Object> function2, MutableState<T> mutableState, Continuation continuation) {
            super(2, continuation);
            this.$producer = function2;
            this.$result = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$producer, this.$result, continuation);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5 for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.d.b(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.d.b(r6)
                java.lang.Object r6 = r5.L$0
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<T>, kotlin.coroutines.Continuation, java.lang.Object> r1 = r5.$producer
                androidx.compose.runtime.ProduceStateScopeImpl r3 = new androidx.compose.runtime.ProduceStateScopeImpl
                androidx.compose.runtime.MutableState<T> r4 = r5.$result
                kotlin.coroutines.CoroutineContext r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.label = r2
                java.lang.Object r6 = r1.invoke(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t10, @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation, ? extends Object> producer, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        composer.startReplaceableGroup(10454275);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10454275, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:77)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        EffectsKt.LaunchedEffect(Unit.f93236a, new AnonymousClass1(producer, mutableState, null), composer, 70);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t10, @Nullable Object obj, @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation, ? extends Object> producer, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        composer.startReplaceableGroup(-1928268701);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928268701, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:109)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        EffectsKt.LaunchedEffect(obj, new AnonymousClass2(producer, mutableState, null), composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t10, @Nullable Object obj, @Nullable Object obj2, @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation, ? extends Object> producer, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        composer.startReplaceableGroup(-1703169085);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1703169085, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:142)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        EffectsKt.LaunchedEffect(obj, obj2, new AnonymousClass3(producer, mutableState, null), composer, 584);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t10, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation, ? extends Object> producer, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        composer.startReplaceableGroup(1807205155);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1807205155, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:176)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        EffectsKt.LaunchedEffect(obj, obj2, obj3, new AnonymousClass4(producer, mutableState, null), composer, 4680);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t10, @NotNull Object[] keys, @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation, ? extends Object> producer, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(producer, "producer");
        composer.startReplaceableGroup(490154582);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(490154582, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:211)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        EffectsKt.LaunchedEffect(Arrays.copyOf(keys, keys.length), (Function2<? super CoroutineScope, ? super Continuation, ? extends Object>) new AnonymousClass5(producer, mutableState, null), composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
