JFLAGS = -d bin -sourcepath src

default: 
	@echo " "
	@echo "3 Available Targets:" 
	@echo " "
	@echo "_______clean_______  this command removes editor tmpfiles and .class files"
	@echo "______compile______  this command forms the codebase which also checks for errors"
	@echo "________run________  this command builds codebase and runs the demo (client)"
	@echo " "
	@echo "-------------------Try to run these successively each time-----------------------"
	@echo " "

compile: 
	mkdir -p bin
	javac $(JFLAGS) main/pattern/*.java main/client/*.java

run: compile
	java -cp bin client.PrototypeDemo

clean:
	rm -rf bin
