# Simple ClojureScript X11 Event Listener

## Usage

In one window start the auto build:

```
lein deps
lein cljsbuild auto app
```

Once the first build completes, in another window, run it:

```
./run
```

Move your cursor around on the root window (desktop background) and
you will see X11 events printed.
