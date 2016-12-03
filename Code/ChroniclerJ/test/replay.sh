rm Solution.class
mv chroniclerj-crash-*.test replay/chroniclerj-crash.test
java -jar chroniclerj.jar -replay replay/chroniclerj-crash.test replay
