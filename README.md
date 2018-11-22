# core.typed.ex1

Repo to reproduce error message:


Hi, Ambrose — 

It was a pleasure meeting you last year at Clojure/Conj 2017 — congrats on the progress on your Ph.D.! 

I finally got a chance to spend a couple of hours trying out core.typed — such brilliant work!  

I’ve almost got my first typed program running.  I made a little “hello, world program, following closely the directions here: https://frenchy64.github.io/2018/04/12/how-to-generate-your-specs.html.  (I couldn’t get that cli-time example to run.  I can send my notes if you’re interested.)

I successfully was able to infer specs, using “lein typed infer-spec xyz.core”, and it did indeed generate the `fdef` specs.

However, when I attempt to do a “lein run” or a “lein typed check xyz.core”, I get the following error messages, which seem to suggest that I need to somehow generate type annotations for def-imp, fspec-impl, spec-impl, cat-impl, int?, etc…

I can’t seem to figure out how to import those definitions — any advance?

Thank you!!!  And keep up the amazing work!
Cheers!  
Gene 

```
Genes-MacBook:xyz genekim$ lein typed check xyz.core
Initializing core.typed ...
Building core.typed base environments ...
Registering type annotation namespace clojure.core.typed.types.core
Finished building base environments
"Elapsed time: 4170.168281 msecs"
core.typed initialized.
Not checking clojure.spec.alpha (does not depend on clojure.core.typed)
Start checking xyz.core
Checked xyz.core in 699.515704 msecs
Type Error (file:/Users/genekim/src.local/core.typed/xyz/src/xyz/core.clj:10:1) 
Unannotated var clojure.spec.alpha/def-impl
Hint: Add the annotation for clojure.spec.alpha/def-impl via check-ns or cf


in:
clojure.spec.alpha/def-impl



Type Error (file:/Users/genekim/src.local/core.typed/xyz/src/xyz/core.clj:10:1) 
Unannotated var clojure.spec.alpha/fspec-impl
Hint: Add the annotation for clojure.spec.alpha/fspec-impl via check-ns or cf


in:
clojure.spec.alpha/fspec-impl



Type Error (file:/Users/genekim/src.local/core.typed/xyz/src/xyz/core.clj:10:1) 
Unannotated var clojure.spec.alpha/spec-impl
Hint: Add the annotation for clojure.spec.alpha/spec-impl via check-ns or cf


in:
clojure.spec.alpha/spec-impl



Type Error (file:/Users/genekim/src.local/core.typed/xyz/src/xyz/core.clj:10:20) 
Unannotated var clojure.spec.alpha/cat-impl
Hint: Add the annotation for clojure.spec.alpha/cat-impl via check-ns or cf


in:
clojure.spec.alpha/cat-impl



Type Error (file:/Users/genekim/src.local/core.typed/xyz/src/xyz/core.clj:10:30) 
Unannotated var clojure.core/int?
Hint: Add the annotation for clojure.core/int? via check-ns or cf


in:
int?



Type Error (file:/Users/genekim/src.local/core.typed/xyz/src/xyz/core.clj:10:1) 
Unannotated var clojure.spec.alpha/spec-impl
Hint: Add the annotation for clojure.spec.alpha/spec-impl via check-ns or cf


in:
clojure.spec.alpha/spec-impl



Type Error (file:/Users/genekim/src.local/core.typed/xyz/src/xyz/core.clj:10:41) 
Unannotated var clojure.core/int?
Hint: Add the annotation for clojure.core/int? via check-ns or cf


in:
int?



Type Checker: Found 7 errors
Found errors
Subprocess failed
Genes-MacBook:xyz genekim$ 
```

