SRC = $(shell find src -name "*.java")

build:
	@mkdir -p out
	@javac -d out $(SRC)
	@[ -f out/.gitignore ] || echo "*" > out/.gitignore

run: build
	@java -cp out Main

re: clean run

clean:
	@rm -rf out

.PHONY: build run re clean