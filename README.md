# example of issue with shadow

To replicate:

- `npm install`
- `npm run build`
- `npm run serve`
- Go to localhost:8000

Console should show:

```
js.js:74 shadow-cljs - failed to load 34
shadow.js.jsRequire @ js.js:74
shadow$provide.<computed> @ index.js:5
shadow.js.jsRequire @ js.js:66
shadow$provide.<computed> @ index.js:8
shadow.js.jsRequire @ js.js:66
shadow$provide.<computed> @ index.js:6
shadow.js.jsRequire @ js.js:66
shadow.js.require @ js.js:113
(anonymous) @ index.js:2
(anonymous) @ append.js:2
js.js:74 shadow-cljs - failed to load 49
shadow.js.jsRequire @ js.js:74
shadow$provide.<computed> @ index.js:8
shadow.js.jsRequire @ js.js:66
shadow$provide.<computed> @ index.js:6
shadow.js.jsRequire @ js.js:66
shadow.js.require @ js.js:113
(anonymous) @ index.js:2
(anonymous) @ append.js:2
js.js:74 shadow-cljs - failed to load 124
shadow.js.jsRequire @ js.js:74
shadow$provide.<computed> @ index.js:6
shadow.js.jsRequire @ js.js:66
shadow.js.require @ js.js:113
(anonymous) @ index.js:2
(anonymous) @ append.js:2
js.js:74 shadow-cljs - failed to load 148
shadow.js.jsRequire @ js.js:74
shadow.js.require @ js.js:113
(anonymous) @ index.js:2
(anonymous) @ append.js:2
index.js:5 Uncaught TypeError: $jscomp.inherits is not a function
    at Object.shadow$provide.<computed> (index.js:5)
    at shadow.js.jsRequire (js.js:66)
    at Object.shadow$provide.<computed> (index.js:5)
    at shadow.js.jsRequire (js.js:66)
    at Object.shadow$provide.<computed> (index.js:8)
    at shadow.js.jsRequire (js.js:66)
    at Object.shadow$provide.<computed> (index.js:6)
    at Object.shadow.js.jsRequire (js.js:66)
    at Object.shadow.js.require (js.js:113)
    at index.js:2
shadow$provide.<computed> @ index.js:5
shadow.js.jsRequire @ js.js:66
shadow$provide.<computed> @ index.js:5
shadow.js.jsRequire @ js.js:66
shadow$provide.<computed> @ index.js:8
shadow.js.jsRequire @ js.js:66
shadow$provide.<computed> @ index.js:6
shadow.js.jsRequire @ js.js:66
shadow.js.require @ js.js:113
(anonymous) @ index.js:2
(anonymous) @ append.js:2
```
