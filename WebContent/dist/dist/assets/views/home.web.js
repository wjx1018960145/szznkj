"use strict";

var _stringify = require("babel-runtime/core-js/json/stringify");

var _stringify2 = _interopRequireDefault(_stringify);

var _typeof2 = require("babel-runtime/helpers/typeof");

var _typeof3 = _interopRequireDefault(_typeof2);

var _defineProperty = require("babel-runtime/core-js/object/define-property");

var _defineProperty2 = _interopRequireDefault(_defineProperty);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

!function (t) {
  function e(r) {
    if (n[r]) return n[r].exports;var i = n[r] = { i: r, l: !1, exports: {} };return t[r].call(i.exports, i, i.exports, e), i.l = !0, i.exports;
  }var n = {};e.m = t, e.c = n, e.i = function (t) {
    return t;
  }, e.d = function (t, n, r) {
    e.o(t, n) || (0, _defineProperty2.default)(t, n, { configurable: !1, enumerable: !0, get: r });
  }, e.n = function (t) {
    var n = t && t.__esModule ? function () {
      return t.default;
    } : function () {
      return t;
    };return e.d(n, "a", n), n;
  }, e.o = function (t, e) {
    return Object.prototype.hasOwnProperty.call(t, e);
  }, e.p = "", e(e.s = 220);
}({ 12: function _(t, e) {
    t.exports = function (t, e, n, r, i, s) {
      var o,
          a = t = t || {},
          l = (0, _typeof3.default)(t.default);"object" !== l && "function" !== l || (o = t, a = t.default);var c = "function" == typeof a ? a.options : a;e && (c.render = e.render, c.staticRenderFns = e.staticRenderFns, c._compiled = !0), n && (c.functional = !0), i && (c._scopeId = i);var A;if (s ? (A = function A(t) {
        t = t || this.$vnode && this.$vnode.ssrContext || this.parent && this.parent.$vnode && this.parent.$vnode.ssrContext, t || "undefined" == typeof __VUE_SSR_CONTEXT__ || (t = __VUE_SSR_CONTEXT__), r && r.call(this, t), t && t._registeredComponents && t._registeredComponents.add(s);
      }, c._ssrRegister = A) : r && (A = r), A) {
        var d = c.functional,
            p = d ? c.render : c.beforeCreate;d ? (c._injectStyles = A, c.render = function (t, e) {
          return A.call(e), p(t, e);
        }) : c.beforeCreate = p ? [].concat(p, A) : [A];
      }return { esModule: o, exports: a, options: c };
    };
  }, 128: function _(t, e, n) {
    e = t.exports = n(13)(), e.push([t.i, "\n.wxc-minibar[data-v-e026d130] {\n  width: 750px;\n  height: 90px;\n  flex-direction: row;\n  justify-content: space-between;\n  align-items: center;\n  background-color: #009ff0;\n}\n.left[data-v-e026d130] {\n  width: 180px;\n  padding-left: 32px;\n}\n.middle-title[data-v-e026d130] {\n  font-size: 30px;\n  color: #ffffff;\n  height: 36px;\n  line-height: 34px;\n}\n.right[data-v-e026d130] {\n  width: 180px;\n  padding-right: 32px;\n  align-items: flex-end;\n}\n.left-button[data-v-e026d130] {\n  width: 21px;\n  height: 36px;\n}\n.right-button[data-v-e026d130] {\n  width: 32px;\n  height: 32px;\n}\n.icon-text[data-v-e026d130] {\n  font-size: 28px;\n  color: #ffffff;\n}\n", "", { version: 3, sources: ["D:/weexWorkspace/android/ConsumeloanWX/node_modules/weex-ui/packages/wxc-minibar/node_modules\\weex-ui\\packages\\wxc-minibar/index.vue"], names: [], mappings: ";AAkCA;EACA,aAAA;EACA,aAAA;EACA,oBAAA;EACA,+BAAA;EACA,oBAAA;EACA,0BAAA;CACA;AAEA;EACA,aAAA;EACA,mBAAA;CACA;AAEA;EACA,gBAAA;EACA,eAAA;EACA,aAAA;EACA,kBAAA;CACA;AAEA;EACA,aAAA;EACA,oBAAA;EACA,sBAAA;CACA;AAEA;EACA,YAAA;EACA,aAAA;CACA;AAEA;EACA,YAAA;EACA,aAAA;CACA;AAEA;EACA,gBAAA;EACA,eAAA;CACA", file: "index.vue", sourcesContent: ['\x3c!-- CopyRight (C) 2017-2022 Alibaba Group Holding Limited. --\x3e\n\x3c!-- Created by Tw93 on 16/10/25. --\x3e\n\x3c!--A top navigation bar.--\x3e\n\n<template>\n  <div class="wxc-minibar" :style="{ backgroundColor: backgroundColor }" v-if="show">\n    <div class="left" @click="leftButtonClicked" aria-label="返回" :accessible="true">\n      <slot name="left">\n        <image :src="leftButton"\n               v-if="leftButton && !leftText"\n               class="left-button"></image>\n        <text v-if="leftText"\n              class="icon-text"\n              :style="{ color: textColor }">{{leftText}}</text>\n      </slot>\n    </div>\n    <slot name="middle">\n      <text class="middle-title" :style="{ color: textColor }">{{title}}</text>\n    </slot>\n    <div class="right" @click="rightButtonClicked">\n      <slot name="right">\n        <image v-if="rightButton && !rightText"\n               class="right-button"\n               :src="rightButton"\n               :aria-hidden="true"></image>\n        <text v-if="rightText"\n              class="icon-text"\n              :style="{ color: textColor }">{{rightText}}</text>\n      </slot>\n    </div>\n  </div>\n</template>\n\n<style scoped>\n  .wxc-minibar {\n    width: 750px;\n    height: 90px;\n    flex-direction: row;\n    justify-content: space-between;\n    align-items: center;\n    background-color: #009ff0;\n  }\n\n  .left {\n    width: 180px;\n    padding-left: 32px;\n  }\n\n  .middle-title {\n    font-size: 30px;\n    color: #ffffff;\n    height: 36px;\n    line-height: 34px;\n  }\n\n  .right {\n    width: 180px;\n    padding-right: 32px;\n    align-items: flex-end;\n  }\n\n  .left-button {\n    width: 21px;\n    height: 36px;\n  }\n\n  .right-button {\n    width: 32px;\n    height: 32px;\n  }\n\n  .icon-text {\n    font-size: 28px;\n    color: #ffffff;\n  }\n</style>\n\n<script>\n  const Navigator = weex.requireModule(\'navigator\');\n  export default {\n    props: {\n      backgroundColor: {\n        type: String,\n        default: \'#FFC900\'\n      },\n      leftButton: {\n        type: String,\n        default: \'https://gw.alicdn.com/tfs/TB1x18VpwMPMeJjy1XdXXasrXXa-21-36.png\'\n      },\n      textColor: {\n        type: String,\n        default: \'#3D3D3D\'\n      },\n      rightButton: {\n        type: String,\n        default: \'\'\n      },\n      title: {\n        type: String,\n        default: \'标题\'\n      },\n      leftText: {\n        type: String,\n        default: \'\'\n      },\n      rightText: {\n        type: String,\n        default: \'\'\n      },\n      useDefaultReturn: {\n        type: Boolean,\n        default: true\n      },\n      show: {\n        type: Boolean,\n        default: true\n      }\n    },\n    methods: {\n      leftButtonClicked () {\n        const self = this;\n        if (self.useDefaultReturn) {\n          Navigator.pop({}, e => {\n          });\n        }\n        self.$emit(\'wxcMinibarLeftButtonClicked\', {});\n      },\n      rightButtonClicked () {\n        const self = this;\n        if (self.rightText || self.rightButton) {\n          self.$emit(\'wxcMinibarRightButtonClicked\', {});\n        }\n      }\n    }\n  };\n<\/script>\n'], sourceRoot: "" }]);
  }, 129: function _(t, e, n) {
    "use strict";
    function r(t) {
      l || n(131);
    }Object.defineProperty(e, "__esModule", { value: !0 });var i = n(58),
        s = n.n(i);for (var o in i) {
      ["default", "default"].indexOf(o) < 0 && function (t) {
        n.d(e, t, function () {
          return i[t];
        });
      }(o);
    }var a = n(130),
        l = !1,
        c = n(12),
        A = r,
        d = c(s.a, a.a, !1, A, "data-v-e026d130", null);d.options.__file = "node_modules\\weex-ui\\packages\\wxc-minibar\\index.vue", e.default = d.exports;
  }, 13: function _(t, e) {
    t.exports = function () {
      var t = [];return t.toString = function () {
        for (var t = [], e = 0; e < this.length; e++) {
          var n = this[e];n[2] ? t.push("@media " + n[2] + "{" + n[1] + "}") : t.push(n[1]);
        }return t.join("");
      }, t.i = function (e, n) {
        "string" == typeof e && (e = [[null, e, ""]]);for (var r = {}, i = 0; i < this.length; i++) {
          var s = this[i][0];"number" == typeof s && (r[s] = !0);
        }for (i = 0; i < e.length; i++) {
          var o = e[i];"number" == typeof o[0] && r[o[0]] || (n && !o[2] ? o[2] = n : n && (o[2] = "(" + o[2] + ") and (" + n + ")"), t.push(o));
        }
      }, t;
    };
  }, 130: function _(t, e, n) {
    "use strict";
    var r = function r() {
      var t = this,
          e = t.$createElement,
          n = t._self._c || e;return t.show ? n("div", { staticClass: "wxc-minibar", staticStyle: t.$processStyle(void 0), style: t.$processStyle({ backgroundColor: t.backgroundColor }) }, [n("div", { staticClass: "left", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0), attrs: { "aria-label": "返回", accessible: !0 }, on: { click: t.leftButtonClicked } }, [t._t("left", [t.leftButton && !t.leftText ? n("image", { staticClass: "left-button", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0), attrs: { src: t.leftButton } }) : t._e(), t._v(" "), t.leftText ? n("text", { staticClass: "icon-text", staticStyle: t.$processStyle(void 0), style: t.$processStyle({ color: t.textColor }) }, [t._v(t._s(t.leftText))]) : t._e()])], 2), t._v(" "), t._t("middle", [n("text", { staticClass: "middle-title", staticStyle: t.$processStyle(void 0), style: t.$processStyle({ color: t.textColor }) }, [t._v(t._s(t.title))])]), t._v(" "), n("div", { staticClass: "right", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0), on: { click: t.rightButtonClicked } }, [t._t("right", [t.rightButton && !t.rightText ? n("image", { staticClass: "right-button", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0), attrs: { src: t.rightButton, "aria-hidden": !0 } }) : t._e(), t._v(" "), t.rightText ? n("text", { staticClass: "icon-text", staticStyle: t.$processStyle(void 0), style: t.$processStyle({ color: t.textColor }) }, [t._v(t._s(t.rightText))]) : t._e()])], 2)], 2) : t._e();
    },
        i = [];r._withStripped = !0;var s = { render: r, staticRenderFns: i };e.a = s;
  }, 131: function _(t, e, n) {
    var r = n(128);"string" == typeof r && (r = [[t.i, r, ""]]), r.locals && (t.exports = r.locals);n(14)("4bf84575", r, !1, {});
  }, 138: function _(t, e, n) {
    "use strict";
    Object.defineProperty(e, "__esModule", { value: !0 }), e.default = { props: ["imageList"], data: function data() {
        return {};
      }, methods: { onchange: function onchange(t) {} } };
  }, 14: function _(t, e, n) {
    function r(t) {
      for (var e = 0; e < t.length; e++) {
        var n = t[e],
            r = A[n.id];if (r) {
          r.refs++;for (var i = 0; i < r.parts.length; i++) {
            r.parts[i](n.parts[i]);
          }for (; i < n.parts.length; i++) {
            r.parts.push(s(n.parts[i]));
          }r.parts.length > n.parts.length && (r.parts.length = n.parts.length);
        } else {
          for (var o = [], i = 0; i < n.parts.length; i++) {
            o.push(s(n.parts[i]));
          }A[n.id] = { id: n.id, refs: 1, parts: o };
        }
      }
    }function i() {
      var t = document.createElement("style");return t.type = "text/css", d.appendChild(t), t;
    }function s(t) {
      var e,
          n,
          r = document.querySelector("style[" + m + '~="' + t.id + '"]');if (r) {
        if (f) return g;r.parentNode.removeChild(r);
      }if (x) {
        var s = u++;r = p || (p = i()), e = o.bind(null, r, s, !1), n = o.bind(null, r, s, !0);
      } else r = i(), e = a.bind(null, r), n = function n() {
        r.parentNode.removeChild(r);
      };return e(t), function (r) {
        if (r) {
          if (r.css === t.css && r.media === t.media && r.sourceMap === t.sourceMap) return;e(t = r);
        } else n();
      };
    }function o(t, e, n, r) {
      var i = n ? "" : r.css;if (t.styleSheet) t.styleSheet.cssText = v(e, i);else {
        var s = document.createTextNode(i),
            o = t.childNodes;o[e] && t.removeChild(o[e]), o.length ? t.insertBefore(s, o[e]) : t.appendChild(s);
      }
    }function a(t, e) {
      var n = e.css,
          r = e.media,
          i = e.sourceMap;if (r && t.setAttribute("media", r), h.ssrId && t.setAttribute(m, e.id), i && (n += "\n/*# sourceURL=" + i.sources[0] + " */", n += "\n/*# sourceMappingURL=data:application/json;base64," + btoa(unescape(encodeURIComponent((0, _stringify2.default)(i)))) + " */"), t.styleSheet) t.styleSheet.cssText = n;else {
        for (; t.firstChild;) {
          t.removeChild(t.firstChild);
        }t.appendChild(document.createTextNode(n));
      }
    }var l = "undefined" != typeof document;if ("undefined" != typeof DEBUG && DEBUG && !l) throw new Error("vue-style-loader cannot be used in a non-browser environment. Use { target: 'node' } in your Webpack config to indicate a server-rendering environment.");var c = n(39),
        A = {},
        d = l && (document.head || document.getElementsByTagName("head")[0]),
        p = null,
        u = 0,
        f = !1,
        g = function g() {},
        h = null,
        m = "data-vue-ssr-id",
        x = "undefined" != typeof navigator && /msie [6-9]\b/.test(navigator.userAgent.toLowerCase());t.exports = function (t, e, n, i) {
      f = n, h = i || {};var s = c(t, e);return r(s), function (e) {
        for (var n = [], i = 0; i < s.length; i++) {
          var o = s[i],
              a = A[o.id];a.refs--, n.push(a);
        }e ? (s = c(t, e), r(s)) : s = [];for (var i = 0; i < n.length; i++) {
          var a = n[i];if (0 === a.refs) {
            for (var l = 0; l < a.parts.length; l++) {
              a.parts[l]();
            }delete A[a.id];
          }
        }
      };
    };var v = function () {
      var t = [];return function (e, n) {
        return t[e] = n, t.filter(Boolean).join("\n");
      };
    }();
  }, 146: function _(t, e, n) {
    "use strict";
    function r(t) {
      l || n(164);
    }Object.defineProperty(e, "__esModule", { value: !0 });var i = n(138),
        s = n.n(i);for (var o in i) {
      ["default", "default"].indexOf(o) < 0 && function (t) {
        n.d(e, t, function () {
          return i[t];
        });
      }(o);
    }var a = n(161),
        l = !1,
        c = n(12),
        A = r,
        d = c(s.a, a.a, !1, A, "data-v-7daf6493", null);d.options.__file = "src\\assets\\components\\YXSlider.vue", e.default = d.exports;
  }, 151: function _(t, e, n) {
    "use strict";
    function r(t) {
      return t && t.__esModule ? t : { default: t };
    }Object.defineProperty(e, "__esModule", { value: !0 });var i = n(61),
        s = r(i),
        o = n(146),
        a = r(o),
        l = n(172),
        c = weex.requireModule("modal");e.default = { components: { "wxc-minibar": s.default, "yx-slider": a.default }, data: function data() {
        return { rightButton: l.MESSAGE_ICON, YXBanners: [{ title: "", src: "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3247568695,112898598&fm=27&gp=0.jpg" }, { title: "", src: "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1520500235719&di=3cb4eb4924464a82815069b4e652d2e3&imgtype=0&src=http%3A%2F%2Fimg.mp.itc.cn%2Fupload%2F20160519%2Fa3c0e27b19314ee586bb8431818ba51f_th.jpg" }, { title: "", src: "http://doc.zwwill.com/yanxuan/imgs/banner-1.jpg" }, { title: "", src: "http://doc.zwwill.com/yanxuan/imgs/banner-2.jpg" }], items: [{ src: "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2954275189,4191722338&fm=27&gp=0.jpg", name: "旅游贷", desc: "Genius only means hard-working all one's life" }, { src: "https://gw.alicdn.com/tps/TB1Hv1JPFXXXXa3XXXXXXXXXXXX-370-370.jpg", name: "进修贷款", desc: 'The man who has made up his mind to win will never say "impossible "' }, { src: "https://gw.alicdn.com/tps/TB1eNKuPFXXXXc_XpXXXXXXXXXX-370-370.jpg", name: "车贷", desc: "There is no such thing as a great talent without great will - power" }] };
      }, methods: { onrefresh: function onrefresh(t) {
          var e = this;c.toast({ message: "Refreshing", duration: 1 }), this.refreshing = !0, setTimeout(function () {
            e.refreshing = !1;
          }, 2e3);
        }, onpullingdown: function onpullingdown(t) {
          console.log("dy: " + t.dy), console.log("pullingDistance: " + t.pullingDistance), console.log("viewHeight: " + t.viewHeight), console.log("type: " + type);
        }, minibarRightButtonClick: function minibarRightButtonClick() {
          c.toast({ message: "消息", duration: 1 }), console.log("message");
        } } };
  }, 156: function _(t, e, n) {
    e = t.exports = n(13)(), e.push([t.i, "\n.iconfont[data-v-7daf6493] {\n    font-family:iconfont;\n}\n.image[data-v-7daf6493] {\n    width: 750px;\n    height: 400px;\n}\n.slider[data-v-7daf6493] {\n    width: 750px;\n    height: 400px;\n}\n.frame[data-v-7daf6493] {\n    width: 750px;\n    height: 400px;\n    position: relative;\n}\n.indicator[data-v-7daf6493] {\n    width: 750px;\n    height: 40px;\n    item-color: white;\n    item-selected-color: #b4282d;\n    item-size: 12px;\n    position: absolute;\n    bottom: 10px;\n    right: 0px;\n}\n", "", { version: 3, sources: ["D:/weexWorkspace/android/ConsumeloanWX/src/assets/components/src\\assets\\components/YXSlider.vue"], names: [], mappings: ";AASA;IACA,qBAAA;CACA;AACA;IACA,aAAA;IACA,cAAA;CACA;AACA;IACA,aAAA;IACA,cAAA;CACA;AACA;IACA,aAAA;IACA,cAAA;IACA,mBAAA;CACA;AACA;IACA,aAAA;IACA,aAAA;IACA,kBAAA;IACA,6BAAA;IACA,gBAAA;IACA,mBAAA;IACA,aAAA;IACA,WAAA;CACA", file: "YXSlider.vue", sourcesContent: ['<template>\n    <slider class="slider" auto-play="true" interval="3000" @change="onchange">\n        <div class="frame" v-for="img in imageList">\n            <image class="image" resize="stretch" :src="img.src"></image>\n        </div>\n        <indicator class="indicator"></indicator>\n    </slider>\n</template>\n<style scoped>\n    .iconfont {\n        font-family:iconfont;\n    }\n    .image {\n        width: 750px;\n        height: 400px;\n    }\n    .slider {\n        width: 750px;\n        height: 400px;\n    }\n    .frame {\n        width: 750px;\n        height: 400px;\n        position: relative;\n    }\n    .indicator {\n        width: 750px;\n        height: 40px;\n        item-color: white;\n        item-selected-color: #b4282d;\n        item-size: 12px;\n        position: absolute;\n        bottom: 10px;\n        right: 0px;\n    }\n</style>\n<script>\n    export default {\n        props:["imageList"],\n        data () {\n            return {\n            }\n        },\n        methods: {\n            onchange (event) {\n            }\n        }\n    }\n<\/script>'], sourceRoot: "" }]);
  }, 161: function _(t, e, n) {
    "use strict";
    var r = function r() {
      var t = this,
          e = t.$createElement,
          n = t._self._c || e;return n("slider", { staticClass: "slider", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0), attrs: { "auto-play": "true", interval: "3000" }, on: { change: t.onchange } }, [t._l(t.imageList, function (e) {
        return n("div", { staticClass: "frame", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0) }, [n("image", { staticClass: "image", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0), attrs: { resize: "stretch", src: e.src } })]);
      }), t._v(" "), n("indicator", { staticClass: "indicator", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0) })], 2);
    },
        i = [];r._withStripped = !0;var s = { render: r, staticRenderFns: i };e.a = s;
  }, 164: function _(t, e, n) {
    var r = n(156);"string" == typeof r && (r = [[t.i, r, ""]]), r.locals && (t.exports = r.locals);n(14)("7feea058", r, !1, {});
  }, 168: function _(t, e, n) {
    "use strict";
    function r(t) {
      l || n(187);
    }Object.defineProperty(e, "__esModule", { value: !0 });var i = n(151),
        s = n.n(i);for (var o in i) {
      ["default", "default"].indexOf(o) < 0 && function (t) {
        n.d(e, t, function () {
          return i[t];
        });
      }(o);
    }var a = n(182),
        l = !1,
        c = n(12),
        A = r,
        d = c(s.a, a.a, !1, A, "data-v-02962820", null);d.options.__file = "src\\assets\\views\\home.vue", e.default = d.exports;
  }, 172: function _(t, e, n) {
    "use strict";
    Object.defineProperty(e, "__esModule", { value: !0 });e.MESSAGE_ICON = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAACG0lEQVRoQ+2Y/U0DMQzF35sAmADYADagG8AGZQJgAtoJKBPABrABMAFlAtgAmMDooVSqTrrESRNoq/OfbS7xz37Oh4kNN264/xgA/juDQwa2MgNmtgvgBsBpALwHMCX5VRu4iYTM7AnAScfZZ5KjtQcwsyMArz2OHpOc14SomoEgnQsAkx4n9fttTSlVAVhy/BKA9B8z1cGsFsjKAGamQr1zON6FEsg5ycdVJLUSgJlpp1HUV7EZyavSCYoBzEwykN5rmOqiKBBFAEE2DzU8X5rjrERO2QChYN8LNJ/iVU0c5u5QJQBKtbTfwlTUOrXdVgKgQ0qHVQt7Idk9waPrZAEE+Xy28HwxJ8ksn7IGm5mio3tOSxuRfPYuMAB4I5UxbshAb7C2oQZid/0MlUSH6jD78E6WVcSa1MzMO3nJuKbb6ADgSMmQgVSQhhpIRKiphP7iMgdgL+dN4N5GzewAgF5hra7Si9yob6TXmesscAGY2XWk15Mqm9L/JySnqY+jAEEyuj63jnqfn8qGLne9PdUUwDj0fFKBaPl/9JmZAlDTqnb3IRc22q1I1kBooXglpLZiqleU1PUS4TzVakkC5ITLs83m7vOp9asChMuetr/9noXfSHqzmfL99/8WALGHf9Zz0UNQHSBkQcWvBtVOcOIbwDilZ4/D3TFNABaLhNMb3lN17QBKHMr9pmkGcp0pGT8AlESt5jcbn4EfuFu6MZc5YU4AAAAASUVORK5CYII=";
  }, 176: function _(t, e, n) {
    e = t.exports = n(13)(), e.push([t.i, '\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n/*@import "../../style/public.scss";*/\n.info_tag[data-v-02962820] {\n    margin: 4px;\n    width: 750px;\n    height: 48px;\n    background-color: white;\n    padding: 8px;\n    justify-content: flex-start;\n    flex-wrap: nowrap;\n    flex-direction: row;\n}\n.tag[data-v-02962820] {\n    margin-left: 4px;\n    margin-right: 4px;\n    width: 10px;\n    height: 30px;\n    background-color:#0088fb;\n}\n.text[data-v-02962820] {\n    color: #666666;\n    font-family:"\\5B8B\\4F53",serif;\n    font-size: 24px;\n}\n.product_name[data-v-02962820] {\n    color: #666666;\n    font-size: 26px;\n}\n.property[data-v-02962820] {\n    color: #FF5722;\n    font-size: 30px;\n}\n.recomend[data-v-02962820] {\n    margin-right: 4px;\n    margin-left: 4px;\n    background-color: white;\n    margin-bottom: 16px;\n}\n.wrapper[data-v-02962820] {\n    width: 750px;\n    position: absolute;\n    top: 0;\n    left: 0;\n    right: 0;\n    bottom: 0;\n    background-color: #f4f4f4;\n}\n.scroller[data-v-02962820] {\n    width: 750px;\n}\n', "", { version: 3, sources: ["D:/weexWorkspace/android/ConsumeloanWX/src/assets/views/src\\assets\\views/home.vue"], names: [], mappings: ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;AAiHA,sCAAA;AACA;IACA,YAAA;IACA,aAAA;IACA,aAAA;IACA,wBAAA;IACA,aAAA;IACA,4BAAA;IACA,kBAAA;IACA,oBAAA;CACA;AACA;IACA,iBAAA;IACA,kBAAA;IACA,YAAA;IACA,aAAA;IACA,yBAAA;CACA;AAEA;IACA,eAAA;IACA,+BAAA;IACA,gBAAA;CACA;AAEA;IACA,eAAA;IACA,gBAAA;CACA;AAEA;IACA,eAAA;IACA,gBAAA;CACA;AAEA;IACA,kBAAA;IACA,iBAAA;IACA,wBAAA;IACA,oBAAA;CACA;AAEA;IACA,aAAA;IACA,mBAAA;IACA,OAAA;IACA,QAAA;IACA,SAAA;IACA,UAAA;IACA,0BAAA;CACA;AAEA;IACA,aAAA;CACA", file: "home.vue", sourcesContent: ['<template>\r\n    <div class="wrapper">\r\n        <wxc-minibar title="有信金服"\r\n                     leftButton=""\r\n                     text-color="#FFFFFF"\r\n                     background-color="#00A3FF"\r\n                     @wxcMinibarRightButtonClicked="minibarRightButtonClick"\r\n                     :right-button="rightButton"></wxc-minibar>\r\n\r\n        <scroller offset-accuracy="300px">\r\n\r\n            \x3c!--<refresh class="refresh" @refresh="onrefresh" @pullingdown="onpullingdown"--\x3e\r\n            \x3c!--:display="refreshing ? \'show\' : \'hide\'">--\x3e\r\n            \x3c!--<text class="indicator-text">Refreshing ...</text>--\x3e\r\n            \x3c!--<loading-indicator class="indicator"></loading-indicator>--\x3e\r\n            \x3c!--</refresh>--\x3e\r\n\r\n            \x3c!----\x3e\r\n\r\n            <yx-slider :imageList="YXBanners"></yx-slider>\r\n            <div class="info_tag">\r\n                <div class="tag"></div>\r\n                <text class="text">推荐产品</text>\r\n            </div>\r\n\r\n            <waterfall class="scroller" column-count="2" column-gap="normal">\r\n                <cell v-for="(item, index) in items" :key="item.src" ref="index">\r\n                    <div class="recomend">\r\n                        <text v-if="item.name" class="product_name">{{item.name}}</text>\r\n                        <image style="width: 355px;height: 200px" :src="item.src">\r\n                        </image>\r\n                        <text class="property" id="property_1">旅游贷</text>\r\n                        <text class="property" id="property_2">旅游贷</text>\r\n                        <text class="property" id="property_3">旅游贷</text>\r\n                    </div>\r\n                </cell>\r\n\r\n            </waterfall>\r\n        </scroller>\r\n    </div>\r\n</template>\r\n\r\n<script>\r\n    import {WxcMinibar} from \'weex-ui\';\r\n    import YXSlider from \'../components/YXSlider.vue\'\r\n    import {MESSAGE_ICON} from \'../config/icon.js\'\r\n    const modal = weex.requireModule(\'modal\')\r\n\r\n    export default{\r\n        components: {\r\n            "wxc-minibar": WxcMinibar,\r\n            "yx-slider": YXSlider\r\n        },\r\n        data(){\r\n            return {\r\n                rightButton: MESSAGE_ICON,\r\n                YXBanners: [\r\n                    {\r\n                        title: \'\',\r\n                        src: \'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3247568695,112898598&fm=27&gp=0.jpg\'\r\n                    },\r\n                    {\r\n                        title: \'\',\r\n                        src: \'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1520500235719&di=3cb4eb4924464a82815069b4e652d2e3&imgtype=0&src=http%3A%2F%2Fimg.mp.itc.cn%2Fupload%2F20160519%2Fa3c0e27b19314ee586bb8431818ba51f_th.jpg\'\r\n                    },\r\n                    {title: \'\', src: \'http://doc.zwwill.com/yanxuan/imgs/banner-1.jpg\'},\r\n                    {title: \'\', src: \'http://doc.zwwill.com/yanxuan/imgs/banner-2.jpg\'},\r\n                ],\r\n                items: [\r\n                    {\r\n                        src: \'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2954275189,4191722338&fm=27&gp=0.jpg\',\r\n                        name: \'旅游贷\',\r\n                        desc: \'Genius only means hard-working all one\\\'s life\',\r\n                    },\r\n                    {\r\n                        src: \'https://gw.alicdn.com/tps/TB1Hv1JPFXXXXa3XXXXXXXXXXXX-370-370.jpg\',\r\n                        name: \'进修贷款\',\r\n                        desc: \'The man who has made up his mind to win will never say "impossible "\',\r\n                    },\r\n                    {\r\n                        src: \'https://gw.alicdn.com/tps/TB1eNKuPFXXXXc_XpXXXXXXXXXX-370-370.jpg\',\r\n                        name: \'车贷\',\r\n                        desc: \'There is no such thing as a great talent without great will - power\',\r\n                    }\r\n                ]\r\n            }\r\n        },\r\n        methods: {\r\n            onrefresh (event) {\r\n                modal.toast({message: \'Refreshing\', duration: 1})\r\n                this.refreshing = true\r\n                setTimeout(() => {\r\n                    this.refreshing = false\r\n                }, 2000)\r\n            },\r\n            onpullingdown (event) {\r\n                console.log("dy: " + event.dy)\r\n                console.log("pullingDistance: " + event.pullingDistance)\r\n                console.log("viewHeight: " + event.viewHeight)\r\n                console.log("type: " + type)\r\n            },\r\n            minibarRightButtonClick(){\r\n                modal.toast({\r\n                    message: "消息",\r\n                    duration: 1\r\n                })\r\n                console.log("message")\r\n            }\r\n        }\r\n    }\r\n<\/script>\r\n\r\n<style  scoped >\r\n    /*@import "../../style/public.scss";*/\r\n    .info_tag {\r\n        margin: 4px;\r\n        width: 750px;\r\n        height: 48px;\r\n        background-color: white;\r\n        padding: 8px;\r\n        justify-content: flex-start;\r\n        flex-wrap: nowrap;\r\n        flex-direction: row;\r\n    }\r\n    .tag {\r\n        margin-left: 4px;\r\n        margin-right: 4px;\r\n        width: 10px;\r\n        height: 30px;\r\n        background-color:#0088fb;\r\n    }\r\n\r\n    .text {\r\n        color: #666666;\r\n        font-family:"宋体",serif;\r\n        font-size: 24px;\r\n    }\r\n\r\n    .product_name {\r\n        color: #666666;\r\n        font-size: 26px;\r\n    }\r\n\r\n    .property {\r\n        color: #FF5722;\r\n        font-size: 30px;\r\n    }\r\n\r\n    .recomend {\r\n        margin-right: 4px;\r\n        margin-left: 4px;\r\n        background-color: white;\r\n        margin-bottom: 16px;\r\n    }\r\n\r\n    .wrapper {\r\n        width: 750px;\r\n        position: absolute;\r\n        top: 0;\r\n        left: 0;\r\n        right: 0;\r\n        bottom: 0;\r\n        background-color: #f4f4f4;\r\n    }\r\n\r\n    .scroller {\r\n        width: 750px;\r\n    }\r\n</style>'], sourceRoot: "" }]);
  }, 182: function _(t, e, n) {
    "use strict";
    var r = function r() {
      var t = this,
          e = t.$createElement,
          n = t._self._c || e;return n("div", { staticClass: "wrapper", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0) }, [n("wxc-minibar", { staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0), attrs: { title: "有信金服", leftButton: "", "text-color": "#FFFFFF", "background-color": "#00A3FF", "right-button": t.rightButton }, on: { wxcMinibarRightButtonClicked: t.minibarRightButtonClick } }), t._v(" "), n("scroller", { staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0), attrs: { "offset-accuracy": "300px" } }, [n("yx-slider", { staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0), attrs: { imageList: t.YXBanners } }), t._v(" "), n("div", { staticClass: "info_tag", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0) }, [n("div", { staticClass: "tag", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0) }), t._v(" "), n("text", { staticClass: "text", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0) }, [t._v("推荐产品")])]), t._v(" "), n("waterfall", { staticClass: "scroller", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0), attrs: { "column-count": "2", "column-gap": "normal" } }, t._l(t.items, function (e, r) {
        return n("cell", { key: e.src, ref: "index", refInFor: !0, staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0) }, [n("div", { staticClass: "recomend", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0) }, [e.name ? n("text", { staticClass: "product_name", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0) }, [t._v(t._s(e.name))]) : t._e(), t._v(" "), n("image", { staticStyle: t.$processStyle({ width: "355px", height: "200px" }), style: t.$processStyle(void 0), attrs: { src: e.src } }), t._v(" "), n("text", { staticClass: "property", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0), attrs: { id: "property_1" } }, [t._v("旅游贷")]), t._v(" "), n("text", { staticClass: "property", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0), attrs: { id: "property_2" } }, [t._v("旅游贷")]), t._v(" "), n("text", { staticClass: "property", staticStyle: t.$processStyle(void 0), style: t.$processStyle(void 0), attrs: { id: "property_3" } }, [t._v("旅游贷")])])]);
      }))], 1)], 1);
    },
        i = [];r._withStripped = !0;var s = { render: r, staticRenderFns: i };e.a = s;
  }, 187: function _(t, e, n) {
    var r = n(176);"string" == typeof r && (r = [[t.i, r, ""]]), r.locals && (t.exports = r.locals);n(14)("65b0b8d5", r, !1, {});
  }, 220: function _(t, e, n) {
    "use strict";
    var r = n(168);r.el = "#root", new Vue(r);
  }, 39: function _(t, e) {
    t.exports = function (t, e) {
      for (var n = [], r = {}, i = 0; i < e.length; i++) {
        var s = e[i],
            o = s[0],
            a = s[1],
            l = s[2],
            c = s[3],
            A = { id: t + ":" + i, css: a, media: l, sourceMap: c };r[o] ? r[o].parts.push(A) : n.push(r[o] = { id: o, parts: [A] });
      }return n;
    };
  }, 58: function _(t, e, n) {
    "use strict";
    Object.defineProperty(e, "__esModule", { value: !0 });var r = weex.requireModule("navigator");e.default = { props: { backgroundColor: { type: String, default: "#FFC900" }, leftButton: { type: String, default: "https://gw.alicdn.com/tfs/TB1x18VpwMPMeJjy1XdXXasrXXa-21-36.png" }, textColor: { type: String, default: "#3D3D3D" }, rightButton: { type: String, default: "" }, title: { type: String, default: "标题" }, leftText: { type: String, default: "" }, rightText: { type: String, default: "" }, useDefaultReturn: { type: Boolean, default: !0 }, show: { type: Boolean, default: !0 } }, methods: { leftButtonClicked: function leftButtonClicked() {
          var t = this;t.useDefaultReturn && r.pop({}, function (t) {}), t.$emit("wxcMinibarLeftButtonClicked", {});
        }, rightButtonClicked: function rightButtonClicked() {
          var t = this;(t.rightText || t.rightButton) && t.$emit("wxcMinibarRightButtonClicked", {});
        } } };
  }, 61: function _(t, e, n) {
    "use strict";
    function r(t) {
      return t && t.__esModule ? t : { default: t };
    }Object.defineProperty(e, "__esModule", { value: !0 });var i = n(129);Object.defineProperty(e, "default", { enumerable: !0, get: function get() {
        return r(i).default;
      } });
  } });
//# sourceMappingURL=home.web.js.map