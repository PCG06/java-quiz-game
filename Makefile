SRC_DIR=src
BIN_DIR=bin
PACKAGE=quizgame
MAIN_CLASS=quizgame.App

# Compile only
compile:
	mkdir -p $(BIN_DIR)
	javac $(SRC_DIR)/$(PACKAGE)/*.java -d $(BIN_DIR)

# Compile and run
run: compile
	java -cp $(BIN_DIR) $(MAIN_CLASS)

# Clean compiled classes
clean:
	rm -rf $(BIN_DIR)
