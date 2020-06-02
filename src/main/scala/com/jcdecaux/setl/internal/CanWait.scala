package com.jcdecaux.setl.internal

trait CanWait {

  /**
   * Wait for the execution to stop. Any exceptions that occurs during the execution
   * will be thrown in this thread.
   */
  def awaitTermination(): Unit

  /**
   * Wait for the execution to stop. Any exceptions that occurs during the execution
   * will be thrown in this thread.
   *
   * @param timeout time to wait in milliseconds
   * @return `true` if it's stopped; or throw the reported error during the execution; or `false`
   *         if the waiting time elapsed before returning from the method.
   */
  def awaitTerminationOrTimeout(timeout: Long): Unit

  /**
   * Stops the execution of this query if it is running.
   */
  def stop(): Unit
}