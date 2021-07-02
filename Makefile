build:
	clojure -X:depstar jar :jar heroicons-clojure.jar

deploy:
	mvn deploy:deploy-file -Dfile=heroicons-clojure.jar -DpomFile=pom.xml -DrepositoryId=clojars -Durl=https://clojars.org/repo
