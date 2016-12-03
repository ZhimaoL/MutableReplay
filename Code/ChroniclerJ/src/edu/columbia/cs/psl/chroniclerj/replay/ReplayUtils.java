
package edu.columbia.cs.psl.chroniclerj.replay;

import java.util.HashMap;

import edu.columbia.cs.psl.chroniclerj.CallbackInvocation;
import edu.columbia.cs.psl.chroniclerj.ExportedLog;
import edu.columbia.cs.psl.chroniclerj.ExportedSerializableLog;

public class ReplayUtils {
    @SuppressWarnings({
            "rawtypes", "unchecked"
    })
    
    public static void printArg(String typename){
    	/*
    	if(typename.equals("aLogArg"))
        	System.out.println("aLogArg = " + ExportedSerializableLog.aLogArg[0]);
    	if(typename.equals("iLogArg"))
        	System.out.println("iLogArg = " + ExportedSerializableLog.iLogArg[0]);
    	if(typename.equals("jLogArg"))
        	System.out.println("jLogArg = " + ExportedSerializableLog.jLogArg[0]);
    	if(typename.equals("fLogArg"))
        	System.out.println("fLogArg = " + ExportedSerializableLog.fLogArg[0]);
    	if(typename.equals("dLogArg"))
        	System.out.println("dLogArg = " + ExportedSerializableLog.dLogArg[0]);
    	if(typename.equals("bLogArg"))
        	System.out.println("bLogArg = " + ExportedSerializableLog.bLogArg[0]);
    	if(typename.equals("zLogArg"))
        	System.out.println("zLogArg = " + ExportedSerializableLog.zLogArg[0]);
    	if(typename.equals("cLogArg"))
        	System.out.println("cLogArg = " + ExportedSerializableLog.cLogArg[0]);
    	if(typename.equals("sLogArg"))
        	System.out.println("sLogArg = " + ExportedSerializableLog.sLogArg[0]);   */	
    	
    	decreaseIndent();
    	printIndent();
    	
    	String arg_info = "Arguments: ";
    	if(typename.equals("aLogArg"))
        	System.out.println(arg_info + ExportedSerializableLog.aLogArg[0]);
    	if(typename.equals("iLogArg"))
        	System.out.println(arg_info + ExportedSerializableLog.iLogArg[0]);
    	if(typename.equals("jLogArg"))
        	System.out.println(arg_info + ExportedSerializableLog.jLogArg[0]);
    	if(typename.equals("fLogArg"))
        	System.out.println(arg_info + ExportedSerializableLog.fLogArg[0]);
    	if(typename.equals("dLogArg"))
        	System.out.println(arg_info + ExportedSerializableLog.dLogArg[0]);
    	if(typename.equals("bLogArg"))
        	System.out.println(arg_info + ExportedSerializableLog.bLogArg[0]);
    	if(typename.equals("zLogArg"))
        	System.out.println(arg_info + ExportedSerializableLog.zLogArg[0]);
    	if(typename.equals("cLogArg"))
        	System.out.println(arg_info + ExportedSerializableLog.cLogArg[0]);
    	if(typename.equals("sLogArg"))
        	System.out.println(arg_info + ExportedSerializableLog.sLogArg[0]);   	
    	
    }
    
    private static int prevIndex = -1;
    private static String prevFilename = "";
    
    public static void printLog(String currFilename, int currIndex){
    	
    	/* prevent double printing */ 
    	if((prevIndex == currIndex) && (prevFilename == currFilename)){
    		return;
    	}
    	else{
    		prevIndex = currIndex;
    		prevFilename = currFilename;
    	}
    	/*
    	if(currFilename.equals("aLog"))
        	System.out.println("aLog[" + currIndex + "] = " + ExportedSerializableLog.aLog[currIndex]);
    	if(currFilename.equals("iLog"))
        	System.out.println("iLog[" + currIndex + "] = " + ExportedSerializableLog.iLog[currIndex]);
        if(currFilename.equals("jLog"))
        	System.out.println("jLog[" + currIndex + "] = " + ExportedSerializableLog.jLog[currIndex]);
        if(currFilename.equals("fLog"))
        	System.out.println("fLog[" + currIndex + "] = " + ExportedSerializableLog.fLog[currIndex]);
        if(currFilename.equals("dLog"))
        	System.out.println("dLog[" + currIndex + "] = " + ExportedSerializableLog.dLog[currIndex]);
        if(currFilename.equals("bLog"))
        	System.out.println("bLog[" + currIndex + "] = " + ExportedSerializableLog.bLog[currIndex]);
        if(currFilename.equals("zLog"))
        	System.out.println("zLog[" + currIndex + "] = " + ExportedSerializableLog.zLog[currIndex]);
        if(currFilename.equals("cLog"))
        	System.out.println("cLog[" + currIndex + "] = " + ExportedSerializableLog.cLog[currIndex]);
        if(currFilename.equals("sLog"))
        	System.out.println("sLog[" + currIndex + "] = " + ExportedSerializableLog.sLog[currIndex]);*/
    	
    	decreaseIndent();
    	printIndent();
    	
    	String ret_info = "return value : ";
    	if(currFilename.equals("aLog"))
        	System.out.println(ret_info + ExportedSerializableLog.aLog[currIndex]);
    	if(currFilename.equals("iLog"))
        	System.out.println(ret_info + ExportedSerializableLog.iLog[currIndex]);
        if(currFilename.equals("jLog"))
        	System.out.println(ret_info + ExportedSerializableLog.jLog[currIndex]);
        if(currFilename.equals("fLog"))
        	System.out.println(ret_info + ExportedSerializableLog.fLog[currIndex]);
        if(currFilename.equals("dLog"))
        	System.out.println(ret_info + ExportedSerializableLog.dLog[currIndex]);
        if(currFilename.equals("bLog"))
        	System.out.println(ret_info + ExportedSerializableLog.bLog[currIndex]);
        if(currFilename.equals("zLog"))
        	System.out.println(ret_info + ExportedSerializableLog.zLog[currIndex]);
        if(currFilename.equals("cLog"))
        	System.out.println(ret_info + ExportedSerializableLog.cLog[currIndex]);
        if(currFilename.equals("sLog"))
        	System.out.println(ret_info + ExportedSerializableLog.sLog[currIndex]);
    	
    }
    
    /* In order to print the function calls sequence */
    public static int indent = 0;
    
    public static void printIndent() {
    	System.out.print(indent + "|");
    	for (int i=0 ; i<indent ; ++i) {
    		System.out.print("    ");
    	}
    	++indent;
    }
    
    public static void decreaseIndent() {
    	--indent;
    }
    
    
    
    public static int getNextIndex(HashMap replayIndexMap, String[] threadEntries, int fill,
            String logClass){//, String filename) {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("Finalizer"))
            threadName = threadName + curFinalizer;
        if (!replayIndexMap.containsKey(threadName))
            replayIndexMap.put(threadName, 0);
        int r = (int) replayIndexMap.get(threadName);
        while (r <= fill && threadEntries[r] != null && !threadEntries[r].equals(threadName)) {
            r++;
        }
        checkForDispatch();
        if (threadEntries[r] == null) {
            // System.out.println(Arrays.deepToString(threadEntries));

            // System.out.println(Arrays.deepToString(ExportedSerializableLog.iLog_owners));
            return r;
        }
        if (threadEntries[r] != null && threadEntries[r].equals(threadName)) {
            replayIndexMap.put(threadName, r);
            //printLog(filename, r);
            return r;
        }

        // System.out.println("Skipping " + threadEntries[r] + " vs " +
        // threadName);
        return -1;
    }

    public static HashMap<Integer, CallbackInvocation> dispatchesToRun;

    public static void checkForDispatch() {
        int curClock = ExportedLog.globalReplayIndex;
        // System.out.println("Looking for dispatches at " + curClock);
        if (dispatchesToRun != null && dispatchesToRun.get(curClock) != null) {
            // System.out.println("Invoke " + dispatchesToRun.get(curClock));
            if (dispatchesToRun.get(curClock).invoke()) {
                // System.out.println("Success");
                ExportedLog.globalReplayIndex++;
                checkForDispatch();
            }
        }
        curClock++;
        if (dispatchesToRun != null && dispatchesToRun.get(curClock) != null) {
            // System.out.println("Invoke " + dispatchesToRun.get(curClock));
            if (dispatchesToRun.get(curClock).invoke()) {
                // System.out.println("Success");
                ExportedLog.globalReplayIndex += 2;
                checkForDispatch();
            }
        }
    }

    public static long curFinalizer;

    @SuppressWarnings({
            "rawtypes", "unchecked"
    })
    public static int getNextIndexO(HashMap replayIndexMap, String[] threadEntries, int fill,
            String logClass, Object[] log) {

        String threadName = Thread.currentThread().getName();
        if (threadName.equals("Finalizer"))
            threadName = threadName + curFinalizer;
        if (!replayIndexMap.containsKey(threadName))
            replayIndexMap.put(threadName, 0);
        int r = (int) replayIndexMap.get(threadName);
        while (r <= fill && threadEntries[r] != null && !threadEntries[r].equals(threadName)) {
            r++;
        }

        checkForDispatch();
        if (threadEntries[r] == null)
            System.exit(-1);
        if (threadEntries[r].equals(threadName)) {
            replayIndexMap.put(threadName, r);
            return r;
        }

        return -1;
    }
}
