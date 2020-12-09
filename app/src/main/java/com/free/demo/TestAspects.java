package com.free.demo;

import com.junegaming.ghostdk.util.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class TestAspects {
    private static final String TAG= TestAspects.class.getCanonicalName();
    @Pointcut("execution(* *.onCreate(*))")
    void OnCreateCut(){

    }

    @Before("OnCreateCut()")
    public void OnCreateAdvice(){
        Logger.d(TAG,"*******OnCreate ADVICE*****");
    }

//    //@Pointcut("execution(* com.ironsource.ironsourcesdkdemo.DemoActivity.*(*))")
//    void PreLogAllCall(){
//
//    }
//    @Before("PreLogAllCall()")
//    public void PreLogAllAdvice(JoinPoint joinPoint){
//        Logger.d(TAG,joinPoint.getSignature().getName());
//    }

    /**
     * Disable Integration Validation
     * */
    @Pointcut("execution(* com.ironsource.mediationsdk.integration.IntegrationHelper.*(*))")
    void DisableISIntegrationValidation(){

    }
    @Before("DisableISIntegrationValidation()")
    public void DisableISIntegrationValidationAdvice(JoinPoint joinPoint){
        Logger.d(TAG,joinPoint.getSignature().getName());
    }
}
