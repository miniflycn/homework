#    gmake	      # Defaults to the first target: default
#    gmake default    # Same as gmake compile.
#    gmake compile    # Compiles Java code in this directory.
#    gmake style      # Runs style checks (only on instructional machines)
#    gmake check      # Compile if needed and test using HW1Test.
#    gmake clean      # Remove extraneous or rebuildable files

# Define $(SRCS) to be a list of Java files.
SRCS = Arrays.java IntList.java IntList2.java Lists.java Utils.java \
       HW2Test.java $(LAB_SRCS)

MAIN_CLASSES = Arrays.class Lists.class HW2Test.class $(LAB_MAIN_CLASSES)

# Complier flags for CLASSPATH
CLASSPATH = -cp ../lib/junit.jar:../lib/ucb.jar

# The targets following .PHONY aren't actually files; they serve as commands.
.PHONY: compile default check check-lab clean style

# By default, compile all sources
default: compile

# To compile all source files, just bring the file YearCheck.class up to date.
compile: $(MAIN_CLASSES)

# Run our style checks.
style:
	style61b $(SRCS)

# Test the compiled program, after first making sure it is up-to-date.
check: HW2Test.class
	java HW2Test > tests.out
	diff -b tests.std tests.out

# Remove extraneous or reconstructable files.
clean:
	rm -f *.class *~ *tests.out

$(MAIN_CLASSES): $(SRCS) 
	javac $(CLASSPATH) -g $(SRCS)
