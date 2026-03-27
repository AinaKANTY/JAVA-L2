SRC = $(shell find src -name "*.java")

build:
	@mkdir -p out
	@javac -d out $(SRC)

run: build
	@java -cp out Main

re: clean run

clean:
	@rm -rf out

.PHONY: build run re clean