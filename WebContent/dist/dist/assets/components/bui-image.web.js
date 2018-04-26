"use strict";

var _typeof2 = require("babel-runtime/helpers/typeof");

var _typeof3 = _interopRequireDefault(_typeof2);

var _defineProperty = require("babel-runtime/core-js/object/define-property");

var _defineProperty2 = _interopRequireDefault(_defineProperty);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

!function (t) {
  function e(n) {
    if (r[n]) return r[n].exports;var i = r[n] = { i: n, l: !1, exports: {} };return t[n].call(i.exports, i, i.exports, e), i.l = !0, i.exports;
  }var r = {};e.m = t, e.c = r, e.i = function (t) {
    return t;
  }, e.d = function (t, r, n) {
    e.o(t, r) || (0, _defineProperty2.default)(t, r, { configurable: !1, enumerable: !0, get: n });
  }, e.n = function (t) {
    var r = t && t.__esModule ? function () {
      return t.default;
    } : function () {
      return t;
    };return e.d(r, "a", r), r;
  }, e.o = function (t, e) {
    return Object.prototype.hasOwnProperty.call(t, e);
  }, e.p = "", e(e.s = 218);
}({ 12: function _(t, e) {
    t.exports = function (t, e, r, n, i, o) {
      var s,
          c = t = t || {},
          a = (0, _typeof3.default)(t.default);"object" !== a && "function" !== a || (s = t, c = t.default);var l = "function" == typeof c ? c.options : c;e && (l.render = e.render, l.staticRenderFns = e.staticRenderFns, l._compiled = !0), r && (l.functional = !0), i && (l._scopeId = i);var u;if (o ? (u = function u(t) {
        t = t || this.$vnode && this.$vnode.ssrContext || this.parent && this.parent.$vnode && this.parent.$vnode.ssrContext, t || "undefined" == typeof __VUE_SSR_CONTEXT__ || (t = __VUE_SSR_CONTEXT__), n && n.call(this, t), t && t._registeredComponents && t._registeredComponents.add(o);
      }, l._ssrRegister = u) : n && (u = n), u) {
        var d = l.functional,
            f = d ? l.render : l.beforeCreate;d ? (l._injectStyles = u, l.render = function (t, e) {
          return u.call(e), f(t, e);
        }) : l.beforeCreate = f ? [].concat(f, u) : [u];
      }return { esModule: s, exports: c, options: l };
    };
  }, 139: function _(t, e, r) {
    "use strict";
    t.exports = { computed: { imagePath: function imagePath() {
          return this.src.startsWith("http") || this.src.startsWith("file") ? this.src : this._getContext() + this.src;
        }, placeholderPath: function placeholderPath() {
          if ("" != this.placeholder) return this.placeholder.startsWith("http") || this.placeholder.startsWith("file") ? this.placeholder : this._getContext() + this.placeholder;
        } }, props: { width: { type: String }, height: { type: String }, src: { type: String }, resize: { type: String, default: "stretch" }, placeholder: { type: String, default: "" }, radius: { type: String, default: "0px" } }, methods: { _click: function _click(t) {
          this.$emit("click", t);
        }, _load: function _load() {
          this.$emit("load");
        }, _getContext: function _getContext() {
          var t = weex.config.bundleUrl,
              e = t.split("/").slice(0, -1).join("/");return t.indexOf("weex.html") > 0 && (e += "/dist/"), e;
        } } };
  }, 147: function _(t, e, r) {
    "use strict";
    Object.defineProperty(e, "__esModule", { value: !0 });var n = r(139),
        i = r.n(n);for (var o in n) {
      ["default", "default"].indexOf(o) < 0 && function (t) {
        r.d(e, t, function () {
          return n[t];
        });
      }(o);
    }var s = r(159),
        c = r(12),
        a = c(i.a, s.a, !1, null, null, null);a.options.__file = "src\\assets\\components\\bui-image.vue", e.default = a.exports;
  }, 159: function _(t, e, r) {
    "use strict";
    var n = function n() {
      var t = this,
          e = t.$createElement;return (t._self._c || e)("image", { staticStyle: t.$processStyle(void 0), style: t.$processStyle({ "border-radius": t.radius, width: t.width, height: t.height }), attrs: { src: t.imagePath, placeholder: t.placeholderPath, resize: t.resize }, on: { click: function click(e) {
            t._click(e);
          }, load: function load(e) {
            t._load();
          } } });
    },
        i = [];n._withStripped = !0;var o = { render: n, staticRenderFns: i };e.a = o;
  }, 218: function _(t, e, r) {
    "use strict";
    var n = r(147);n.el = "#root", new Vue(n);
  } });
//# sourceMappingURL=bui-image.web.js.map