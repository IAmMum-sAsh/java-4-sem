package pr4;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class MyExecutorService implements ExecutorService {
    private ExecutorService MyService;

    MyExecutorService(int n){
        MyService = Executors.newFixedThreadPool(n);
    }

    @Override
    public void shutdown() {
        MyService.shutdown();
    }

    @Override
    public List<Runnable> shutdownNow() {
        return MyService.shutdownNow();
    }

    @Override
    public boolean isShutdown() {
        return MyService.isShutdown();
    }

    @Override
    public boolean isTerminated() {
        return MyService.isTerminated();
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return MyService.awaitTermination(timeout, unit);
    }

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        return MyService.submit(task);
    }

    @Override
    public <T> Future<T> submit(Runnable task, T result) {
        return MyService.submit(task, result);
    }

    @Override
    public Future<?> submit(Runnable task) {
        return MyService.submit(task);
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return MyService.invokeAll(tasks);
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return MyService.invokeAll(tasks, timeout, unit);
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        return MyService.invokeAny(tasks);
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return MyService.invokeAny(tasks, timeout, unit);
    }

    @Override
    public void execute(Runnable command) {
        MyService.execute(command);
    }
}
