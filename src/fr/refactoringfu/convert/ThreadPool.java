package fr.refactoringfu.convert;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

// REFACTO: Convert anonymous class to nested class (place cursor in anonymous class)
// REFACTO: Move file into new type

public class ThreadPool {
	
	public void createPool() {
		@SuppressWarnings("unused")
		ExecutorService pool = Executors.newFixedThreadPool(5,
				new ThreadFactory() {
					@Override
					public Thread newThread(Runnable runnable) {
						Thread t = new Thread(runnable);
						t.setName("Worker thread");
						t.setPriority(Thread.MIN_PRIORITY);
						t.setDaemon(true);
						return t;
					}

				});
	}
}
