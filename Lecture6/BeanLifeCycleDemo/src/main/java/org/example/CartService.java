package org.example;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.ResolvableType;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

@Component
public class CartService implements  BeanNameAware , ApplicationContext/*DisposableBean InitializingBean, BeanNameAware */
{

    Map<Integer, String> map;

    public CartService() {
        map = new HashMap<>();
        System.out.println("CartService Consrtuctor Called");
    }

    public void setBeanName(String name)
    {
        System.out.println("BeanNameAware Called : " + name);
    }


//    @Override
//    public void afterPropertiesSet() throws Exception
//    {
//        System.out.println("Initialisation Bean");
//        map.put(1,"Omprasad Rakhamb");
//        map.put(2 ,"Soham Rankhamb");
//    }


//    public void start() throws Exception
//    {
//        System.out.println("Initialisation Bean");
//        map.put(1,"Omprasad Rakhamb");
//        map.put(2 ,"Soham Rankhamb");
//    }
//
//    public void stop() throws Exception
//    {
//        map.clear();
//        System.out.println("bean is getting destryed");
//    }

    @PostConstruct
    public void start2() throws Exception
    {
        System.out.println("Initialisation Bean");
        map.put(1,"Omprasad Rakhamb");
        map.put(2 ,"Soham Rankhamb");
    }

    @PreDestroy
    public void destroy2() throws Exception
    {
        map.clear();
        System.out.println("bean is getting destryed");
    }

    public void addToCart(){
        System.out.println("Added To cart");
    }

    public String getValue(int key)
    {
        return map.get(key);
    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getApplicationName() {
        return "";
    }

    @Override
    public String getDisplayName() {
        return "";
    }

    @Override
    public long getStartupDate() {
        return 0;
    }

    @Override
    public @Nullable ApplicationContext getParent() {
        return null;
    }

    @Override
    public AutowireCapableBeanFactory getAutowireCapableBeanFactory() throws IllegalStateException {
        return null;
    }

    @Override
    public @Nullable BeanFactory getParentBeanFactory() {
        return null;
    }

    @Override
    public boolean containsLocalBean(String name) {
        return false;
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return false;
    }

    @Override
    public int getBeanDefinitionCount() {
        return 0;
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return new String[0];
    }

    @Override
    public <T> ObjectProvider<T> getBeanProvider(Class<T> requiredType, boolean allowEagerInit) {
        return null;
    }

    @Override
    public <T> ObjectProvider<T> getBeanProvider(ResolvableType requiredType, boolean allowEagerInit) {
        return null;
    }

    @Override
    public String[] getBeanNamesForType(ResolvableType type) {
        return new String[0];
    }

    @Override
    public String[] getBeanNamesForType(ResolvableType type, boolean includeNonSingletons, boolean allowEagerInit) {
        return new String[0];
    }

    @Override
    public String[] getBeanNamesForType(@Nullable Class<?> type) {
        return new String[0];
    }

    @Override
    public String[] getBeanNamesForType(@Nullable Class<?> type, boolean includeNonSingletons, boolean allowEagerInit) {
        return new String[0];
    }

    @Override
    public <T> Map<String, T> getBeansOfType(@Nullable Class<T> type) throws BeansException {
        return Map.of();
    }

    @Override
    public <T> Map<String, T> getBeansOfType(@Nullable Class<T> type, boolean includeNonSingletons, boolean allowEagerInit) throws BeansException {
        return Map.of();
    }

    @Override
    public String[] getBeanNamesForAnnotation(Class<? extends Annotation> annotationType) {
        return new String[0];
    }

    @Override
    public Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> annotationType) throws BeansException {
        return Map.of();
    }

    @Override
    public @Nullable <A extends Annotation> A findAnnotationOnBean(String beanName, Class<A> annotationType) throws NoSuchBeanDefinitionException {
        return null;
    }

    @Override
    public @Nullable <A extends Annotation> A findAnnotationOnBean(String beanName, Class<A> annotationType, boolean allowFactoryBeanInit) throws NoSuchBeanDefinitionException {
        return null;
    }

    @Override
    public <A extends Annotation> Set<A> findAllAnnotationsOnBean(String beanName, Class<A> annotationType, boolean allowFactoryBeanInit) throws NoSuchBeanDefinitionException {
        return Set.of();
    }

    @Override
    public Object getBean(String name) throws BeansException {
        return null;
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return null;
    }

    @Override
    public Object getBean(String name, @Nullable Object @Nullable ... args) throws BeansException {
        return null;
    }

    @Override
    public <T> T getBean(Class<T> requiredType) throws BeansException {
        return null;
    }

    @Override
    public <T> T getBean(Class<T> requiredType, @Nullable Object @Nullable ... args) throws BeansException {
        return null;
    }

    @Override
    public <T> ObjectProvider<T> getBeanProvider(Class<T> requiredType) {
        return null;
    }

    @Override
    public <T> ObjectProvider<T> getBeanProvider(ResolvableType requiredType) {
        return null;
    }

    @Override
    public <T> ObjectProvider<T> getBeanProvider(ParameterizedTypeReference<T> requiredType) {
        return null;
    }

    @Override
    public boolean containsBean(String name) {
        return false;
    }

    @Override
    public boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
        return false;
    }

    @Override
    public boolean isPrototype(String name) throws NoSuchBeanDefinitionException {
        return false;
    }

    @Override
    public boolean isTypeMatch(String name, ResolvableType typeToMatch) throws NoSuchBeanDefinitionException {
        return false;
    }

    @Override
    public boolean isTypeMatch(String name, Class<?> typeToMatch) throws NoSuchBeanDefinitionException {
        return false;
    }

    @Override
    public @Nullable Class<?> getType(String name) throws NoSuchBeanDefinitionException {
        return null;
    }

    @Override
    public @Nullable Class<?> getType(String name, boolean allowFactoryBeanInit) throws NoSuchBeanDefinitionException {
        return null;
    }

    @Override
    public String[] getAliases(String name) {
        return new String[0];
    }

    @Override
    public void publishEvent(Object event) {

    }

    @Override
    public @Nullable String getMessage(String code, Object @Nullable [] args, @Nullable String defaultMessage, @Nullable Locale locale) {
        return "";
    }

    @Override
    public String getMessage(String code, Object @Nullable [] args, @Nullable Locale locale) throws NoSuchMessageException {
        return "";
    }

    @Override
    public String getMessage(MessageSourceResolvable resolvable, @Nullable Locale locale) throws NoSuchMessageException {
        return "";
    }

    @Override
    public Environment getEnvironment() {
        return null;
    }

    @Override
    public Resource[] getResources(String locationPattern) throws IOException {
        return new Resource[0];
    }

    @Override
    public Resource getResource(String location) {
        return null;
    }

    @Override
    public @Nullable ClassLoader getClassLoader() {
        return null;
    }


//    public void destroy() throws Exception
//    {
//        map.clear();
//        System.out.println("bean is getting destryed");
//    }
}
