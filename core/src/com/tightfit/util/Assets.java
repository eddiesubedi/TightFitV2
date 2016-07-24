package com.tightfit.util;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetErrorListener;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.Disposable;

public class Assets implements Disposable, AssetErrorListener {
    public static final Assets instance = new Assets();
    public static AssetManager assetManager;
    public Player player;
    public Enemy0 assetEnemy0;
    public Enemy1 assetEnemy1;
    public Enemy2 assetEnemy2;
    public Enemy3 assetEnemy3;
    public Enemy4 assetEnemy4;
    public Enemy5 assetEnemy5;
    public Enemy6 assetEnemy6;
    public Enemy7 assetEnemy7;
    public Enemy8 assetEnemy8;
    public Enemy9 assetEnemy9;
    public Enemy10 assetEnemy10;
    public Enemy11 assetEnemy11;
    public Enemy12 assetEnemy12;
    public Enemy13 assetEnemy13;
    public Enemy14 assetEnemy14;
    public Enemy15 assetEnemy15;
    public Enemy16 assetEnemy16;
    public Enemy17 assetEnemy17;
    public Enemy18 assetEnemy18;
    public Enemy19 assetEnemy19;
    public Enemy20 assetEnemy20;
    public Enemy21 assetEnemy21;
    public Enemy22 assetEnemy22;
    public Enemy23 assetEnemy23;
    public Enemy24 assetEnemy24;
    public Enemy25 assetEnemy25;
    public Enemy26 assetEnemy26;
    public Enemy27 assetEnemy27;
    public Enemy28 assetEnemy28;
    public Enemy29 assetEnemy29;
    public Enemy30 assetEnemy30;
    public Enemy31 assetEnemy31;
    public Enemy32 assetEnemy32;
    public Enemy33 assetEnemy33;
    public Enemy34 assetEnemy34;
    public Enemy35 assetEnemy35;
    public Enemy36 assetEnemy36;
    public Enemy37 assetEnemy37;
    public Enemy38 assetEnemy38;
    public Enemy39 assetEnemy39;
    public Enemy40 assetEnemy40;
    public Enemy41 assetEnemy41;
    public Enemy42 assetEnemy42;
    public Enemy43 assetEnemy43;
    public Enemy44 assetEnemy44;
    public Enemy45 assetEnemy45;
    public Enemy46 assetEnemy46;
    public Enemy47 assetEnemy47;
    public Enemy48 assetEnemy48;
    public Enemy49 assetEnemy49;
    public Enemy50 assetEnemy50;
    public Enemy51 assetEnemy51;
    public Enemy52 assetEnemy52;
    public Enemy53 assetEnemy53;
    public Enemy54 assetEnemy54;
    public Enemy55 assetEnemy55;
    public Enemy56 assetEnemy56;
    public Enemy57 assetEnemy57;
    public Enemy58 assetEnemy58;
    public Enemy59 assetEnemy59;
    public Enemy60 assetEnemy60;
    public Enemy61 assetEnemy61;
    public Enemy62 assetEnemy62;
    public Enemy63 assetEnemy63;
    public Enemy64 assetEnemy64;
    public Enemy65 assetEnemy65;
    public Enemy66 assetEnemy66;
    public Enemy67 assetEnemy67;
    public Enemy68 assetEnemy68;
    public Enemy69 assetEnemy69;
    public Enemy70 assetEnemy70;
    public Enemy71 assetEnemy71;
    public Enemy72 assetEnemy72;
    public Enemy73 assetEnemy73;
    public Enemy74 assetEnemy74;
    public Enemy75 assetEnemy75;
    public Enemy76 assetEnemy76;
    public Enemy77 assetEnemy77;
    public Enemy78 assetEnemy78;
    public Enemy79 assetEnemy79;
    public Enemy80 assetEnemy80;
    public Enemy81 assetEnemy81;
    public Enemy82 assetEnemy82;
    public Enemy83 assetEnemy83;
    public Enemy84 assetEnemy84;
    public Enemy85 assetEnemy85;
    public Enemy86 assetEnemy86;
    public Enemy87 assetEnemy87;
    public Enemy88 assetEnemy88;
    public Enemy89 assetEnemy89;
    public Enemy90 assetEnemy90;
    public Enemy91 assetEnemy91;
    public Enemy92 assetEnemy92;
    public Enemy93 assetEnemy93;
    public Enemy94 assetEnemy94;
    public Enemy95 assetEnemy95;
    public Enemy96 assetEnemy96;
    public Enemy97 assetEnemy97;
    public Enemy98 assetEnemy98;
    public Enemy99 assetEnemy99;
    public Enemy100 assetEnemy100;
    public Enemy101 assetEnemy101;
    public Enemy102 assetEnemy102;
    public Enemy103 assetEnemy103;
    public Enemy104 assetEnemy104;
    public Enemy105 assetEnemy105;
    public Enemy106 assetEnemy106;
    public Enemy107 assetEnemy107;
    public Enemy108 assetEnemy108;
    public Enemy109 assetEnemy109;
    public Enemy110 assetEnemy110;
    public Enemy111 assetEnemy111;
    public Enemy112 assetEnemy112;
    public Enemy113 assetEnemy113;
    public Enemy114 assetEnemy114;
    public Enemy115 assetEnemy115;
    public Enemy116 assetEnemy116;
    public Enemy117 assetEnemy117;
    public Enemy118 assetEnemy118;
    public Enemy119 assetEnemy119;
    public Enemy120 assetEnemy120;
    public Enemy121 assetEnemy121;
    public Enemy122 assetEnemy122;
    public Enemy123 assetEnemy123;
    public Enemy124 assetEnemy124;
    public Enemy125 assetEnemy125;
    public Enemy126 assetEnemy126;
    public Enemy127 assetEnemy127;
    public Enemy128 assetEnemy128;
    public Enemy129 assetEnemy129;
    public Enemy130 assetEnemy130;
    public Enemy131 assetEnemy131;
    public Enemy132 assetEnemy132;
    public Enemy133 assetEnemy133;
    public Enemy134 assetEnemy134;
    public Enemy135 assetEnemy135;
    public Enemy136 assetEnemy136;
    public Enemy137 assetEnemy137;
    public Enemy138 assetEnemy138;
    public Enemy139 assetEnemy139;
    public Enemy140 assetEnemy140;
    public Enemy141 assetEnemy141;
    public Enemy142 assetEnemy142;
    public Enemy143 assetEnemy143;
    public Enemy144 assetEnemy144;
    public Enemy145 assetEnemy145;
    public Enemy146 assetEnemy146;
    public Enemy147 assetEnemy147;
    public Enemy148 assetEnemy148;
    public Enemy149 assetEnemy149;
    public Enemy150 assetEnemy150;
    public Enemy151 assetEnemy151;
    public Enemy152 assetEnemy152;
    public Enemy153 assetEnemy153;
    public Enemy154 assetEnemy154;
    public Enemy155 assetEnemy155;
    public Enemy156 assetEnemy156;
    public Enemy157 assetEnemy157;
    public Enemy158 assetEnemy158;
    public Enemy159 assetEnemy159;
    public Enemy160 assetEnemy160;
    public Enemy161 assetEnemy161;
    public Enemy162 assetEnemy162;
    public Enemy163 assetEnemy163;
    public Enemy164 assetEnemy164;
    public Enemy165 assetEnemy165;
    public Enemy166 assetEnemy166;
    public Enemy167 assetEnemy167;
    public Enemy168 assetEnemy168;
    public Enemy169 assetEnemy169;
    public Enemy170 assetEnemy170;
    public Enemy171 assetEnemy171;
    public Enemy172 assetEnemy172;
    public Enemy173 assetEnemy173;
    public Enemy174 assetEnemy174;
    public Enemy175 assetEnemy175;
    public Enemy176 assetEnemy176;
    public Enemy177 assetEnemy177;
    public Enemy178 assetEnemy178;
    public Enemy179 assetEnemy179;
    public Enemy180 assetEnemy180;
    public Enemy181 assetEnemy181;
    public Enemy182 assetEnemy182;
    public Enemy183 assetEnemy183;
    public Enemy184 assetEnemy184;
    public Enemy185 assetEnemy185;
    public Enemy186 assetEnemy186;
    public Enemy187 assetEnemy187;
    public Enemy188 assetEnemy188;
    public Enemy189 assetEnemy189;
    public Enemy190 assetEnemy190;
    public Enemy191 assetEnemy191;
    public Enemy192 assetEnemy192;
    public Enemy193 assetEnemy193;
    public Enemy194 assetEnemy194;
    public Enemy195 assetEnemy195;
    public Enemy196 assetEnemy196;
    public Enemy197 assetEnemy197;
    public Enemy198 assetEnemy198;
    public Enemy199 assetEnemy199;
    public Enemy200 assetEnemy200;
    public Enemy201 assetEnemy201;
    public Enemy202 assetEnemy202;
    public Enemy203 assetEnemy203;
    public Enemy204 assetEnemy204;
    public Enemy205 assetEnemy205;
    public Enemy206 assetEnemy206;
    public Enemy207 assetEnemy207;
    public Enemy208 assetEnemy208;
    public Enemy209 assetEnemy209;
    public Enemy210 assetEnemy210;
    public Enemy211 assetEnemy211;
    public Enemy212 assetEnemy212;
    public Enemy213 assetEnemy213;
    public Enemy214 assetEnemy214;
    public Enemy215 assetEnemy215;
    public Enemy216 assetEnemy216;
    public Enemy217 assetEnemy217;
    public Enemy218 assetEnemy218;
    public Enemy219 assetEnemy219;
    public Enemy220 assetEnemy220;
    public Enemy221 assetEnemy221;
    public Enemy222 assetEnemy222;
    public Enemy223 assetEnemy223;
    public Enemy224 assetEnemy224;
    public Enemy225 assetEnemy225;
    public Enemy226 assetEnemy226;
    public Enemy227 assetEnemy227;
    public Enemy228 assetEnemy228;
    public Enemy229 assetEnemy229;
    public Enemy230 assetEnemy230;
    public Enemy231 assetEnemy231;
    public Enemy232 assetEnemy232;
    public Enemy233 assetEnemy233;
    public Enemy234 assetEnemy234;
    public Enemy235 assetEnemy235;
    public Enemy236 assetEnemy236;
    public Enemy237 assetEnemy237;
    public Enemy238 assetEnemy238;
    public Enemy239 assetEnemy239;
    public Enemy240 assetEnemy240;
    public Enemy241 assetEnemy241;
    public Enemy242 assetEnemy242;
    public Enemy243 assetEnemy243;
    public Enemy244 assetEnemy244;
    public Enemy245 assetEnemy245;
    public Enemy246 assetEnemy246;
    public Enemy247 assetEnemy247;
    public Enemy248 assetEnemy248;
    public Enemy249 assetEnemy249;
    public Enemy250 assetEnemy250;
    public Enemy251 assetEnemy251;
    public Enemy252 assetEnemy252;
    public Enemy253 assetEnemy253;
    public Enemy254 assetEnemy254;
    public Enemy255 assetEnemy255;
    public Enemy256 assetEnemy256;
    public Enemy257 assetEnemy257;
    public Enemy258 assetEnemy258;
    public Enemy259 assetEnemy259;
    public Enemy260 assetEnemy260;
    public Enemy261 assetEnemy261;
    public Enemy262 assetEnemy262;
    public Enemy263 assetEnemy263;
    public Enemy264 assetEnemy264;
    public Enemy265 assetEnemy265;
    public Enemy266 assetEnemy266;
    public Enemy267 assetEnemy267;
    public Enemy268 assetEnemy268;
    public Enemy269 assetEnemy269;
    public Enemy270 assetEnemy270;
    public Enemy271 assetEnemy271;
    public Enemy272 assetEnemy272;
    public Enemy273 assetEnemy273;
    public Enemy274 assetEnemy274;
    public Enemy275 assetEnemy275;
    public Enemy276 assetEnemy276;
    public Enemy277 assetEnemy277;
    public Enemy278 assetEnemy278;
    public Enemy279 assetEnemy279;
    public Enemy280 assetEnemy280;
    public Enemy281 assetEnemy281;
    public Enemy282 assetEnemy282;
    public Enemy283 assetEnemy283;
    public Enemy284 assetEnemy284;
    public Enemy285 assetEnemy285;
    public Enemy286 assetEnemy286;
    public Enemy287 assetEnemy287;
    public Enemy288 assetEnemy288;
    public Enemy289 assetEnemy289;
    public Enemy290 assetEnemy290;
    public Enemy291 assetEnemy291;
    public Enemy292 assetEnemy292;
    public Enemy293 assetEnemy293;
    public Enemy294 assetEnemy294;
    public Enemy295 assetEnemy295;
    public Enemy296 assetEnemy296;
    public Enemy297 assetEnemy297;
    public Enemy298 assetEnemy298;
    public Enemy299 assetEnemy299;
    public Enemy300 assetEnemy300;
    public Enemy301 assetEnemy301;
    public Enemy302 assetEnemy302;
    public Enemy303 assetEnemy303;
    public Enemy304 assetEnemy304;
    public Enemy305 assetEnemy305;
    public Enemy306 assetEnemy306;
    public Enemy307 assetEnemy307;
    public Enemy308 assetEnemy308;
    public Enemy309 assetEnemy309;
    public Enemy310 assetEnemy310;
    public Enemy311 assetEnemy311;
    public Enemy312 assetEnemy312;
    public Enemy313 assetEnemy313;
    public Enemy314 assetEnemy314;
    public Enemy315 assetEnemy315;
    public Enemy316 assetEnemy316;
    public Enemy317 assetEnemy317;
    public Enemy318 assetEnemy318;
    public Enemy319 assetEnemy319;
    public Enemy320 assetEnemy320;
    public Enemy321 assetEnemy321;
    public Enemy322 assetEnemy322;
    public Enemy323 assetEnemy323;
    public Enemy324 assetEnemy324;
    public Enemy325 assetEnemy325;
    public Enemy326 assetEnemy326;
    public Enemy327 assetEnemy327;
    public Enemy328 assetEnemy328;
    public Enemy329 assetEnemy329;
    public Enemy330 assetEnemy330;
    public Enemy331 assetEnemy331;
    public Enemy332 assetEnemy332;
    public Enemy333 assetEnemy333;
    public Enemy334 assetEnemy334;
    public Enemy335 assetEnemy335;
    public Enemy336 assetEnemy336;
    public Enemy337 assetEnemy337;
    public Enemy338 assetEnemy338;
    public Enemy339 assetEnemy339;
    public Enemy340 assetEnemy340;
    public Enemy341 assetEnemy341;
    public Enemy342 assetEnemy342;
    public Enemy343 assetEnemy343;
    public Enemy344 assetEnemy344;
    public Enemy345 assetEnemy345;
    public Enemy346 assetEnemy346;
    public Enemy347 assetEnemy347;
    public Enemy348 assetEnemy348;
    public Enemy349 assetEnemy349;
    public Enemy350 assetEnemy350;
    public Enemy351 assetEnemy351;
    public Enemy352 assetEnemy352;
    public Enemy353 assetEnemy353;
    public Enemy354 assetEnemy354;
    public Enemy355 assetEnemy355;
    public Enemy356 assetEnemy356;
    public Enemy357 assetEnemy357;
    public Enemy358 assetEnemy358;
    public Enemy359 assetEnemy359;
    public Enemy360 assetEnemy360;
    public Enemy361 assetEnemy361;
    public Enemy362 assetEnemy362;
    public Enemy363 assetEnemy363;
    public Enemy364 assetEnemy364;
    public Enemy365 assetEnemy365;
    public Enemy366 assetEnemy366;
    public Enemy367 assetEnemy367;
    public Enemy368 assetEnemy368;
    public Enemy369 assetEnemy369;
    public Enemy370 assetEnemy370;
    public Enemy371 assetEnemy371;
    public Enemy372 assetEnemy372;
    public Enemy373 assetEnemy373;
    public Enemy374 assetEnemy374;
    public Enemy375 assetEnemy375;
    public Enemy376 assetEnemy376;
    public Enemy377 assetEnemy377;
    public Enemy378 assetEnemy378;
    public Enemy379 assetEnemy379;
    public Enemy380 assetEnemy380;
    public Enemy381 assetEnemy381;
    public Enemy382 assetEnemy382;
    public Enemy383 assetEnemy383;
    public Enemy384 assetEnemy384;
    public Enemy385 assetEnemy385;
    public Enemy386 assetEnemy386;
    public Enemy387 assetEnemy387;
    public Enemy388 assetEnemy388;
    public Enemy389 assetEnemy389;
    public Enemy390 assetEnemy390;
    public Enemy391 assetEnemy391;
    public Enemy392 assetEnemy392;
    public Enemy393 assetEnemy393;
    public Enemy394 assetEnemy394;
    public Enemy395 assetEnemy395;
    public Enemy396 assetEnemy396;
    public Enemy397 assetEnemy397;
    public Enemy398 assetEnemy398;
    public Enemy399 assetEnemy399;
    public Enemy400 assetEnemy400;
    public Enemy401 assetEnemy401;
    public Enemy402 assetEnemy402;
    public Enemy403 assetEnemy403;
    public Enemy404 assetEnemy404;
    public Enemy405 assetEnemy405;
    public Enemy406 assetEnemy406;
    public Enemy407 assetEnemy407;
    public Enemy408 assetEnemy408;
    public Enemy409 assetEnemy409;
    public Enemy410 assetEnemy410;
    public Enemy411 assetEnemy411;
    public Enemy412 assetEnemy412;
    public Enemy413 assetEnemy413;
    public Enemy414 assetEnemy414;
    public Enemy415 assetEnemy415;
    public Enemy416 assetEnemy416;
    public Enemy417 assetEnemy417;
    public Enemy418 assetEnemy418;
    public Enemy419 assetEnemy419;
    public Enemy420 assetEnemy420;
    public Enemy421 assetEnemy421;
    public Enemy422 assetEnemy422;
    public Enemy423 assetEnemy423;
    public Enemy424 assetEnemy424;
    public Enemy425 assetEnemy425;
    public Enemy426 assetEnemy426;
    public Enemy427 assetEnemy427;
    public Enemy428 assetEnemy428;
    public Enemy429 assetEnemy429;
    public Enemy430 assetEnemy430;
    public Enemy431 assetEnemy431;
    public Enemy432 assetEnemy432;
    public Enemy433 assetEnemy433;
    public Enemy434 assetEnemy434;
    public Enemy435 assetEnemy435;
    public Enemy436 assetEnemy436;
    public Enemy437 assetEnemy437;
    public Enemy438 assetEnemy438;
    public Enemy439 assetEnemy439;
    public Enemy440 assetEnemy440;
    public Enemy441 assetEnemy441;
    public Enemy442 assetEnemy442;
    public Enemy443 assetEnemy443;
    public Enemy444 assetEnemy444;
    public Enemy445 assetEnemy445;
    public Enemy446 assetEnemy446;
    public Enemy447 assetEnemy447;
    public Enemy448 assetEnemy448;
    public Enemy449 assetEnemy449;
    public Enemy450 assetEnemy450;
    public Enemy451 assetEnemy451;
    public Enemy452 assetEnemy452;
    public Enemy453 assetEnemy453;
    public Enemy454 assetEnemy454;
    public Enemy455 assetEnemy455;
    public Enemy456 assetEnemy456;
    public Enemy457 assetEnemy457;
    public Enemy458 assetEnemy458;
    public Enemy459 assetEnemy459;
    public Enemy460 assetEnemy460;
    public Enemy461 assetEnemy461;
    public Enemy462 assetEnemy462;
    public Enemy463 assetEnemy463;
    public Enemy464 assetEnemy464;
    public Enemy465 assetEnemy465;
    public Enemy466 assetEnemy466;
    public Enemy467 assetEnemy467;
    public Enemy468 assetEnemy468;
    public Enemy469 assetEnemy469;
    public Enemy470 assetEnemy470;
    public Enemy471 assetEnemy471;
    public Enemy472 assetEnemy472;
    public Enemy473 assetEnemy473;
    public Enemy474 assetEnemy474;
    public Enemy475 assetEnemy475;
    public Enemy476 assetEnemy476;
    public Enemy477 assetEnemy477;
    public Enemy478 assetEnemy478;
    public Enemy479 assetEnemy479;
    public Enemy480 assetEnemy480;
    public Enemy481 assetEnemy481;
    public Enemy482 assetEnemy482;
    public Enemy483 assetEnemy483;
    public Enemy484 assetEnemy484;
    public Enemy485 assetEnemy485;
    public Enemy486 assetEnemy486;
    public Enemy487 assetEnemy487;
    public Enemy488 assetEnemy488;
    public Enemy489 assetEnemy489;
    public Enemy490 assetEnemy490;
    public Enemy491 assetEnemy491;
    public Enemy492 assetEnemy492;
    public Enemy493 assetEnemy493;
    public Enemy494 assetEnemy494;
    public Enemy495 assetEnemy495;
    public Enemy496 assetEnemy496;
    public Enemy497 assetEnemy497;
    public Enemy498 assetEnemy498;
    public Enemy499 assetEnemy499;
    public Enemy500 assetEnemy500;
    public Enemy501 assetEnemy501;
    public Enemy502 assetEnemy502;
    public Enemy503 assetEnemy503;
    public Enemy504 assetEnemy504;
    public Enemy505 assetEnemy505;
    public Enemy506 assetEnemy506;
    public Enemy507 assetEnemy507;
    public Enemy508 assetEnemy508;
    public Enemy509 assetEnemy509;
    public Enemy510 assetEnemy510;
    public Enemy511 assetEnemy511;
    public Enemy512 assetEnemy512;
    public Enemy513 assetEnemy513;
    public Enemy514 assetEnemy514;
    public Enemy515 assetEnemy515;
    public Enemy516 assetEnemy516;
    public Enemy517 assetEnemy517;
    public Enemy518 assetEnemy518;
    public Enemy519 assetEnemy519;
    public Enemy520 assetEnemy520;
    public Enemy521 assetEnemy521;
    public Enemy522 assetEnemy522;
    public Enemy523 assetEnemy523;
    public Enemy524 assetEnemy524;
    public Enemy525 assetEnemy525;
    public Enemy526 assetEnemy526;
    public Enemy527 assetEnemy527;
    public Enemy528 assetEnemy528;
    public Enemy529 assetEnemy529;
    public Enemy530 assetEnemy530;
    public Enemy531 assetEnemy531;
    public Enemy532 assetEnemy532;
    public Enemy533 assetEnemy533;
    public Enemy534 assetEnemy534;
    public Enemy535 assetEnemy535;
    public Enemy536 assetEnemy536;
    public Enemy537 assetEnemy537;
    public Enemy538 assetEnemy538;
    public Enemy539 assetEnemy539;
    public Enemy540 assetEnemy540;
    public Enemy541 assetEnemy541;
    public Enemy542 assetEnemy542;
    public Enemy543 assetEnemy543;
    public Enemy544 assetEnemy544;
    public Enemy545 assetEnemy545;
    public Enemy546 assetEnemy546;
    public Enemy547 assetEnemy547;
    public Enemy548 assetEnemy548;
    public Enemy549 assetEnemy549;
    public Enemy550 assetEnemy550;
    public Enemy551 assetEnemy551;
    public Enemy552 assetEnemy552;
    public Enemy553 assetEnemy553;
    public Enemy554 assetEnemy554;
    public Enemy555 assetEnemy555;
    public Enemy556 assetEnemy556;
    public Enemy557 assetEnemy557;
    public Enemy558 assetEnemy558;
    public Enemy559 assetEnemy559;
    public Enemy560 assetEnemy560;
    public Enemy561 assetEnemy561;
    public Enemy562 assetEnemy562;
    public Enemy563 assetEnemy563;
    public Enemy564 assetEnemy564;
    public Enemy565 assetEnemy565;
    public Enemy566 assetEnemy566;
    public Enemy567 assetEnemy567;
    public Enemy568 assetEnemy568;
    public Enemy569 assetEnemy569;
    public Enemy570 assetEnemy570;
    public Enemy571 assetEnemy571;
    public Enemy572 assetEnemy572;
    public Enemy573 assetEnemy573;
    public Enemy574 assetEnemy574;
    public Enemy575 assetEnemy575;
    public Enemy576 assetEnemy576;
    public Enemy577 assetEnemy577;
    public Enemy578 assetEnemy578;
    public Enemy579 assetEnemy579;
    public Enemy580 assetEnemy580;
    public Enemy581 assetEnemy581;
    public Enemy582 assetEnemy582;
    public Enemy583 assetEnemy583;
    public Enemy584 assetEnemy584;
    public Enemy585 assetEnemy585;
    public Enemy586 assetEnemy586;
    public Enemy587 assetEnemy587;
    public Enemy588 assetEnemy588;
    public Enemy589 assetEnemy589;
    public Enemy590 assetEnemy590;
    public Enemy591 assetEnemy591;
    public Enemy592 assetEnemy592;
    public Enemy593 assetEnemy593;
    public Enemy594 assetEnemy594;
    public Enemy595 assetEnemy595;
    public Enemy596 assetEnemy596;
    public Enemy597 assetEnemy597;
    public Enemy598 assetEnemy598;
    public Enemy599 assetEnemy599;
    public Enemy600 assetEnemy600;
    public Enemy601 assetEnemy601;
    public Enemy602 assetEnemy602;
    public Enemy603 assetEnemy603;
    public Enemy604 assetEnemy604;
    public Enemy605 assetEnemy605;
    public Enemy606 assetEnemy606;
    public Enemy607 assetEnemy607;
    public Enemy608 assetEnemy608;
    public Enemy609 assetEnemy609;
    public Enemy610 assetEnemy610;
    public Enemy611 assetEnemy611;
    public Enemy612 assetEnemy612;
    public Enemy613 assetEnemy613;
    public Enemy614 assetEnemy614;
    public Enemy615 assetEnemy615;
    public Enemy616 assetEnemy616;
    public Enemy617 assetEnemy617;
    public Enemy618 assetEnemy618;
    public Enemy619 assetEnemy619;
    public Enemy620 assetEnemy620;
    public Enemy621 assetEnemy621;
    public Enemy622 assetEnemy622;
    public Enemy623 assetEnemy623;
    public Enemy624 assetEnemy624;
    public Enemy625 assetEnemy625;
    public Enemy626 assetEnemy626;
    public Enemy627 assetEnemy627;
    public Enemy628 assetEnemy628;
    public Enemy629 assetEnemy629;
    public Enemy630 assetEnemy630;
    public Enemy631 assetEnemy631;
    public Enemy632 assetEnemy632;
    public Enemy633 assetEnemy633;
    public Enemy634 assetEnemy634;
    public Enemy635 assetEnemy635;
    public Enemy636 assetEnemy636;
    public Enemy637 assetEnemy637;
    public Enemy638 assetEnemy638;
    public Enemy639 assetEnemy639;
    public Enemy640 assetEnemy640;
    public Enemy641 assetEnemy641;
    public Enemy642 assetEnemy642;
    public Enemy643 assetEnemy643;
    public Enemy644 assetEnemy644;
    public Enemy645 assetEnemy645;
    public Enemy646 assetEnemy646;
    public Enemy647 assetEnemy647;
    public Enemy648 assetEnemy648;
    public Enemy649 assetEnemy649;
    public Enemy650 assetEnemy650;
    public Enemy651 assetEnemy651;
    public Enemy652 assetEnemy652;
    public Enemy653 assetEnemy653;
    public Enemy654 assetEnemy654;
    public Enemy655 assetEnemy655;
    public Enemy656 assetEnemy656;
    public Enemy657 assetEnemy657;
    public Enemy658 assetEnemy658;
    public Enemy659 assetEnemy659;
    public Enemy660 assetEnemy660;
    public Enemy661 assetEnemy661;
    public Enemy662 assetEnemy662;
    public Enemy663 assetEnemy663;
    public Enemy664 assetEnemy664;
    public Enemy665 assetEnemy665;
    public Enemy666 assetEnemy666;
    public Enemy667 assetEnemy667;
    public Enemy668 assetEnemy668;
    public Enemy669 assetEnemy669;
    public Enemy670 assetEnemy670;
    public Enemy671 assetEnemy671;
    public Enemy672 assetEnemy672;
    public Enemy673 assetEnemy673;
    public Enemy674 assetEnemy674;
    public Enemy675 assetEnemy675;
    public Enemy676 assetEnemy676;
    public Enemy677 assetEnemy677;
    public Enemy678 assetEnemy678;
    public Enemy679 assetEnemy679;
    public Enemy680 assetEnemy680;
    public Enemy681 assetEnemy681;
    public Enemy682 assetEnemy682;
    public Enemy683 assetEnemy683;
    public Enemy684 assetEnemy684;
    public Enemy685 assetEnemy685;
    public Enemy686 assetEnemy686;
    public Enemy687 assetEnemy687;
    public Enemy688 assetEnemy688;
    public Enemy689 assetEnemy689;
    public Enemy690 assetEnemy690;
    public Enemy691 assetEnemy691;
    public Enemy692 assetEnemy692;
    public Enemy693 assetEnemy693;
    public Enemy694 assetEnemy694;
    public Enemy695 assetEnemy695;
    public Enemy696 assetEnemy696;
    public Enemy697 assetEnemy697;
    public Enemy698 assetEnemy698;
    public Enemy699 assetEnemy699;
    public Enemy700 assetEnemy700;
    public Enemy701 assetEnemy701;
    public Enemy702 assetEnemy702;
    public Enemy703 assetEnemy703;
    public Enemy704 assetEnemy704;
    public Enemy705 assetEnemy705;
    public Enemy706 assetEnemy706;
    public Enemy707 assetEnemy707;
    public Enemy708 assetEnemy708;
    public Enemy709 assetEnemy709;
    public Enemy710 assetEnemy710;
    public Enemy711 assetEnemy711;
    public Enemy712 assetEnemy712;
    public Enemy713 assetEnemy713;
    public Enemy714 assetEnemy714;
    public Enemy715 assetEnemy715;
    public Enemy716 assetEnemy716;
    public Enemy717 assetEnemy717;
    public Enemy718 assetEnemy718;
    public Enemy719 assetEnemy719;
    public Enemy720 assetEnemy720;
    public Enemy721 assetEnemy721;
    public Enemy722 assetEnemy722;
    public Enemy723 assetEnemy723;
    public Enemy724 assetEnemy724;
    public Enemy725 assetEnemy725;
    public Enemy726 assetEnemy726;
    public Enemy727 assetEnemy727;
    public Enemy728 assetEnemy728;
    public Enemy729 assetEnemy729;
    public Enemy730 assetEnemy730;
    public Enemy731 assetEnemy731;
    public Enemy732 assetEnemy732;
    public Enemy733 assetEnemy733;
    public Enemy734 assetEnemy734;
    public Enemy735 assetEnemy735;
    public Enemy736 assetEnemy736;
    public Enemy737 assetEnemy737;
    public Enemy738 assetEnemy738;
    public Enemy739 assetEnemy739;
    public Enemy740 assetEnemy740;
    public Enemy741 assetEnemy741;
    public Enemy742 assetEnemy742;
    public Enemy743 assetEnemy743;
    public Enemy744 assetEnemy744;
    public Enemy745 assetEnemy745;
    public Enemy746 assetEnemy746;
    public Enemy747 assetEnemy747;
    public Enemy748 assetEnemy748;
    public Enemy749 assetEnemy749;
    public Enemy750 assetEnemy750;
    public Enemy751 assetEnemy751;
    public Enemy752 assetEnemy752;
    public Enemy753 assetEnemy753;
    public Enemy754 assetEnemy754;
    public Enemy755 assetEnemy755;
    public Enemy756 assetEnemy756;
    public Enemy757 assetEnemy757;
    public Enemy758 assetEnemy758;
    public Enemy759 assetEnemy759;
    public Enemy760 assetEnemy760;
    public Enemy761 assetEnemy761;
    public Enemy762 assetEnemy762;
    public Enemy763 assetEnemy763;
    public Enemy764 assetEnemy764;
    public Enemy765 assetEnemy765;
    public Enemy766 assetEnemy766;
    public Enemy767 assetEnemy767;
    public Enemy768 assetEnemy768;
    public Enemy769 assetEnemy769;
    public Enemy770 assetEnemy770;
    public Enemy771 assetEnemy771;
    public Enemy772 assetEnemy772;
    public Enemy773 assetEnemy773;
    public Enemy774 assetEnemy774;
    public Enemy775 assetEnemy775;
    public Enemy776 assetEnemy776;
    public Enemy777 assetEnemy777;
    public Enemy778 assetEnemy778;
    public Enemy779 assetEnemy779;
    public Enemy780 assetEnemy780;
    public Enemy781 assetEnemy781;
    public Enemy782 assetEnemy782;
    public Enemy783 assetEnemy783;
    public Enemy784 assetEnemy784;
    public Enemy785 assetEnemy785;
    public Enemy786 assetEnemy786;
    public Enemy787 assetEnemy787;
    public Enemy788 assetEnemy788;
    public Enemy789 assetEnemy789;
    public Enemy790 assetEnemy790;
    public Enemy791 assetEnemy791;
    public Enemy792 assetEnemy792;
    public Enemy793 assetEnemy793;
    public Enemy794 assetEnemy794;
    public Enemy795 assetEnemy795;
    public Enemy796 assetEnemy796;
    public Enemy797 assetEnemy797;
    public Enemy798 assetEnemy798;
    public Enemy799 assetEnemy799;
    public Enemy800 assetEnemy800;
    public Enemy801 assetEnemy801;
    public Enemy802 assetEnemy802;
    public Enemy803 assetEnemy803;
    public Enemy804 assetEnemy804;
    public Enemy805 assetEnemy805;
    public Enemy806 assetEnemy806;
    public Enemy807 assetEnemy807;
    public Enemy808 assetEnemy808;
    public Enemy809 assetEnemy809;
    public Enemy810 assetEnemy810;
    public Enemy811 assetEnemy811;
    public Enemy812 assetEnemy812;
    public Enemy813 assetEnemy813;
    public Enemy814 assetEnemy814;
    public Enemy815 assetEnemy815;
    public Enemy816 assetEnemy816;
    public Enemy817 assetEnemy817;
    public Enemy818 assetEnemy818;
    public Enemy819 assetEnemy819;
    public Enemy820 assetEnemy820;
    public Enemy821 assetEnemy821;
    public Enemy822 assetEnemy822;
    public Enemy823 assetEnemy823;
    public Enemy824 assetEnemy824;
    public Enemy825 assetEnemy825;
    public Enemy826 assetEnemy826;
    public Enemy827 assetEnemy827;
    public Enemy828 assetEnemy828;
    public Enemy829 assetEnemy829;
    public Enemy830 assetEnemy830;
    public Enemy831 assetEnemy831;
    public Enemy832 assetEnemy832;
    public Enemy833 assetEnemy833;
    public Enemy834 assetEnemy834;
    public Enemy835 assetEnemy835;
    public Enemy836 assetEnemy836;
    public Enemy837 assetEnemy837;
    public Enemy838 assetEnemy838;
    public Enemy839 assetEnemy839;
    public Enemy840 assetEnemy840;
    public Enemy841 assetEnemy841;
    public Enemy842 assetEnemy842;
    public Enemy843 assetEnemy843;
    public Enemy844 assetEnemy844;
    public Enemy845 assetEnemy845;
    public Enemy846 assetEnemy846;
    public Enemy847 assetEnemy847;
    public Enemy848 assetEnemy848;
    public Enemy849 assetEnemy849;
    public Enemy850 assetEnemy850;
    public Enemy851 assetEnemy851;
    public Enemy852 assetEnemy852;
    public Enemy853 assetEnemy853;
    public Enemy854 assetEnemy854;
    public Enemy855 assetEnemy855;
    public Enemy856 assetEnemy856;
    public Enemy857 assetEnemy857;
    public Enemy858 assetEnemy858;
    public Enemy859 assetEnemy859;
    public Enemy860 assetEnemy860;
    public Enemy861 assetEnemy861;
    public Enemy862 assetEnemy862;
    public Enemy863 assetEnemy863;
    public Enemy864 assetEnemy864;
    public Enemy865 assetEnemy865;
    public Enemy866 assetEnemy866;
    public Enemy867 assetEnemy867;
    public Enemy868 assetEnemy868;
    public Enemy869 assetEnemy869;
    public Enemy870 assetEnemy870;
    public Enemy871 assetEnemy871;
    public Enemy872 assetEnemy872;
    public Enemy873 assetEnemy873;
    public Enemy874 assetEnemy874;
    public Enemy875 assetEnemy875;
    public Enemy876 assetEnemy876;
    public Enemy877 assetEnemy877;
    public Enemy878 assetEnemy878;
    public Enemy879 assetEnemy879;
    public Enemy880 assetEnemy880;
    public Enemy881 assetEnemy881;
    public Enemy882 assetEnemy882;
    public Enemy883 assetEnemy883;
    public Enemy884 assetEnemy884;
    public Enemy885 assetEnemy885;
    public Enemy886 assetEnemy886;
    public Enemy887 assetEnemy887;
    public Enemy888 assetEnemy888;
    public Enemy889 assetEnemy889;
    public Enemy890 assetEnemy890;
    public Enemy891 assetEnemy891;
    public Enemy892 assetEnemy892;
    public Enemy893 assetEnemy893;
    public Enemy894 assetEnemy894;
    public Enemy895 assetEnemy895;
    public Enemy896 assetEnemy896;
    public Enemy897 assetEnemy897;
    public Enemy898 assetEnemy898;
    public Enemy899 assetEnemy899;
    public Enemy900 assetEnemy900;
    public Enemy901 assetEnemy901;
    public Enemy902 assetEnemy902;
    public Enemy903 assetEnemy903;
    public Enemy904 assetEnemy904;
    public Enemy905 assetEnemy905;
    public Enemy906 assetEnemy906;
    public Enemy907 assetEnemy907;
    public Enemy908 assetEnemy908;
    public Enemy909 assetEnemy909;
    public Enemy910 assetEnemy910;
    public Enemy911 assetEnemy911;
    public Enemy912 assetEnemy912;
    public Enemy913 assetEnemy913;
    public Enemy914 assetEnemy914;
    public Enemy915 assetEnemy915;
    public Enemy916 assetEnemy916;
    public Enemy917 assetEnemy917;
    public Enemy918 assetEnemy918;
    public Enemy919 assetEnemy919;
    public Enemy920 assetEnemy920;
    public Enemy921 assetEnemy921;
    public Enemy922 assetEnemy922;
    public Enemy923 assetEnemy923;
    public Enemy924 assetEnemy924;
    public Enemy925 assetEnemy925;
    public Enemy926 assetEnemy926;
    public Enemy927 assetEnemy927;
    public Enemy928 assetEnemy928;
    public Enemy929 assetEnemy929;
    public Enemy930 assetEnemy930;
    public Enemy931 assetEnemy931;
    public Enemy932 assetEnemy932;
    public Enemy933 assetEnemy933;
    public Enemy934 assetEnemy934;
    public Enemy935 assetEnemy935;
    public Enemy936 assetEnemy936;
    public Enemy937 assetEnemy937;
    public Enemy938 assetEnemy938;
    public Enemy939 assetEnemy939;
    public Enemy940 assetEnemy940;
    public Enemy941 assetEnemy941;
    public Enemy942 assetEnemy942;
    public Enemy943 assetEnemy943;
    public Enemy944 assetEnemy944;
    public Enemy945 assetEnemy945;
    public Enemy946 assetEnemy946;
    public Enemy947 assetEnemy947;
    public Enemy948 assetEnemy948;
    public Enemy949 assetEnemy949;
    public Enemy950 assetEnemy950;
    public Enemy951 assetEnemy951;
    public Enemy952 assetEnemy952;
    public Enemy953 assetEnemy953;
    public Enemy954 assetEnemy954;
    public Enemy955 assetEnemy955;
    public Enemy956 assetEnemy956;
    public Enemy957 assetEnemy957;
    public Enemy958 assetEnemy958;
    public Enemy959 assetEnemy959;
    public Enemy960 assetEnemy960;
    public Enemy961 assetEnemy961;
    public Enemy962 assetEnemy962;
    public Enemy963 assetEnemy963;
    public Enemy964 assetEnemy964;
    public Enemy965 assetEnemy965;
    public Enemy966 assetEnemy966;
    public Enemy967 assetEnemy967;
    public Enemy968 assetEnemy968;
    public Enemy969 assetEnemy969;
    public Enemy970 assetEnemy970;
    public Enemy971 assetEnemy971;
    public Enemy972 assetEnemy972;
    public Enemy973 assetEnemy973;
    public Enemy974 assetEnemy974;
    public Enemy975 assetEnemy975;
    public Enemy976 assetEnemy976;
    public Enemy977 assetEnemy977;
    public Enemy978 assetEnemy978;
    public Enemy979 assetEnemy979;
    public Enemy980 assetEnemy980;
    public Enemy981 assetEnemy981;
    public Enemy982 assetEnemy982;
    public Enemy983 assetEnemy983;
    public Enemy984 assetEnemy984;
    public Enemy985 assetEnemy985;
    public Enemy986 assetEnemy986;
    public Enemy987 assetEnemy987;
    public Enemy988 assetEnemy988;
    public Enemy989 assetEnemy989;
    public Enemy990 assetEnemy990;
    public Enemy991 assetEnemy991;
    public Enemy992 assetEnemy992;
    public Enemy993 assetEnemy993;
    public Enemy994 assetEnemy994;
    public Enemy995 assetEnemy995;
    public Enemy996 assetEnemy996;
    public Enemy997 assetEnemy997;
    public Enemy998 assetEnemy998;
    public Enemy999 assetEnemy999;
    public Enemy1000 assetEnemy1000;
    public Enemy1001 assetEnemy1001;
    public Enemy1002 assetEnemy1002;
    public Enemy1003 assetEnemy1003;
    public Enemy1004 assetEnemy1004;
    public Enemy1005 assetEnemy1005;
    public Enemy1006 assetEnemy1006;
    public Enemy1007 assetEnemy1007;
    public Enemy1008 assetEnemy1008;
    public Enemy1009 assetEnemy1009;
    public Enemy1010 assetEnemy1010;
    public Enemy1011 assetEnemy1011;
    public Enemy1012 assetEnemy1012;
    public Enemy1013 assetEnemy1013;
    public Enemy1014 assetEnemy1014;
    public Enemy1015 assetEnemy1015;
    public Enemy1016 assetEnemy1016;
    public Enemy1017 assetEnemy1017;
    public Enemy1018 assetEnemy1018;
    public Enemy1019 assetEnemy1019;
    public Enemy1020 assetEnemy1020;
    public Enemy1021 assetEnemy1021;
    public Enemy1022 assetEnemy1022;
    public Enemy1023 assetEnemy1023;
    public Enemy1024 assetEnemy1024;
    public Enemy1025 assetEnemy1025;
    public Enemy1026 assetEnemy1026;
    public Enemy1027 assetEnemy1027;
    public Enemy1028 assetEnemy1028;
    public Enemy1029 assetEnemy1029;
    public Enemy1030 assetEnemy1030;
    public Enemy1031 assetEnemy1031;
    public Enemy1032 assetEnemy1032;
    public Enemy1033 assetEnemy1033;
    public Enemy1034 assetEnemy1034;
    public Enemy1035 assetEnemy1035;
    public Enemy1036 assetEnemy1036;
    public Enemy1037 assetEnemy1037;
    public Enemy1038 assetEnemy1038;
    public Enemy1039 assetEnemy1039;
    public Enemy1040 assetEnemy1040;
    public Enemy1041 assetEnemy1041;
    public Enemy1042 assetEnemy1042;
    public Enemy1043 assetEnemy1043;
    public Enemy1044 assetEnemy1044;
    public Enemy1045 assetEnemy1045;
    public Enemy1046 assetEnemy1046;
    public Enemy1047 assetEnemy1047;
    public Enemy1048 assetEnemy1048;
    public Enemy1049 assetEnemy1049;
    public Enemy1050 assetEnemy1050;
    public Enemy1051 assetEnemy1051;
    public Enemy1052 assetEnemy1052;
    public Enemy1053 assetEnemy1053;
    public Enemy1054 assetEnemy1054;
    public Enemy1055 assetEnemy1055;
    public Enemy1056 assetEnemy1056;
    public Enemy1057 assetEnemy1057;
    public Enemy1058 assetEnemy1058;
    public Enemy1059 assetEnemy1059;
    public Enemy1060 assetEnemy1060;
    public Enemy1061 assetEnemy1061;
    public Enemy1062 assetEnemy1062;
    public Enemy1063 assetEnemy1063;
    public Enemy1064 assetEnemy1064;
    public Enemy1065 assetEnemy1065;
    public Enemy1066 assetEnemy1066;
    public Enemy1067 assetEnemy1067;
    public Enemy1068 assetEnemy1068;
    public Enemy1069 assetEnemy1069;
    public Enemy1070 assetEnemy1070;
    public Enemy1071 assetEnemy1071;
    public Enemy1072 assetEnemy1072;
    public Enemy1073 assetEnemy1073;
    public Enemy1074 assetEnemy1074;
    public Enemy1075 assetEnemy1075;
    public Enemy1076 assetEnemy1076;
    public Enemy1077 assetEnemy1077;
    public Enemy1078 assetEnemy1078;
    public Enemy1079 assetEnemy1079;
    public Enemy1080 assetEnemy1080;
    public Enemy1081 assetEnemy1081;
    public Enemy1082 assetEnemy1082;
    public Enemy1083 assetEnemy1083;
    public Enemy1084 assetEnemy1084;
    public Enemy1085 assetEnemy1085;
    public Enemy1086 assetEnemy1086;
    public Enemy1087 assetEnemy1087;
    public Enemy1088 assetEnemy1088;
    public Enemy1089 assetEnemy1089;
    public Enemy1090 assetEnemy1090;
    public Enemy1091 assetEnemy1091;
    public Enemy1092 assetEnemy1092;
    public Enemy1093 assetEnemy1093;
    public Enemy1094 assetEnemy1094;
    public Enemy1095 assetEnemy1095;
    public Enemy1096 assetEnemy1096;
    public Enemy1097 assetEnemy1097;
    public Enemy1098 assetEnemy1098;
    public Enemy1099 assetEnemy1099;
    public Enemy1100 assetEnemy1100;
    public Enemy1101 assetEnemy1101;
    public Enemy1102 assetEnemy1102;
    public Enemy1103 assetEnemy1103;
    public Enemy1104 assetEnemy1104;
    public Enemy1105 assetEnemy1105;
    public Enemy1106 assetEnemy1106;
    public Enemy1107 assetEnemy1107;
    public Enemy1108 assetEnemy1108;
    public Enemy1109 assetEnemy1109;
    public Enemy1110 assetEnemy1110;
    public Enemy1111 assetEnemy1111;
    public Enemy1112 assetEnemy1112;
    public Enemy1113 assetEnemy1113;
    public Enemy1114 assetEnemy1114;
    public Enemy1115 assetEnemy1115;
    public Enemy1116 assetEnemy1116;
    public Enemy1117 assetEnemy1117;
    public Enemy1118 assetEnemy1118;
    public Enemy1119 assetEnemy1119;
    public Enemy1120 assetEnemy1120;
    public Enemy1121 assetEnemy1121;
    public Enemy1122 assetEnemy1122;
    public Enemy1123 assetEnemy1123;
    public Enemy1124 assetEnemy1124;
    public Enemy1125 assetEnemy1125;
    public Enemy1126 assetEnemy1126;
    public Enemy1127 assetEnemy1127;
    public Enemy1128 assetEnemy1128;
    public Enemy1129 assetEnemy1129;
    public Enemy1130 assetEnemy1130;
    public Enemy1131 assetEnemy1131;
    public Enemy1132 assetEnemy1132;
    public Enemy1133 assetEnemy1133;
    public Enemy1134 assetEnemy1134;
    public Enemy1135 assetEnemy1135;
    public Enemy1136 assetEnemy1136;
    public Enemy1137 assetEnemy1137;
    public Enemy1138 assetEnemy1138;
    public Enemy1139 assetEnemy1139;
    public Enemy1140 assetEnemy1140;
    public Enemy1141 assetEnemy1141;
    public Enemy1142 assetEnemy1142;
    public Enemy1143 assetEnemy1143;
    public Enemy1144 assetEnemy1144;
    public Enemy1145 assetEnemy1145;
    public Enemy1146 assetEnemy1146;
    public Enemy1147 assetEnemy1147;
    public Enemy1148 assetEnemy1148;
    public Enemy1149 assetEnemy1149;
    public Enemy1150 assetEnemy1150;
    public Enemy1151 assetEnemy1151;
    public Enemy1152 assetEnemy1152;
    public Enemy1153 assetEnemy1153;
    public Enemy1154 assetEnemy1154;
    public Enemy1155 assetEnemy1155;
    public Enemy1156 assetEnemy1156;
    public Enemy1157 assetEnemy1157;
    public Enemy1158 assetEnemy1158;
    public Enemy1159 assetEnemy1159;
    public Enemy1160 assetEnemy1160;
    public Enemy1161 assetEnemy1161;
    public Enemy1162 assetEnemy1162;
    public Enemy1163 assetEnemy1163;
    public Enemy1164 assetEnemy1164;
    public Enemy1165 assetEnemy1165;
    public Enemy1166 assetEnemy1166;
    public Enemy1167 assetEnemy1167;
    public Enemy1168 assetEnemy1168;
    public Enemy1169 assetEnemy1169;
    public Enemy1170 assetEnemy1170;
    public Enemy1171 assetEnemy1171;
    public Enemy1172 assetEnemy1172;
    public Enemy1173 assetEnemy1173;
    public Enemy1174 assetEnemy1174;
    public Enemy1175 assetEnemy1175;
    public Enemy1176 assetEnemy1176;
    public Enemy1177 assetEnemy1177;
    public Enemy1178 assetEnemy1178;
    public Enemy1179 assetEnemy1179;
    public Enemy1180 assetEnemy1180;
    public Enemy1181 assetEnemy1181;
    public Enemy1182 assetEnemy1182;
    public Enemy1183 assetEnemy1183;
    public Enemy1184 assetEnemy1184;
    public Enemy1185 assetEnemy1185;
    public Enemy1186 assetEnemy1186;
    public Enemy1187 assetEnemy1187;
    public Enemy1188 assetEnemy1188;
    public Enemy1189 assetEnemy1189;
    public Enemy1190 assetEnemy1190;
    public Enemy1191 assetEnemy1191;
    public Enemy1192 assetEnemy1192;
    public Enemy1193 assetEnemy1193;
    public Enemy1194 assetEnemy1194;
    public Enemy1195 assetEnemy1195;
    public Enemy1196 assetEnemy1196;
    public Enemy1197 assetEnemy1197;
    public Enemy1198 assetEnemy1198;
    public Enemy1199 assetEnemy1199;
    public Enemy1200 assetEnemy1200;
    public Enemy1201 assetEnemy1201;
    public Enemy1202 assetEnemy1202;
    public Enemy1203 assetEnemy1203;
    public Enemy1204 assetEnemy1204;
    public Enemy1205 assetEnemy1205;
    public Enemy1206 assetEnemy1206;
    public Enemy1207 assetEnemy1207;
    public Enemy1208 assetEnemy1208;
    public Enemy1209 assetEnemy1209;
    public Enemy1210 assetEnemy1210;
    public Enemy1211 assetEnemy1211;
    public Enemy1212 assetEnemy1212;
    public Enemy1213 assetEnemy1213;
    public Enemy1214 assetEnemy1214;
    public Enemy1215 assetEnemy1215;
    public Enemy1216 assetEnemy1216;
    public Enemy1217 assetEnemy1217;
    public Enemy1218 assetEnemy1218;
    public Enemy1219 assetEnemy1219;
    public Enemy1220 assetEnemy1220;
    public Enemy1221 assetEnemy1221;
    public Enemy1222 assetEnemy1222;
    public Enemy1223 assetEnemy1223;
    public Enemy1224 assetEnemy1224;
    public Enemy1225 assetEnemy1225;
    public Enemy1226 assetEnemy1226;
    public Enemy1227 assetEnemy1227;
    public Enemy1228 assetEnemy1228;
    public Enemy1229 assetEnemy1229;
    public Enemy1230 assetEnemy1230;
    public Enemy1231 assetEnemy1231;
    public Enemy1232 assetEnemy1232;
    public Enemy1233 assetEnemy1233;
    public Enemy1234 assetEnemy1234;
    public Enemy1235 assetEnemy1235;
    public Enemy1236 assetEnemy1236;
    public Enemy1237 assetEnemy1237;
    public Enemy1238 assetEnemy1238;
    public Enemy1239 assetEnemy1239;
    public Enemy1240 assetEnemy1240;
    public Enemy1241 assetEnemy1241;
    public Enemy1242 assetEnemy1242;
    public Enemy1243 assetEnemy1243;
    public Enemy1244 assetEnemy1244;
    public Enemy1245 assetEnemy1245;
    public Enemy1246 assetEnemy1246;
    public Enemy1247 assetEnemy1247;
    public Enemy1248 assetEnemy1248;
    public Enemy1249 assetEnemy1249;
    public Enemy1250 assetEnemy1250;
    public Enemy1251 assetEnemy1251;
    public Enemy1252 assetEnemy1252;
    public Enemy1253 assetEnemy1253;
    public Enemy1254 assetEnemy1254;
    public Enemy1255 assetEnemy1255;
    public Enemy1256 assetEnemy1256;
    public Enemy1257 assetEnemy1257;
    public Enemy1258 assetEnemy1258;
    public Enemy1259 assetEnemy1259;
    public Enemy1260 assetEnemy1260;
    public Enemy1261 assetEnemy1261;
    public Enemy1262 assetEnemy1262;
    public Enemy1263 assetEnemy1263;
    public Enemy1264 assetEnemy1264;
    public Enemy1265 assetEnemy1265;
    public Enemy1266 assetEnemy1266;
    public Enemy1267 assetEnemy1267;
    public Enemy1268 assetEnemy1268;
    public Enemy1269 assetEnemy1269;
    public Enemy1270 assetEnemy1270;
    public Enemy1271 assetEnemy1271;
    public Enemy1272 assetEnemy1272;
    public Enemy1273 assetEnemy1273;
    public Enemy1274 assetEnemy1274;
    public Enemy1275 assetEnemy1275;
    public Enemy1276 assetEnemy1276;
    public Enemy1277 assetEnemy1277;
    public Enemy1278 assetEnemy1278;
    public Enemy1279 assetEnemy1279;
    public Enemy1280 assetEnemy1280;
    public Enemy1281 assetEnemy1281;
    public Enemy1282 assetEnemy1282;
    public Enemy1283 assetEnemy1283;
    public Enemy1284 assetEnemy1284;
    public Enemy1285 assetEnemy1285;
    public Enemy1286 assetEnemy1286;
    public Enemy1287 assetEnemy1287;
    public Enemy1288 assetEnemy1288;
    public Enemy1289 assetEnemy1289;
    public Enemy1290 assetEnemy1290;
    public Enemy1291 assetEnemy1291;
    public Enemy1292 assetEnemy1292;
    public Enemy1293 assetEnemy1293;
    public Enemy1294 assetEnemy1294;
    public Enemy1295 assetEnemy1295;
    public Enemy1296 assetEnemy1296;
    public Enemy1297 assetEnemy1297;
    public Enemy1298 assetEnemy1298;
    public Enemy1299 assetEnemy1299;
    public Enemy1300 assetEnemy1300;
    public Enemy1301 assetEnemy1301;
    public Enemy1302 assetEnemy1302;
    public Enemy1303 assetEnemy1303;
    public Enemy1304 assetEnemy1304;
    public Enemy1305 assetEnemy1305;
    public Enemy1306 assetEnemy1306;
    public Enemy1307 assetEnemy1307;
    public Enemy1308 assetEnemy1308;
    public Enemy1309 assetEnemy1309;
    public Enemy1310 assetEnemy1310;
    public Enemy1311 assetEnemy1311;
    public Enemy1312 assetEnemy1312;
    public Enemy1313 assetEnemy1313;
    public Enemy1314 assetEnemy1314;
    public Enemy1315 assetEnemy1315;
    public Enemy1316 assetEnemy1316;
    public Enemy1317 assetEnemy1317;
    public Enemy1318 assetEnemy1318;
    public Enemy1319 assetEnemy1319;
    public Enemy1320 assetEnemy1320;
    public Enemy1321 assetEnemy1321;
    public Enemy1322 assetEnemy1322;
    public Enemy1323 assetEnemy1323;
    public Enemy1324 assetEnemy1324;
    public Enemy1325 assetEnemy1325;
    public Enemy1326 assetEnemy1326;
    public Enemy1327 assetEnemy1327;
    public Enemy1328 assetEnemy1328;
    public Enemy1329 assetEnemy1329;
    public Enemy1330 assetEnemy1330;
    public Enemy1331 assetEnemy1331;
    public Enemy1332 assetEnemy1332;
    public Enemy1333 assetEnemy1333;
    public Enemy1334 assetEnemy1334;
    public Enemy1335 assetEnemy1335;
    public Enemy1336 assetEnemy1336;
    public Enemy1337 assetEnemy1337;
    public Enemy1338 assetEnemy1338;
    public Enemy1339 assetEnemy1339;
    public Enemy1340 assetEnemy1340;
    public Enemy1341 assetEnemy1341;
    public Enemy1342 assetEnemy1342;
    public Enemy1343 assetEnemy1343;
    public Enemy1344 assetEnemy1344;
    public Enemy1345 assetEnemy1345;
    public Enemy1346 assetEnemy1346;
    public Enemy1347 assetEnemy1347;
    public Enemy1348 assetEnemy1348;
    public Enemy1349 assetEnemy1349;
    public Enemy1350 assetEnemy1350;
    public Enemy1351 assetEnemy1351;
    public Enemy1352 assetEnemy1352;
    public Enemy1353 assetEnemy1353;
    public Enemy1354 assetEnemy1354;
    public Enemy1355 assetEnemy1355;
    public Enemy1356 assetEnemy1356;
    public Enemy1357 assetEnemy1357;
    public Enemy1358 assetEnemy1358;
    public Enemy1359 assetEnemy1359;
    public Enemy1360 assetEnemy1360;
    public Enemy1361 assetEnemy1361;
    public Enemy1362 assetEnemy1362;
    public Enemy1363 assetEnemy1363;
    public Enemy1364 assetEnemy1364;
    public Enemy1365 assetEnemy1365;
    public Enemy1366 assetEnemy1366;
    public Enemy1367 assetEnemy1367;
    public Enemy1368 assetEnemy1368;
    public Enemy1369 assetEnemy1369;
    public Enemy1370 assetEnemy1370;
    public Enemy1371 assetEnemy1371;
    public Enemy1372 assetEnemy1372;
    public Enemy1373 assetEnemy1373;
    public Enemy1374 assetEnemy1374;
    public Enemy1375 assetEnemy1375;
    public Enemy1376 assetEnemy1376;
    public Enemy1377 assetEnemy1377;
    public Enemy1378 assetEnemy1378;
    public Enemy1379 assetEnemy1379;
    public Enemy1380 assetEnemy1380;
    public Enemy1381 assetEnemy1381;
    public Enemy1382 assetEnemy1382;
    public Enemy1383 assetEnemy1383;
    public Enemy1384 assetEnemy1384;
    public Enemy1385 assetEnemy1385;
    public Enemy1386 assetEnemy1386;
    public Enemy1387 assetEnemy1387;
    public Enemy1388 assetEnemy1388;
    public Enemy1389 assetEnemy1389;
    public Enemy1390 assetEnemy1390;
    public Enemy1391 assetEnemy1391;
    public Enemy1392 assetEnemy1392;
    public Enemy1393 assetEnemy1393;
    public Enemy1394 assetEnemy1394;
    public Enemy1395 assetEnemy1395;
    public Enemy1396 assetEnemy1396;
    public Enemy1397 assetEnemy1397;
    private Assets () {}
    public void init (AssetManager assetManager) {
        this.assetManager = assetManager;
        // set asset manager error handler
        assetManager.setErrorListener(this);
        // load texture atlas
        assetManager.load(Constants.TEXTURE_ATLAS_OBJECTS, TextureAtlas.class);
        // start loading assets and wait until finished
        assetManager.finishLoading();

        TextureAtlas atlas = assetManager.get(Constants.TEXTURE_ATLAS_OBJECTS);

        // enable texture filtering for pixel smoothing
        for (Texture t : atlas.getTextures()) {
            t.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        }
        player = new Player(atlas);
        assetEnemy0 = new Enemy0(atlas);
        assetEnemy1 = new Enemy1(atlas);
        assetEnemy2 = new Enemy2(atlas);
        assetEnemy3 = new Enemy3(atlas);
        assetEnemy4 = new Enemy4(atlas);
        assetEnemy5 = new Enemy5(atlas);
        assetEnemy6 = new Enemy6(atlas);
        assetEnemy7 = new Enemy7(atlas);
        assetEnemy8 = new Enemy8(atlas);
        assetEnemy9 = new Enemy9(atlas);
        assetEnemy10 = new Enemy10(atlas);
        assetEnemy11 = new Enemy11(atlas);
        assetEnemy12 = new Enemy12(atlas);
        assetEnemy13 = new Enemy13(atlas);
        assetEnemy14 = new Enemy14(atlas);
        assetEnemy15 = new Enemy15(atlas);
        assetEnemy16 = new Enemy16(atlas);
        assetEnemy17 = new Enemy17(atlas);
        assetEnemy18 = new Enemy18(atlas);
        assetEnemy19 = new Enemy19(atlas);
        assetEnemy20 = new Enemy20(atlas);
        assetEnemy21 = new Enemy21(atlas);
        assetEnemy22 = new Enemy22(atlas);
        assetEnemy23 = new Enemy23(atlas);
        assetEnemy24 = new Enemy24(atlas);
        assetEnemy25 = new Enemy25(atlas);
        assetEnemy26 = new Enemy26(atlas);
        assetEnemy27 = new Enemy27(atlas);
        assetEnemy28 = new Enemy28(atlas);
        assetEnemy29 = new Enemy29(atlas);
        assetEnemy30 = new Enemy30(atlas);
        assetEnemy31 = new Enemy31(atlas);
        assetEnemy32 = new Enemy32(atlas);
        assetEnemy33 = new Enemy33(atlas);
        assetEnemy34 = new Enemy34(atlas);
        assetEnemy35 = new Enemy35(atlas);
        assetEnemy36 = new Enemy36(atlas);
        assetEnemy37 = new Enemy37(atlas);
        assetEnemy38 = new Enemy38(atlas);
        assetEnemy39 = new Enemy39(atlas);
        assetEnemy40 = new Enemy40(atlas);
        assetEnemy41 = new Enemy41(atlas);
        assetEnemy42 = new Enemy42(atlas);
        assetEnemy43 = new Enemy43(atlas);
        assetEnemy44 = new Enemy44(atlas);
        assetEnemy45 = new Enemy45(atlas);
        assetEnemy46 = new Enemy46(atlas);
        assetEnemy47 = new Enemy47(atlas);
        assetEnemy48 = new Enemy48(atlas);
        assetEnemy49 = new Enemy49(atlas);
        assetEnemy50 = new Enemy50(atlas);
        assetEnemy51 = new Enemy51(atlas);
        assetEnemy52 = new Enemy52(atlas);
        assetEnemy53 = new Enemy53(atlas);
        assetEnemy54 = new Enemy54(atlas);
        assetEnemy55 = new Enemy55(atlas);
        assetEnemy56 = new Enemy56(atlas);
        assetEnemy57 = new Enemy57(atlas);
        assetEnemy58 = new Enemy58(atlas);
        assetEnemy59 = new Enemy59(atlas);
        assetEnemy60 = new Enemy60(atlas);
        assetEnemy61 = new Enemy61(atlas);
        assetEnemy62 = new Enemy62(atlas);
        assetEnemy63 = new Enemy63(atlas);
        assetEnemy64 = new Enemy64(atlas);
        assetEnemy65 = new Enemy65(atlas);
        assetEnemy66 = new Enemy66(atlas);
        assetEnemy67 = new Enemy67(atlas);
        assetEnemy68 = new Enemy68(atlas);
        assetEnemy69 = new Enemy69(atlas);
        assetEnemy70 = new Enemy70(atlas);
        assetEnemy71 = new Enemy71(atlas);
        assetEnemy72 = new Enemy72(atlas);
        assetEnemy73 = new Enemy73(atlas);
        assetEnemy74 = new Enemy74(atlas);
        assetEnemy75 = new Enemy75(atlas);
        assetEnemy76 = new Enemy76(atlas);
        assetEnemy77 = new Enemy77(atlas);
        assetEnemy78 = new Enemy78(atlas);
        assetEnemy79 = new Enemy79(atlas);
        assetEnemy80 = new Enemy80(atlas);
        assetEnemy81 = new Enemy81(atlas);
        assetEnemy82 = new Enemy82(atlas);
        assetEnemy83 = new Enemy83(atlas);
        assetEnemy84 = new Enemy84(atlas);
        assetEnemy85 = new Enemy85(atlas);
        assetEnemy86 = new Enemy86(atlas);
        assetEnemy87 = new Enemy87(atlas);
        assetEnemy88 = new Enemy88(atlas);
        assetEnemy89 = new Enemy89(atlas);
        assetEnemy90 = new Enemy90(atlas);
        assetEnemy91 = new Enemy91(atlas);
        assetEnemy92 = new Enemy92(atlas);
        assetEnemy93 = new Enemy93(atlas);
        assetEnemy94 = new Enemy94(atlas);
        assetEnemy95 = new Enemy95(atlas);
        assetEnemy96 = new Enemy96(atlas);
        assetEnemy97 = new Enemy97(atlas);
        assetEnemy98 = new Enemy98(atlas);
        assetEnemy99 = new Enemy99(atlas);
        assetEnemy100 = new Enemy100(atlas);
        assetEnemy101 = new Enemy101(atlas);
        assetEnemy102 = new Enemy102(atlas);
        assetEnemy103 = new Enemy103(atlas);
        assetEnemy104 = new Enemy104(atlas);
        assetEnemy105 = new Enemy105(atlas);
        assetEnemy106 = new Enemy106(atlas);
        assetEnemy107 = new Enemy107(atlas);
        assetEnemy108 = new Enemy108(atlas);
        assetEnemy109 = new Enemy109(atlas);
        assetEnemy110 = new Enemy110(atlas);
        assetEnemy111 = new Enemy111(atlas);
        assetEnemy112 = new Enemy112(atlas);
        assetEnemy113 = new Enemy113(atlas);
        assetEnemy114 = new Enemy114(atlas);
        assetEnemy115 = new Enemy115(atlas);
        assetEnemy116 = new Enemy116(atlas);
        assetEnemy117 = new Enemy117(atlas);
        assetEnemy118 = new Enemy118(atlas);
        assetEnemy119 = new Enemy119(atlas);
        assetEnemy120 = new Enemy120(atlas);
        assetEnemy121 = new Enemy121(atlas);
        assetEnemy122 = new Enemy122(atlas);
        assetEnemy123 = new Enemy123(atlas);
        assetEnemy124 = new Enemy124(atlas);
        assetEnemy125 = new Enemy125(atlas);
        assetEnemy126 = new Enemy126(atlas);
        assetEnemy127 = new Enemy127(atlas);
        assetEnemy128 = new Enemy128(atlas);
        assetEnemy129 = new Enemy129(atlas);
        assetEnemy130 = new Enemy130(atlas);
        assetEnemy131 = new Enemy131(atlas);
        assetEnemy132 = new Enemy132(atlas);
        assetEnemy133 = new Enemy133(atlas);
        assetEnemy134 = new Enemy134(atlas);
        assetEnemy135 = new Enemy135(atlas);
        assetEnemy136 = new Enemy136(atlas);
        assetEnemy137 = new Enemy137(atlas);
        assetEnemy138 = new Enemy138(atlas);
        assetEnemy139 = new Enemy139(atlas);
        assetEnemy140 = new Enemy140(atlas);
        assetEnemy141 = new Enemy141(atlas);
        assetEnemy142 = new Enemy142(atlas);
        assetEnemy143 = new Enemy143(atlas);
        assetEnemy144 = new Enemy144(atlas);
        assetEnemy145 = new Enemy145(atlas);
        assetEnemy146 = new Enemy146(atlas);
        assetEnemy147 = new Enemy147(atlas);
        assetEnemy148 = new Enemy148(atlas);
        assetEnemy149 = new Enemy149(atlas);
        assetEnemy150 = new Enemy150(atlas);
        assetEnemy151 = new Enemy151(atlas);
        assetEnemy152 = new Enemy152(atlas);
        assetEnemy153 = new Enemy153(atlas);
        assetEnemy154 = new Enemy154(atlas);
        assetEnemy155 = new Enemy155(atlas);
        assetEnemy156 = new Enemy156(atlas);
        assetEnemy157 = new Enemy157(atlas);
        assetEnemy158 = new Enemy158(atlas);
        assetEnemy159 = new Enemy159(atlas);
        assetEnemy160 = new Enemy160(atlas);
        assetEnemy161 = new Enemy161(atlas);
        assetEnemy162 = new Enemy162(atlas);
        assetEnemy163 = new Enemy163(atlas);
        assetEnemy164 = new Enemy164(atlas);
        assetEnemy165 = new Enemy165(atlas);
        assetEnemy166 = new Enemy166(atlas);
        assetEnemy167 = new Enemy167(atlas);
        assetEnemy168 = new Enemy168(atlas);
        assetEnemy169 = new Enemy169(atlas);
        assetEnemy170 = new Enemy170(atlas);
        assetEnemy171 = new Enemy171(atlas);
        assetEnemy172 = new Enemy172(atlas);
        assetEnemy173 = new Enemy173(atlas);
        assetEnemy174 = new Enemy174(atlas);
        assetEnemy175 = new Enemy175(atlas);
        assetEnemy176 = new Enemy176(atlas);
        assetEnemy177 = new Enemy177(atlas);
        assetEnemy178 = new Enemy178(atlas);
        assetEnemy179 = new Enemy179(atlas);
        assetEnemy180 = new Enemy180(atlas);
        assetEnemy181 = new Enemy181(atlas);
        assetEnemy182 = new Enemy182(atlas);
        assetEnemy183 = new Enemy183(atlas);
        assetEnemy184 = new Enemy184(atlas);
        assetEnemy185 = new Enemy185(atlas);
        assetEnemy186 = new Enemy186(atlas);
        assetEnemy187 = new Enemy187(atlas);
        assetEnemy188 = new Enemy188(atlas);
        assetEnemy189 = new Enemy189(atlas);
        assetEnemy190 = new Enemy190(atlas);
        assetEnemy191 = new Enemy191(atlas);
        assetEnemy192 = new Enemy192(atlas);
        assetEnemy193 = new Enemy193(atlas);
        assetEnemy194 = new Enemy194(atlas);
        assetEnemy195 = new Enemy195(atlas);
        assetEnemy196 = new Enemy196(atlas);
        assetEnemy197 = new Enemy197(atlas);
        assetEnemy198 = new Enemy198(atlas);
        assetEnemy199 = new Enemy199(atlas);
        assetEnemy200 = new Enemy200(atlas);
        assetEnemy201 = new Enemy201(atlas);
        assetEnemy202 = new Enemy202(atlas);
        assetEnemy203 = new Enemy203(atlas);
        assetEnemy204 = new Enemy204(atlas);
        assetEnemy205 = new Enemy205(atlas);
        assetEnemy206 = new Enemy206(atlas);
        assetEnemy207 = new Enemy207(atlas);
        assetEnemy208 = new Enemy208(atlas);
        assetEnemy209 = new Enemy209(atlas);
        assetEnemy210 = new Enemy210(atlas);
        assetEnemy211 = new Enemy211(atlas);
        assetEnemy212 = new Enemy212(atlas);
        assetEnemy213 = new Enemy213(atlas);
        assetEnemy214 = new Enemy214(atlas);
        assetEnemy215 = new Enemy215(atlas);
        assetEnemy216 = new Enemy216(atlas);
        assetEnemy217 = new Enemy217(atlas);
        assetEnemy218 = new Enemy218(atlas);
        assetEnemy219 = new Enemy219(atlas);
        assetEnemy220 = new Enemy220(atlas);
        assetEnemy221 = new Enemy221(atlas);
        assetEnemy222 = new Enemy222(atlas);
        assetEnemy223 = new Enemy223(atlas);
        assetEnemy224 = new Enemy224(atlas);
        assetEnemy225 = new Enemy225(atlas);
        assetEnemy226 = new Enemy226(atlas);
        assetEnemy227 = new Enemy227(atlas);
        assetEnemy228 = new Enemy228(atlas);
        assetEnemy229 = new Enemy229(atlas);
        assetEnemy230 = new Enemy230(atlas);
        assetEnemy231 = new Enemy231(atlas);
        assetEnemy232 = new Enemy232(atlas);
        assetEnemy233 = new Enemy233(atlas);
        assetEnemy234 = new Enemy234(atlas);
        assetEnemy235 = new Enemy235(atlas);
        assetEnemy236 = new Enemy236(atlas);
        assetEnemy237 = new Enemy237(atlas);
        assetEnemy238 = new Enemy238(atlas);
        assetEnemy239 = new Enemy239(atlas);
        assetEnemy240 = new Enemy240(atlas);
        assetEnemy241 = new Enemy241(atlas);
        assetEnemy242 = new Enemy242(atlas);
        assetEnemy243 = new Enemy243(atlas);
        assetEnemy244 = new Enemy244(atlas);
        assetEnemy245 = new Enemy245(atlas);
        assetEnemy246 = new Enemy246(atlas);
        assetEnemy247 = new Enemy247(atlas);
        assetEnemy248 = new Enemy248(atlas);
        assetEnemy249 = new Enemy249(atlas);
        assetEnemy250 = new Enemy250(atlas);
        assetEnemy251 = new Enemy251(atlas);
        assetEnemy252 = new Enemy252(atlas);
        assetEnemy253 = new Enemy253(atlas);
        assetEnemy254 = new Enemy254(atlas);
        assetEnemy255 = new Enemy255(atlas);
        assetEnemy256 = new Enemy256(atlas);
        assetEnemy257 = new Enemy257(atlas);
        assetEnemy258 = new Enemy258(atlas);
        assetEnemy259 = new Enemy259(atlas);
        assetEnemy260 = new Enemy260(atlas);
        assetEnemy261 = new Enemy261(atlas);
        assetEnemy262 = new Enemy262(atlas);
        assetEnemy263 = new Enemy263(atlas);
        assetEnemy264 = new Enemy264(atlas);
        assetEnemy265 = new Enemy265(atlas);
        assetEnemy266 = new Enemy266(atlas);
        assetEnemy267 = new Enemy267(atlas);
        assetEnemy268 = new Enemy268(atlas);
        assetEnemy269 = new Enemy269(atlas);
        assetEnemy270 = new Enemy270(atlas);
        assetEnemy271 = new Enemy271(atlas);
        assetEnemy272 = new Enemy272(atlas);
        assetEnemy273 = new Enemy273(atlas);
        assetEnemy274 = new Enemy274(atlas);
        assetEnemy275 = new Enemy275(atlas);
        assetEnemy276 = new Enemy276(atlas);
        assetEnemy277 = new Enemy277(atlas);
        assetEnemy278 = new Enemy278(atlas);
        assetEnemy279 = new Enemy279(atlas);
        assetEnemy280 = new Enemy280(atlas);
        assetEnemy281 = new Enemy281(atlas);
        assetEnemy282 = new Enemy282(atlas);
        assetEnemy283 = new Enemy283(atlas);
        assetEnemy284 = new Enemy284(atlas);
        assetEnemy285 = new Enemy285(atlas);
        assetEnemy286 = new Enemy286(atlas);
        assetEnemy287 = new Enemy287(atlas);
        assetEnemy288 = new Enemy288(atlas);
        assetEnemy289 = new Enemy289(atlas);
        assetEnemy290 = new Enemy290(atlas);
        assetEnemy291 = new Enemy291(atlas);
        assetEnemy292 = new Enemy292(atlas);
        assetEnemy293 = new Enemy293(atlas);
        assetEnemy294 = new Enemy294(atlas);
        assetEnemy295 = new Enemy295(atlas);
        assetEnemy296 = new Enemy296(atlas);
        assetEnemy297 = new Enemy297(atlas);
        assetEnemy298 = new Enemy298(atlas);
        assetEnemy299 = new Enemy299(atlas);
        assetEnemy300 = new Enemy300(atlas);
        assetEnemy301 = new Enemy301(atlas);
        assetEnemy302 = new Enemy302(atlas);
        assetEnemy303 = new Enemy303(atlas);
        assetEnemy304 = new Enemy304(atlas);
        assetEnemy305 = new Enemy305(atlas);
        assetEnemy306 = new Enemy306(atlas);
        assetEnemy307 = new Enemy307(atlas);
        assetEnemy308 = new Enemy308(atlas);
        assetEnemy309 = new Enemy309(atlas);
        assetEnemy310 = new Enemy310(atlas);
        assetEnemy311 = new Enemy311(atlas);
        assetEnemy312 = new Enemy312(atlas);
        assetEnemy313 = new Enemy313(atlas);
        assetEnemy314 = new Enemy314(atlas);
        assetEnemy315 = new Enemy315(atlas);
        assetEnemy316 = new Enemy316(atlas);
        assetEnemy317 = new Enemy317(atlas);
        assetEnemy318 = new Enemy318(atlas);
        assetEnemy319 = new Enemy319(atlas);
        assetEnemy320 = new Enemy320(atlas);
        assetEnemy321 = new Enemy321(atlas);
        assetEnemy322 = new Enemy322(atlas);
        assetEnemy323 = new Enemy323(atlas);
        assetEnemy324 = new Enemy324(atlas);
        assetEnemy325 = new Enemy325(atlas);
        assetEnemy326 = new Enemy326(atlas);
        assetEnemy327 = new Enemy327(atlas);
        assetEnemy328 = new Enemy328(atlas);
        assetEnemy329 = new Enemy329(atlas);
        assetEnemy330 = new Enemy330(atlas);
        assetEnemy331 = new Enemy331(atlas);
        assetEnemy332 = new Enemy332(atlas);
        assetEnemy333 = new Enemy333(atlas);
        assetEnemy334 = new Enemy334(atlas);
        assetEnemy335 = new Enemy335(atlas);
        assetEnemy336 = new Enemy336(atlas);
        assetEnemy337 = new Enemy337(atlas);
        assetEnemy338 = new Enemy338(atlas);
        assetEnemy339 = new Enemy339(atlas);
        assetEnemy340 = new Enemy340(atlas);
        assetEnemy341 = new Enemy341(atlas);
        assetEnemy342 = new Enemy342(atlas);
        assetEnemy343 = new Enemy343(atlas);
        assetEnemy344 = new Enemy344(atlas);
        assetEnemy345 = new Enemy345(atlas);
        assetEnemy346 = new Enemy346(atlas);
        assetEnemy347 = new Enemy347(atlas);
        assetEnemy348 = new Enemy348(atlas);
        assetEnemy349 = new Enemy349(atlas);
        assetEnemy350 = new Enemy350(atlas);
        assetEnemy351 = new Enemy351(atlas);
        assetEnemy352 = new Enemy352(atlas);
        assetEnemy353 = new Enemy353(atlas);
        assetEnemy354 = new Enemy354(atlas);
        assetEnemy355 = new Enemy355(atlas);
        assetEnemy356 = new Enemy356(atlas);
        assetEnemy357 = new Enemy357(atlas);
        assetEnemy358 = new Enemy358(atlas);
        assetEnemy359 = new Enemy359(atlas);
        assetEnemy360 = new Enemy360(atlas);
        assetEnemy361 = new Enemy361(atlas);
        assetEnemy362 = new Enemy362(atlas);
        assetEnemy363 = new Enemy363(atlas);
        assetEnemy364 = new Enemy364(atlas);
        assetEnemy365 = new Enemy365(atlas);
        assetEnemy366 = new Enemy366(atlas);
        assetEnemy367 = new Enemy367(atlas);
        assetEnemy368 = new Enemy368(atlas);
        assetEnemy369 = new Enemy369(atlas);
        assetEnemy370 = new Enemy370(atlas);
        assetEnemy371 = new Enemy371(atlas);
        assetEnemy372 = new Enemy372(atlas);
        assetEnemy373 = new Enemy373(atlas);
        assetEnemy374 = new Enemy374(atlas);
        assetEnemy375 = new Enemy375(atlas);
        assetEnemy376 = new Enemy376(atlas);
        assetEnemy377 = new Enemy377(atlas);
        assetEnemy378 = new Enemy378(atlas);
        assetEnemy379 = new Enemy379(atlas);
        assetEnemy380 = new Enemy380(atlas);
        assetEnemy381 = new Enemy381(atlas);
        assetEnemy382 = new Enemy382(atlas);
        assetEnemy383 = new Enemy383(atlas);
        assetEnemy384 = new Enemy384(atlas);
        assetEnemy385 = new Enemy385(atlas);
        assetEnemy386 = new Enemy386(atlas);
        assetEnemy387 = new Enemy387(atlas);
        assetEnemy388 = new Enemy388(atlas);
        assetEnemy389 = new Enemy389(atlas);
        assetEnemy390 = new Enemy390(atlas);
        assetEnemy391 = new Enemy391(atlas);
        assetEnemy392 = new Enemy392(atlas);
        assetEnemy393 = new Enemy393(atlas);
        assetEnemy394 = new Enemy394(atlas);
        assetEnemy395 = new Enemy395(atlas);
        assetEnemy396 = new Enemy396(atlas);
        assetEnemy397 = new Enemy397(atlas);
        assetEnemy398 = new Enemy398(atlas);
        assetEnemy399 = new Enemy399(atlas);
        assetEnemy400 = new Enemy400(atlas);
        assetEnemy401 = new Enemy401(atlas);
        assetEnemy402 = new Enemy402(atlas);
        assetEnemy403 = new Enemy403(atlas);
        assetEnemy404 = new Enemy404(atlas);
        assetEnemy405 = new Enemy405(atlas);
        assetEnemy406 = new Enemy406(atlas);
        assetEnemy407 = new Enemy407(atlas);
        assetEnemy408 = new Enemy408(atlas);
        assetEnemy409 = new Enemy409(atlas);
        assetEnemy410 = new Enemy410(atlas);
        assetEnemy411 = new Enemy411(atlas);
        assetEnemy412 = new Enemy412(atlas);
        assetEnemy413 = new Enemy413(atlas);
        assetEnemy414 = new Enemy414(atlas);
        assetEnemy415 = new Enemy415(atlas);
        assetEnemy416 = new Enemy416(atlas);
        assetEnemy417 = new Enemy417(atlas);
        assetEnemy418 = new Enemy418(atlas);
        assetEnemy419 = new Enemy419(atlas);
        assetEnemy420 = new Enemy420(atlas);
        assetEnemy421 = new Enemy421(atlas);
        assetEnemy422 = new Enemy422(atlas);
        assetEnemy423 = new Enemy423(atlas);
        assetEnemy424 = new Enemy424(atlas);
        assetEnemy425 = new Enemy425(atlas);
        assetEnemy426 = new Enemy426(atlas);
        assetEnemy427 = new Enemy427(atlas);
        assetEnemy428 = new Enemy428(atlas);
        assetEnemy429 = new Enemy429(atlas);
        assetEnemy430 = new Enemy430(atlas);
        assetEnemy431 = new Enemy431(atlas);
        assetEnemy432 = new Enemy432(atlas);
        assetEnemy433 = new Enemy433(atlas);
        assetEnemy434 = new Enemy434(atlas);
        assetEnemy435 = new Enemy435(atlas);
        assetEnemy436 = new Enemy436(atlas);
        assetEnemy437 = new Enemy437(atlas);
        assetEnemy438 = new Enemy438(atlas);
        assetEnemy439 = new Enemy439(atlas);
        assetEnemy440 = new Enemy440(atlas);
        assetEnemy441 = new Enemy441(atlas);
        assetEnemy442 = new Enemy442(atlas);
        assetEnemy443 = new Enemy443(atlas);
        assetEnemy444 = new Enemy444(atlas);
        assetEnemy445 = new Enemy445(atlas);
        assetEnemy446 = new Enemy446(atlas);
        assetEnemy447 = new Enemy447(atlas);
        assetEnemy448 = new Enemy448(atlas);
        assetEnemy449 = new Enemy449(atlas);
        assetEnemy450 = new Enemy450(atlas);
        assetEnemy451 = new Enemy451(atlas);
        assetEnemy452 = new Enemy452(atlas);
        assetEnemy453 = new Enemy453(atlas);
        assetEnemy454 = new Enemy454(atlas);
        assetEnemy455 = new Enemy455(atlas);
        assetEnemy456 = new Enemy456(atlas);
        assetEnemy457 = new Enemy457(atlas);
        assetEnemy458 = new Enemy458(atlas);
        assetEnemy459 = new Enemy459(atlas);
        assetEnemy460 = new Enemy460(atlas);
        assetEnemy461 = new Enemy461(atlas);
        assetEnemy462 = new Enemy462(atlas);
        assetEnemy463 = new Enemy463(atlas);
        assetEnemy464 = new Enemy464(atlas);
        assetEnemy465 = new Enemy465(atlas);
        assetEnemy466 = new Enemy466(atlas);
        assetEnemy467 = new Enemy467(atlas);
        assetEnemy468 = new Enemy468(atlas);
        assetEnemy469 = new Enemy469(atlas);
        assetEnemy470 = new Enemy470(atlas);
        assetEnemy471 = new Enemy471(atlas);
        assetEnemy472 = new Enemy472(atlas);
        assetEnemy473 = new Enemy473(atlas);
        assetEnemy474 = new Enemy474(atlas);
        assetEnemy475 = new Enemy475(atlas);
        assetEnemy476 = new Enemy476(atlas);
        assetEnemy477 = new Enemy477(atlas);
        assetEnemy478 = new Enemy478(atlas);
        assetEnemy479 = new Enemy479(atlas);
        assetEnemy480 = new Enemy480(atlas);
        assetEnemy481 = new Enemy481(atlas);
        assetEnemy482 = new Enemy482(atlas);
        assetEnemy483 = new Enemy483(atlas);
        assetEnemy484 = new Enemy484(atlas);
        assetEnemy485 = new Enemy485(atlas);
        assetEnemy486 = new Enemy486(atlas);
        assetEnemy487 = new Enemy487(atlas);
        assetEnemy488 = new Enemy488(atlas);
        assetEnemy489 = new Enemy489(atlas);
        assetEnemy490 = new Enemy490(atlas);
        assetEnemy491 = new Enemy491(atlas);
        assetEnemy492 = new Enemy492(atlas);
        assetEnemy493 = new Enemy493(atlas);
        assetEnemy494 = new Enemy494(atlas);
        assetEnemy495 = new Enemy495(atlas);
        assetEnemy496 = new Enemy496(atlas);
        assetEnemy497 = new Enemy497(atlas);
        assetEnemy498 = new Enemy498(atlas);
        assetEnemy499 = new Enemy499(atlas);
        assetEnemy500 = new Enemy500(atlas);
        assetEnemy501 = new Enemy501(atlas);
        assetEnemy502 = new Enemy502(atlas);
        assetEnemy503 = new Enemy503(atlas);
        assetEnemy504 = new Enemy504(atlas);
        assetEnemy505 = new Enemy505(atlas);
        assetEnemy506 = new Enemy506(atlas);
        assetEnemy507 = new Enemy507(atlas);
        assetEnemy508 = new Enemy508(atlas);
        assetEnemy509 = new Enemy509(atlas);
        assetEnemy510 = new Enemy510(atlas);
        assetEnemy511 = new Enemy511(atlas);
        assetEnemy512 = new Enemy512(atlas);
        assetEnemy513 = new Enemy513(atlas);
        assetEnemy514 = new Enemy514(atlas);
        assetEnemy515 = new Enemy515(atlas);
        assetEnemy516 = new Enemy516(atlas);
        assetEnemy517 = new Enemy517(atlas);
        assetEnemy518 = new Enemy518(atlas);
        assetEnemy519 = new Enemy519(atlas);
        assetEnemy520 = new Enemy520(atlas);
        assetEnemy521 = new Enemy521(atlas);
        assetEnemy522 = new Enemy522(atlas);
        assetEnemy523 = new Enemy523(atlas);
        assetEnemy524 = new Enemy524(atlas);
        assetEnemy525 = new Enemy525(atlas);
        assetEnemy526 = new Enemy526(atlas);
        assetEnemy527 = new Enemy527(atlas);
        assetEnemy528 = new Enemy528(atlas);
        assetEnemy529 = new Enemy529(atlas);
        assetEnemy530 = new Enemy530(atlas);
        assetEnemy531 = new Enemy531(atlas);
        assetEnemy532 = new Enemy532(atlas);
        assetEnemy533 = new Enemy533(atlas);
        assetEnemy534 = new Enemy534(atlas);
        assetEnemy535 = new Enemy535(atlas);
        assetEnemy536 = new Enemy536(atlas);
        assetEnemy537 = new Enemy537(atlas);
        assetEnemy538 = new Enemy538(atlas);
        assetEnemy539 = new Enemy539(atlas);
        assetEnemy540 = new Enemy540(atlas);
        assetEnemy541 = new Enemy541(atlas);
        assetEnemy542 = new Enemy542(atlas);
        assetEnemy543 = new Enemy543(atlas);
        assetEnemy544 = new Enemy544(atlas);
        assetEnemy545 = new Enemy545(atlas);
        assetEnemy546 = new Enemy546(atlas);
        assetEnemy547 = new Enemy547(atlas);
        assetEnemy548 = new Enemy548(atlas);
        assetEnemy549 = new Enemy549(atlas);
        assetEnemy550 = new Enemy550(atlas);
        assetEnemy551 = new Enemy551(atlas);
        assetEnemy552 = new Enemy552(atlas);
        assetEnemy553 = new Enemy553(atlas);
        assetEnemy554 = new Enemy554(atlas);
        assetEnemy555 = new Enemy555(atlas);
        assetEnemy556 = new Enemy556(atlas);
        assetEnemy557 = new Enemy557(atlas);
        assetEnemy558 = new Enemy558(atlas);
        assetEnemy559 = new Enemy559(atlas);
        assetEnemy560 = new Enemy560(atlas);
        assetEnemy561 = new Enemy561(atlas);
        assetEnemy562 = new Enemy562(atlas);
        assetEnemy563 = new Enemy563(atlas);
        assetEnemy564 = new Enemy564(atlas);
        assetEnemy565 = new Enemy565(atlas);
        assetEnemy566 = new Enemy566(atlas);
        assetEnemy567 = new Enemy567(atlas);
        assetEnemy568 = new Enemy568(atlas);
        assetEnemy569 = new Enemy569(atlas);
        assetEnemy570 = new Enemy570(atlas);
        assetEnemy571 = new Enemy571(atlas);
        assetEnemy572 = new Enemy572(atlas);
        assetEnemy573 = new Enemy573(atlas);
        assetEnemy574 = new Enemy574(atlas);
        assetEnemy575 = new Enemy575(atlas);
        assetEnemy576 = new Enemy576(atlas);
        assetEnemy577 = new Enemy577(atlas);
        assetEnemy578 = new Enemy578(atlas);
        assetEnemy579 = new Enemy579(atlas);
        assetEnemy580 = new Enemy580(atlas);
        assetEnemy581 = new Enemy581(atlas);
        assetEnemy582 = new Enemy582(atlas);
        assetEnemy583 = new Enemy583(atlas);
        assetEnemy584 = new Enemy584(atlas);
        assetEnemy585 = new Enemy585(atlas);
        assetEnemy586 = new Enemy586(atlas);
        assetEnemy587 = new Enemy587(atlas);
        assetEnemy588 = new Enemy588(atlas);
        assetEnemy589 = new Enemy589(atlas);
        assetEnemy590 = new Enemy590(atlas);
        assetEnemy591 = new Enemy591(atlas);
        assetEnemy592 = new Enemy592(atlas);
        assetEnemy593 = new Enemy593(atlas);
        assetEnemy594 = new Enemy594(atlas);
        assetEnemy595 = new Enemy595(atlas);
        assetEnemy596 = new Enemy596(atlas);
        assetEnemy597 = new Enemy597(atlas);
        assetEnemy598 = new Enemy598(atlas);
        assetEnemy599 = new Enemy599(atlas);
        assetEnemy600 = new Enemy600(atlas);
        assetEnemy601 = new Enemy601(atlas);
        assetEnemy602 = new Enemy602(atlas);
        assetEnemy603 = new Enemy603(atlas);
        assetEnemy604 = new Enemy604(atlas);
        assetEnemy605 = new Enemy605(atlas);
        assetEnemy606 = new Enemy606(atlas);
        assetEnemy607 = new Enemy607(atlas);
        assetEnemy608 = new Enemy608(atlas);
        assetEnemy609 = new Enemy609(atlas);
        assetEnemy610 = new Enemy610(atlas);
        assetEnemy611 = new Enemy611(atlas);
        assetEnemy612 = new Enemy612(atlas);
        assetEnemy613 = new Enemy613(atlas);
        assetEnemy614 = new Enemy614(atlas);
        assetEnemy615 = new Enemy615(atlas);
        assetEnemy616 = new Enemy616(atlas);
        assetEnemy617 = new Enemy617(atlas);
        assetEnemy618 = new Enemy618(atlas);
        assetEnemy619 = new Enemy619(atlas);
        assetEnemy620 = new Enemy620(atlas);
        assetEnemy621 = new Enemy621(atlas);
        assetEnemy622 = new Enemy622(atlas);
        assetEnemy623 = new Enemy623(atlas);
        assetEnemy624 = new Enemy624(atlas);
        assetEnemy625 = new Enemy625(atlas);
        assetEnemy626 = new Enemy626(atlas);
        assetEnemy627 = new Enemy627(atlas);
        assetEnemy628 = new Enemy628(atlas);
        assetEnemy629 = new Enemy629(atlas);
        assetEnemy630 = new Enemy630(atlas);
        assetEnemy631 = new Enemy631(atlas);
        assetEnemy632 = new Enemy632(atlas);
        assetEnemy633 = new Enemy633(atlas);
        assetEnemy634 = new Enemy634(atlas);
        assetEnemy635 = new Enemy635(atlas);
        assetEnemy636 = new Enemy636(atlas);
        assetEnemy637 = new Enemy637(atlas);
        assetEnemy638 = new Enemy638(atlas);
        assetEnemy639 = new Enemy639(atlas);
        assetEnemy640 = new Enemy640(atlas);
        assetEnemy641 = new Enemy641(atlas);
        assetEnemy642 = new Enemy642(atlas);
        assetEnemy643 = new Enemy643(atlas);
        assetEnemy644 = new Enemy644(atlas);
        assetEnemy645 = new Enemy645(atlas);
        assetEnemy646 = new Enemy646(atlas);
        assetEnemy647 = new Enemy647(atlas);
        assetEnemy648 = new Enemy648(atlas);
        assetEnemy649 = new Enemy649(atlas);
        assetEnemy650 = new Enemy650(atlas);
        assetEnemy651 = new Enemy651(atlas);
        assetEnemy652 = new Enemy652(atlas);
        assetEnemy653 = new Enemy653(atlas);
        assetEnemy654 = new Enemy654(atlas);
        assetEnemy655 = new Enemy655(atlas);
        assetEnemy656 = new Enemy656(atlas);
        assetEnemy657 = new Enemy657(atlas);
        assetEnemy658 = new Enemy658(atlas);
        assetEnemy659 = new Enemy659(atlas);
        assetEnemy660 = new Enemy660(atlas);
        assetEnemy661 = new Enemy661(atlas);
        assetEnemy662 = new Enemy662(atlas);
        assetEnemy663 = new Enemy663(atlas);
        assetEnemy664 = new Enemy664(atlas);
        assetEnemy665 = new Enemy665(atlas);
        assetEnemy666 = new Enemy666(atlas);
        assetEnemy667 = new Enemy667(atlas);
        assetEnemy668 = new Enemy668(atlas);
        assetEnemy669 = new Enemy669(atlas);
        assetEnemy670 = new Enemy670(atlas);
        assetEnemy671 = new Enemy671(atlas);
        assetEnemy672 = new Enemy672(atlas);
        assetEnemy673 = new Enemy673(atlas);
        assetEnemy674 = new Enemy674(atlas);
        assetEnemy675 = new Enemy675(atlas);
        assetEnemy676 = new Enemy676(atlas);
        assetEnemy677 = new Enemy677(atlas);
        assetEnemy678 = new Enemy678(atlas);
        assetEnemy679 = new Enemy679(atlas);
        assetEnemy680 = new Enemy680(atlas);
        assetEnemy681 = new Enemy681(atlas);
        assetEnemy682 = new Enemy682(atlas);
        assetEnemy683 = new Enemy683(atlas);
        assetEnemy684 = new Enemy684(atlas);
        assetEnemy685 = new Enemy685(atlas);
        assetEnemy686 = new Enemy686(atlas);
        assetEnemy687 = new Enemy687(atlas);
        assetEnemy688 = new Enemy688(atlas);
        assetEnemy689 = new Enemy689(atlas);
        assetEnemy690 = new Enemy690(atlas);
        assetEnemy691 = new Enemy691(atlas);
        assetEnemy692 = new Enemy692(atlas);
        assetEnemy693 = new Enemy693(atlas);
        assetEnemy694 = new Enemy694(atlas);
        assetEnemy695 = new Enemy695(atlas);
        assetEnemy696 = new Enemy696(atlas);
        assetEnemy697 = new Enemy697(atlas);
        assetEnemy698 = new Enemy698(atlas);
        assetEnemy699 = new Enemy699(atlas);
        assetEnemy700 = new Enemy700(atlas);
        assetEnemy701 = new Enemy701(atlas);
        assetEnemy702 = new Enemy702(atlas);
        assetEnemy703 = new Enemy703(atlas);
        assetEnemy704 = new Enemy704(atlas);
        assetEnemy705 = new Enemy705(atlas);
        assetEnemy706 = new Enemy706(atlas);
        assetEnemy707 = new Enemy707(atlas);
        assetEnemy708 = new Enemy708(atlas);
        assetEnemy709 = new Enemy709(atlas);
        assetEnemy710 = new Enemy710(atlas);
        assetEnemy711 = new Enemy711(atlas);
        assetEnemy712 = new Enemy712(atlas);
        assetEnemy713 = new Enemy713(atlas);
        assetEnemy714 = new Enemy714(atlas);
        assetEnemy715 = new Enemy715(atlas);
        assetEnemy716 = new Enemy716(atlas);
        assetEnemy717 = new Enemy717(atlas);
        assetEnemy718 = new Enemy718(atlas);
        assetEnemy719 = new Enemy719(atlas);
        assetEnemy720 = new Enemy720(atlas);
        assetEnemy721 = new Enemy721(atlas);
        assetEnemy722 = new Enemy722(atlas);
        assetEnemy723 = new Enemy723(atlas);
        assetEnemy724 = new Enemy724(atlas);
        assetEnemy725 = new Enemy725(atlas);
        assetEnemy726 = new Enemy726(atlas);
        assetEnemy727 = new Enemy727(atlas);
        assetEnemy728 = new Enemy728(atlas);
        assetEnemy729 = new Enemy729(atlas);
        assetEnemy730 = new Enemy730(atlas);
        assetEnemy731 = new Enemy731(atlas);
        assetEnemy732 = new Enemy732(atlas);
        assetEnemy733 = new Enemy733(atlas);
        assetEnemy734 = new Enemy734(atlas);
        assetEnemy735 = new Enemy735(atlas);
        assetEnemy736 = new Enemy736(atlas);
        assetEnemy737 = new Enemy737(atlas);
        assetEnemy738 = new Enemy738(atlas);
        assetEnemy739 = new Enemy739(atlas);
        assetEnemy740 = new Enemy740(atlas);
        assetEnemy741 = new Enemy741(atlas);
        assetEnemy742 = new Enemy742(atlas);
        assetEnemy743 = new Enemy743(atlas);
        assetEnemy744 = new Enemy744(atlas);
        assetEnemy745 = new Enemy745(atlas);
        assetEnemy746 = new Enemy746(atlas);
        assetEnemy747 = new Enemy747(atlas);
        assetEnemy748 = new Enemy748(atlas);
        assetEnemy749 = new Enemy749(atlas);
        assetEnemy750 = new Enemy750(atlas);
        assetEnemy751 = new Enemy751(atlas);
        assetEnemy752 = new Enemy752(atlas);
        assetEnemy753 = new Enemy753(atlas);
        assetEnemy754 = new Enemy754(atlas);
        assetEnemy755 = new Enemy755(atlas);
        assetEnemy756 = new Enemy756(atlas);
        assetEnemy757 = new Enemy757(atlas);
        assetEnemy758 = new Enemy758(atlas);
        assetEnemy759 = new Enemy759(atlas);
        assetEnemy760 = new Enemy760(atlas);
        assetEnemy761 = new Enemy761(atlas);
        assetEnemy762 = new Enemy762(atlas);
        assetEnemy763 = new Enemy763(atlas);
        assetEnemy764 = new Enemy764(atlas);
        assetEnemy765 = new Enemy765(atlas);
        assetEnemy766 = new Enemy766(atlas);
        assetEnemy767 = new Enemy767(atlas);
        assetEnemy768 = new Enemy768(atlas);
        assetEnemy769 = new Enemy769(atlas);
        assetEnemy770 = new Enemy770(atlas);
        assetEnemy771 = new Enemy771(atlas);
        assetEnemy772 = new Enemy772(atlas);
        assetEnemy773 = new Enemy773(atlas);
        assetEnemy774 = new Enemy774(atlas);
        assetEnemy775 = new Enemy775(atlas);
        assetEnemy776 = new Enemy776(atlas);
        assetEnemy777 = new Enemy777(atlas);
        assetEnemy778 = new Enemy778(atlas);
        assetEnemy779 = new Enemy779(atlas);
        assetEnemy780 = new Enemy780(atlas);
        assetEnemy781 = new Enemy781(atlas);
        assetEnemy782 = new Enemy782(atlas);
        assetEnemy783 = new Enemy783(atlas);
        assetEnemy784 = new Enemy784(atlas);
        assetEnemy785 = new Enemy785(atlas);
        assetEnemy786 = new Enemy786(atlas);
        assetEnemy787 = new Enemy787(atlas);
        assetEnemy788 = new Enemy788(atlas);
        assetEnemy789 = new Enemy789(atlas);
        assetEnemy790 = new Enemy790(atlas);
        assetEnemy791 = new Enemy791(atlas);
        assetEnemy792 = new Enemy792(atlas);
        assetEnemy793 = new Enemy793(atlas);
        assetEnemy794 = new Enemy794(atlas);
        assetEnemy795 = new Enemy795(atlas);
        assetEnemy796 = new Enemy796(atlas);
        assetEnemy797 = new Enemy797(atlas);
        assetEnemy798 = new Enemy798(atlas);
        assetEnemy799 = new Enemy799(atlas);
        assetEnemy800 = new Enemy800(atlas);
        assetEnemy801 = new Enemy801(atlas);
        assetEnemy802 = new Enemy802(atlas);
        assetEnemy803 = new Enemy803(atlas);
        assetEnemy804 = new Enemy804(atlas);
        assetEnemy805 = new Enemy805(atlas);
        assetEnemy806 = new Enemy806(atlas);
        assetEnemy807 = new Enemy807(atlas);
        assetEnemy808 = new Enemy808(atlas);
        assetEnemy809 = new Enemy809(atlas);
        assetEnemy810 = new Enemy810(atlas);
        assetEnemy811 = new Enemy811(atlas);
        assetEnemy812 = new Enemy812(atlas);
        assetEnemy813 = new Enemy813(atlas);
        assetEnemy814 = new Enemy814(atlas);
        assetEnemy815 = new Enemy815(atlas);
        assetEnemy816 = new Enemy816(atlas);
        assetEnemy817 = new Enemy817(atlas);
        assetEnemy818 = new Enemy818(atlas);
        assetEnemy819 = new Enemy819(atlas);
        assetEnemy820 = new Enemy820(atlas);
        assetEnemy821 = new Enemy821(atlas);
        assetEnemy822 = new Enemy822(atlas);
        assetEnemy823 = new Enemy823(atlas);
        assetEnemy824 = new Enemy824(atlas);
        assetEnemy825 = new Enemy825(atlas);
        assetEnemy826 = new Enemy826(atlas);
        assetEnemy827 = new Enemy827(atlas);
        assetEnemy828 = new Enemy828(atlas);
        assetEnemy829 = new Enemy829(atlas);
        assetEnemy830 = new Enemy830(atlas);
        assetEnemy831 = new Enemy831(atlas);
        assetEnemy832 = new Enemy832(atlas);
        assetEnemy833 = new Enemy833(atlas);
        assetEnemy834 = new Enemy834(atlas);
        assetEnemy835 = new Enemy835(atlas);
        assetEnemy836 = new Enemy836(atlas);
        assetEnemy837 = new Enemy837(atlas);
        assetEnemy838 = new Enemy838(atlas);
        assetEnemy839 = new Enemy839(atlas);
        assetEnemy840 = new Enemy840(atlas);
        assetEnemy841 = new Enemy841(atlas);
        assetEnemy842 = new Enemy842(atlas);
        assetEnemy843 = new Enemy843(atlas);
        assetEnemy844 = new Enemy844(atlas);
        assetEnemy845 = new Enemy845(atlas);
        assetEnemy846 = new Enemy846(atlas);
        assetEnemy847 = new Enemy847(atlas);
        assetEnemy848 = new Enemy848(atlas);
        assetEnemy849 = new Enemy849(atlas);
        assetEnemy850 = new Enemy850(atlas);
        assetEnemy851 = new Enemy851(atlas);
        assetEnemy852 = new Enemy852(atlas);
        assetEnemy853 = new Enemy853(atlas);
        assetEnemy854 = new Enemy854(atlas);
        assetEnemy855 = new Enemy855(atlas);
        assetEnemy856 = new Enemy856(atlas);
        assetEnemy857 = new Enemy857(atlas);
        assetEnemy858 = new Enemy858(atlas);
        assetEnemy859 = new Enemy859(atlas);
        assetEnemy860 = new Enemy860(atlas);
        assetEnemy861 = new Enemy861(atlas);
        assetEnemy862 = new Enemy862(atlas);
        assetEnemy863 = new Enemy863(atlas);
        assetEnemy864 = new Enemy864(atlas);
        assetEnemy865 = new Enemy865(atlas);
        assetEnemy866 = new Enemy866(atlas);
        assetEnemy867 = new Enemy867(atlas);
        assetEnemy868 = new Enemy868(atlas);
        assetEnemy869 = new Enemy869(atlas);
        assetEnemy870 = new Enemy870(atlas);
        assetEnemy871 = new Enemy871(atlas);
        assetEnemy872 = new Enemy872(atlas);
        assetEnemy873 = new Enemy873(atlas);
        assetEnemy874 = new Enemy874(atlas);
        assetEnemy875 = new Enemy875(atlas);
        assetEnemy876 = new Enemy876(atlas);
        assetEnemy877 = new Enemy877(atlas);
        assetEnemy878 = new Enemy878(atlas);
        assetEnemy879 = new Enemy879(atlas);
        assetEnemy880 = new Enemy880(atlas);
        assetEnemy881 = new Enemy881(atlas);
        assetEnemy882 = new Enemy882(atlas);
        assetEnemy883 = new Enemy883(atlas);
        assetEnemy884 = new Enemy884(atlas);
        assetEnemy885 = new Enemy885(atlas);
        assetEnemy886 = new Enemy886(atlas);
        assetEnemy887 = new Enemy887(atlas);
        assetEnemy888 = new Enemy888(atlas);
        assetEnemy889 = new Enemy889(atlas);
        assetEnemy890 = new Enemy890(atlas);
        assetEnemy891 = new Enemy891(atlas);
        assetEnemy892 = new Enemy892(atlas);
        assetEnemy893 = new Enemy893(atlas);
        assetEnemy894 = new Enemy894(atlas);
        assetEnemy895 = new Enemy895(atlas);
        assetEnemy896 = new Enemy896(atlas);
        assetEnemy897 = new Enemy897(atlas);
        assetEnemy898 = new Enemy898(atlas);
        assetEnemy899 = new Enemy899(atlas);
        assetEnemy900 = new Enemy900(atlas);
        assetEnemy901 = new Enemy901(atlas);
        assetEnemy902 = new Enemy902(atlas);
        assetEnemy903 = new Enemy903(atlas);
        assetEnemy904 = new Enemy904(atlas);
        assetEnemy905 = new Enemy905(atlas);
        assetEnemy906 = new Enemy906(atlas);
        assetEnemy907 = new Enemy907(atlas);
        assetEnemy908 = new Enemy908(atlas);
        assetEnemy909 = new Enemy909(atlas);
        assetEnemy910 = new Enemy910(atlas);
        assetEnemy911 = new Enemy911(atlas);
        assetEnemy912 = new Enemy912(atlas);
        assetEnemy913 = new Enemy913(atlas);
        assetEnemy914 = new Enemy914(atlas);
        assetEnemy915 = new Enemy915(atlas);
        assetEnemy916 = new Enemy916(atlas);
        assetEnemy917 = new Enemy917(atlas);
        assetEnemy918 = new Enemy918(atlas);
        assetEnemy919 = new Enemy919(atlas);
        assetEnemy920 = new Enemy920(atlas);
        assetEnemy921 = new Enemy921(atlas);
        assetEnemy922 = new Enemy922(atlas);
        assetEnemy923 = new Enemy923(atlas);
        assetEnemy924 = new Enemy924(atlas);
        assetEnemy925 = new Enemy925(atlas);
        assetEnemy926 = new Enemy926(atlas);
        assetEnemy927 = new Enemy927(atlas);
        assetEnemy928 = new Enemy928(atlas);
        assetEnemy929 = new Enemy929(atlas);
        assetEnemy930 = new Enemy930(atlas);
        assetEnemy931 = new Enemy931(atlas);
        assetEnemy932 = new Enemy932(atlas);
        assetEnemy933 = new Enemy933(atlas);
        assetEnemy934 = new Enemy934(atlas);
        assetEnemy935 = new Enemy935(atlas);
        assetEnemy936 = new Enemy936(atlas);
        assetEnemy937 = new Enemy937(atlas);
        assetEnemy938 = new Enemy938(atlas);
        assetEnemy939 = new Enemy939(atlas);
        assetEnemy940 = new Enemy940(atlas);
        assetEnemy941 = new Enemy941(atlas);
        assetEnemy942 = new Enemy942(atlas);
        assetEnemy943 = new Enemy943(atlas);
        assetEnemy944 = new Enemy944(atlas);
        assetEnemy945 = new Enemy945(atlas);
        assetEnemy946 = new Enemy946(atlas);
        assetEnemy947 = new Enemy947(atlas);
        assetEnemy948 = new Enemy948(atlas);
        assetEnemy949 = new Enemy949(atlas);
        assetEnemy950 = new Enemy950(atlas);
        assetEnemy951 = new Enemy951(atlas);
        assetEnemy952 = new Enemy952(atlas);
        assetEnemy953 = new Enemy953(atlas);
        assetEnemy954 = new Enemy954(atlas);
        assetEnemy955 = new Enemy955(atlas);
        assetEnemy956 = new Enemy956(atlas);
        assetEnemy957 = new Enemy957(atlas);
        assetEnemy958 = new Enemy958(atlas);
        assetEnemy959 = new Enemy959(atlas);
        assetEnemy960 = new Enemy960(atlas);
        assetEnemy961 = new Enemy961(atlas);
        assetEnemy962 = new Enemy962(atlas);
        assetEnemy963 = new Enemy963(atlas);
        assetEnemy964 = new Enemy964(atlas);
        assetEnemy965 = new Enemy965(atlas);
        assetEnemy966 = new Enemy966(atlas);
        assetEnemy967 = new Enemy967(atlas);
        assetEnemy968 = new Enemy968(atlas);
        assetEnemy969 = new Enemy969(atlas);
        assetEnemy970 = new Enemy970(atlas);
        assetEnemy971 = new Enemy971(atlas);
        assetEnemy972 = new Enemy972(atlas);
        assetEnemy973 = new Enemy973(atlas);
        assetEnemy974 = new Enemy974(atlas);
        assetEnemy975 = new Enemy975(atlas);
        assetEnemy976 = new Enemy976(atlas);
        assetEnemy977 = new Enemy977(atlas);
        assetEnemy978 = new Enemy978(atlas);
        assetEnemy979 = new Enemy979(atlas);
        assetEnemy980 = new Enemy980(atlas);
        assetEnemy981 = new Enemy981(atlas);
        assetEnemy982 = new Enemy982(atlas);
        assetEnemy983 = new Enemy983(atlas);
        assetEnemy984 = new Enemy984(atlas);
        assetEnemy985 = new Enemy985(atlas);
        assetEnemy986 = new Enemy986(atlas);
        assetEnemy987 = new Enemy987(atlas);
        assetEnemy988 = new Enemy988(atlas);
        assetEnemy989 = new Enemy989(atlas);
        assetEnemy990 = new Enemy990(atlas);
        assetEnemy991 = new Enemy991(atlas);
        assetEnemy992 = new Enemy992(atlas);
        assetEnemy993 = new Enemy993(atlas);
        assetEnemy994 = new Enemy994(atlas);
        assetEnemy995 = new Enemy995(atlas);
        assetEnemy996 = new Enemy996(atlas);
        assetEnemy997 = new Enemy997(atlas);
        assetEnemy998 = new Enemy998(atlas);
        assetEnemy999 = new Enemy999(atlas);
        assetEnemy1000 = new Enemy1000(atlas);
        assetEnemy1001 = new Enemy1001(atlas);
        assetEnemy1002 = new Enemy1002(atlas);
        assetEnemy1003 = new Enemy1003(atlas);
        assetEnemy1004 = new Enemy1004(atlas);
        assetEnemy1005 = new Enemy1005(atlas);
        assetEnemy1006 = new Enemy1006(atlas);
        assetEnemy1007 = new Enemy1007(atlas);
        assetEnemy1008 = new Enemy1008(atlas);
        assetEnemy1009 = new Enemy1009(atlas);
        assetEnemy1010 = new Enemy1010(atlas);
        assetEnemy1011 = new Enemy1011(atlas);
        assetEnemy1012 = new Enemy1012(atlas);
        assetEnemy1013 = new Enemy1013(atlas);
        assetEnemy1014 = new Enemy1014(atlas);
        assetEnemy1015 = new Enemy1015(atlas);
        assetEnemy1016 = new Enemy1016(atlas);
        assetEnemy1017 = new Enemy1017(atlas);
        assetEnemy1018 = new Enemy1018(atlas);
        assetEnemy1019 = new Enemy1019(atlas);
        assetEnemy1020 = new Enemy1020(atlas);
        assetEnemy1021 = new Enemy1021(atlas);
        assetEnemy1022 = new Enemy1022(atlas);
        assetEnemy1023 = new Enemy1023(atlas);
        assetEnemy1024 = new Enemy1024(atlas);
        assetEnemy1025 = new Enemy1025(atlas);
        assetEnemy1026 = new Enemy1026(atlas);
        assetEnemy1027 = new Enemy1027(atlas);
        assetEnemy1028 = new Enemy1028(atlas);
        assetEnemy1029 = new Enemy1029(atlas);
        assetEnemy1030 = new Enemy1030(atlas);
        assetEnemy1031 = new Enemy1031(atlas);
        assetEnemy1032 = new Enemy1032(atlas);
        assetEnemy1033 = new Enemy1033(atlas);
        assetEnemy1034 = new Enemy1034(atlas);
        assetEnemy1035 = new Enemy1035(atlas);
        assetEnemy1036 = new Enemy1036(atlas);
        assetEnemy1037 = new Enemy1037(atlas);
        assetEnemy1038 = new Enemy1038(atlas);
        assetEnemy1039 = new Enemy1039(atlas);
        assetEnemy1040 = new Enemy1040(atlas);
        assetEnemy1041 = new Enemy1041(atlas);
        assetEnemy1042 = new Enemy1042(atlas);
        assetEnemy1043 = new Enemy1043(atlas);
        assetEnemy1044 = new Enemy1044(atlas);
        assetEnemy1045 = new Enemy1045(atlas);
        assetEnemy1046 = new Enemy1046(atlas);
        assetEnemy1047 = new Enemy1047(atlas);
        assetEnemy1048 = new Enemy1048(atlas);
        assetEnemy1049 = new Enemy1049(atlas);
        assetEnemy1050 = new Enemy1050(atlas);
        assetEnemy1051 = new Enemy1051(atlas);
        assetEnemy1052 = new Enemy1052(atlas);
        assetEnemy1053 = new Enemy1053(atlas);
        assetEnemy1054 = new Enemy1054(atlas);
        assetEnemy1055 = new Enemy1055(atlas);
        assetEnemy1056 = new Enemy1056(atlas);
        assetEnemy1057 = new Enemy1057(atlas);
        assetEnemy1058 = new Enemy1058(atlas);
        assetEnemy1059 = new Enemy1059(atlas);
        assetEnemy1060 = new Enemy1060(atlas);
        assetEnemy1061 = new Enemy1061(atlas);
        assetEnemy1062 = new Enemy1062(atlas);
        assetEnemy1063 = new Enemy1063(atlas);
        assetEnemy1064 = new Enemy1064(atlas);
        assetEnemy1065 = new Enemy1065(atlas);
        assetEnemy1066 = new Enemy1066(atlas);
        assetEnemy1067 = new Enemy1067(atlas);
        assetEnemy1068 = new Enemy1068(atlas);
        assetEnemy1069 = new Enemy1069(atlas);
        assetEnemy1070 = new Enemy1070(atlas);
        assetEnemy1071 = new Enemy1071(atlas);
        assetEnemy1072 = new Enemy1072(atlas);
        assetEnemy1073 = new Enemy1073(atlas);
        assetEnemy1074 = new Enemy1074(atlas);
        assetEnemy1075 = new Enemy1075(atlas);
        assetEnemy1076 = new Enemy1076(atlas);
        assetEnemy1077 = new Enemy1077(atlas);
        assetEnemy1078 = new Enemy1078(atlas);
        assetEnemy1079 = new Enemy1079(atlas);
        assetEnemy1080 = new Enemy1080(atlas);
        assetEnemy1081 = new Enemy1081(atlas);
        assetEnemy1082 = new Enemy1082(atlas);
        assetEnemy1083 = new Enemy1083(atlas);
        assetEnemy1084 = new Enemy1084(atlas);
        assetEnemy1085 = new Enemy1085(atlas);
        assetEnemy1086 = new Enemy1086(atlas);
        assetEnemy1087 = new Enemy1087(atlas);
        assetEnemy1088 = new Enemy1088(atlas);
        assetEnemy1089 = new Enemy1089(atlas);
        assetEnemy1090 = new Enemy1090(atlas);
        assetEnemy1091 = new Enemy1091(atlas);
        assetEnemy1092 = new Enemy1092(atlas);
        assetEnemy1093 = new Enemy1093(atlas);
        assetEnemy1094 = new Enemy1094(atlas);
        assetEnemy1095 = new Enemy1095(atlas);
        assetEnemy1096 = new Enemy1096(atlas);
        assetEnemy1097 = new Enemy1097(atlas);
        assetEnemy1098 = new Enemy1098(atlas);
        assetEnemy1099 = new Enemy1099(atlas);
        assetEnemy1100 = new Enemy1100(atlas);
        assetEnemy1101 = new Enemy1101(atlas);
        assetEnemy1102 = new Enemy1102(atlas);
        assetEnemy1103 = new Enemy1103(atlas);
        assetEnemy1104 = new Enemy1104(atlas);
        assetEnemy1105 = new Enemy1105(atlas);
        assetEnemy1106 = new Enemy1106(atlas);
        assetEnemy1107 = new Enemy1107(atlas);
        assetEnemy1108 = new Enemy1108(atlas);
        assetEnemy1109 = new Enemy1109(atlas);
        assetEnemy1110 = new Enemy1110(atlas);
        assetEnemy1111 = new Enemy1111(atlas);
        assetEnemy1112 = new Enemy1112(atlas);
        assetEnemy1113 = new Enemy1113(atlas);
        assetEnemy1114 = new Enemy1114(atlas);
        assetEnemy1115 = new Enemy1115(atlas);
        assetEnemy1116 = new Enemy1116(atlas);
        assetEnemy1117 = new Enemy1117(atlas);
        assetEnemy1118 = new Enemy1118(atlas);
        assetEnemy1119 = new Enemy1119(atlas);
        assetEnemy1120 = new Enemy1120(atlas);
        assetEnemy1121 = new Enemy1121(atlas);
        assetEnemy1122 = new Enemy1122(atlas);
        assetEnemy1123 = new Enemy1123(atlas);
        assetEnemy1124 = new Enemy1124(atlas);
        assetEnemy1125 = new Enemy1125(atlas);
        assetEnemy1126 = new Enemy1126(atlas);
        assetEnemy1127 = new Enemy1127(atlas);
        assetEnemy1128 = new Enemy1128(atlas);
        assetEnemy1129 = new Enemy1129(atlas);
        assetEnemy1130 = new Enemy1130(atlas);
        assetEnemy1131 = new Enemy1131(atlas);
        assetEnemy1132 = new Enemy1132(atlas);
        assetEnemy1133 = new Enemy1133(atlas);
        assetEnemy1134 = new Enemy1134(atlas);
        assetEnemy1135 = new Enemy1135(atlas);
        assetEnemy1136 = new Enemy1136(atlas);
        assetEnemy1137 = new Enemy1137(atlas);
        assetEnemy1138 = new Enemy1138(atlas);
        assetEnemy1139 = new Enemy1139(atlas);
        assetEnemy1140 = new Enemy1140(atlas);
        assetEnemy1141 = new Enemy1141(atlas);
        assetEnemy1142 = new Enemy1142(atlas);
        assetEnemy1143 = new Enemy1143(atlas);
        assetEnemy1144 = new Enemy1144(atlas);
        assetEnemy1145 = new Enemy1145(atlas);
        assetEnemy1146 = new Enemy1146(atlas);
        assetEnemy1147 = new Enemy1147(atlas);
        assetEnemy1148 = new Enemy1148(atlas);
        assetEnemy1149 = new Enemy1149(atlas);
        assetEnemy1150 = new Enemy1150(atlas);
        assetEnemy1151 = new Enemy1151(atlas);
        assetEnemy1152 = new Enemy1152(atlas);
        assetEnemy1153 = new Enemy1153(atlas);
        assetEnemy1154 = new Enemy1154(atlas);
        assetEnemy1155 = new Enemy1155(atlas);
        assetEnemy1156 = new Enemy1156(atlas);
        assetEnemy1157 = new Enemy1157(atlas);
        assetEnemy1158 = new Enemy1158(atlas);
        assetEnemy1159 = new Enemy1159(atlas);
        assetEnemy1160 = new Enemy1160(atlas);
        assetEnemy1161 = new Enemy1161(atlas);
        assetEnemy1162 = new Enemy1162(atlas);
        assetEnemy1163 = new Enemy1163(atlas);
        assetEnemy1164 = new Enemy1164(atlas);
        assetEnemy1165 = new Enemy1165(atlas);
        assetEnemy1166 = new Enemy1166(atlas);
        assetEnemy1167 = new Enemy1167(atlas);
        assetEnemy1168 = new Enemy1168(atlas);
        assetEnemy1169 = new Enemy1169(atlas);
        assetEnemy1170 = new Enemy1170(atlas);
        assetEnemy1171 = new Enemy1171(atlas);
        assetEnemy1172 = new Enemy1172(atlas);
        assetEnemy1173 = new Enemy1173(atlas);
        assetEnemy1174 = new Enemy1174(atlas);
        assetEnemy1175 = new Enemy1175(atlas);
        assetEnemy1176 = new Enemy1176(atlas);
        assetEnemy1177 = new Enemy1177(atlas);
        assetEnemy1178 = new Enemy1178(atlas);
        assetEnemy1179 = new Enemy1179(atlas);
        assetEnemy1180 = new Enemy1180(atlas);
        assetEnemy1181 = new Enemy1181(atlas);
        assetEnemy1182 = new Enemy1182(atlas);
        assetEnemy1183 = new Enemy1183(atlas);
        assetEnemy1184 = new Enemy1184(atlas);
        assetEnemy1185 = new Enemy1185(atlas);
        assetEnemy1186 = new Enemy1186(atlas);
        assetEnemy1187 = new Enemy1187(atlas);
        assetEnemy1188 = new Enemy1188(atlas);
        assetEnemy1189 = new Enemy1189(atlas);
        assetEnemy1190 = new Enemy1190(atlas);
        assetEnemy1191 = new Enemy1191(atlas);
        assetEnemy1192 = new Enemy1192(atlas);
        assetEnemy1193 = new Enemy1193(atlas);
        assetEnemy1194 = new Enemy1194(atlas);
        assetEnemy1195 = new Enemy1195(atlas);
        assetEnemy1196 = new Enemy1196(atlas);
        assetEnemy1197 = new Enemy1197(atlas);
        assetEnemy1198 = new Enemy1198(atlas);
        assetEnemy1199 = new Enemy1199(atlas);
        assetEnemy1200 = new Enemy1200(atlas);
        assetEnemy1201 = new Enemy1201(atlas);
        assetEnemy1202 = new Enemy1202(atlas);
        assetEnemy1203 = new Enemy1203(atlas);
        assetEnemy1204 = new Enemy1204(atlas);
        assetEnemy1205 = new Enemy1205(atlas);
        assetEnemy1206 = new Enemy1206(atlas);
        assetEnemy1207 = new Enemy1207(atlas);
        assetEnemy1208 = new Enemy1208(atlas);
        assetEnemy1209 = new Enemy1209(atlas);
        assetEnemy1210 = new Enemy1210(atlas);
        assetEnemy1211 = new Enemy1211(atlas);
        assetEnemy1212 = new Enemy1212(atlas);
        assetEnemy1213 = new Enemy1213(atlas);
        assetEnemy1214 = new Enemy1214(atlas);
        assetEnemy1215 = new Enemy1215(atlas);
        assetEnemy1216 = new Enemy1216(atlas);
        assetEnemy1217 = new Enemy1217(atlas);
        assetEnemy1218 = new Enemy1218(atlas);
        assetEnemy1219 = new Enemy1219(atlas);
        assetEnemy1220 = new Enemy1220(atlas);
        assetEnemy1221 = new Enemy1221(atlas);
        assetEnemy1222 = new Enemy1222(atlas);
        assetEnemy1223 = new Enemy1223(atlas);
        assetEnemy1224 = new Enemy1224(atlas);
        assetEnemy1225 = new Enemy1225(atlas);
        assetEnemy1226 = new Enemy1226(atlas);
        assetEnemy1227 = new Enemy1227(atlas);
        assetEnemy1228 = new Enemy1228(atlas);
        assetEnemy1229 = new Enemy1229(atlas);
        assetEnemy1230 = new Enemy1230(atlas);
        assetEnemy1231 = new Enemy1231(atlas);
        assetEnemy1232 = new Enemy1232(atlas);
        assetEnemy1233 = new Enemy1233(atlas);
        assetEnemy1234 = new Enemy1234(atlas);
        assetEnemy1235 = new Enemy1235(atlas);
        assetEnemy1236 = new Enemy1236(atlas);
        assetEnemy1237 = new Enemy1237(atlas);
        assetEnemy1238 = new Enemy1238(atlas);
        assetEnemy1239 = new Enemy1239(atlas);
        assetEnemy1240 = new Enemy1240(atlas);
        assetEnemy1241 = new Enemy1241(atlas);
        assetEnemy1242 = new Enemy1242(atlas);
        assetEnemy1243 = new Enemy1243(atlas);
        assetEnemy1244 = new Enemy1244(atlas);
        assetEnemy1245 = new Enemy1245(atlas);
        assetEnemy1246 = new Enemy1246(atlas);
        assetEnemy1247 = new Enemy1247(atlas);
        assetEnemy1248 = new Enemy1248(atlas);
        assetEnemy1249 = new Enemy1249(atlas);
        assetEnemy1250 = new Enemy1250(atlas);
        assetEnemy1251 = new Enemy1251(atlas);
        assetEnemy1252 = new Enemy1252(atlas);
        assetEnemy1253 = new Enemy1253(atlas);
        assetEnemy1254 = new Enemy1254(atlas);
        assetEnemy1255 = new Enemy1255(atlas);
        assetEnemy1256 = new Enemy1256(atlas);
        assetEnemy1257 = new Enemy1257(atlas);
        assetEnemy1258 = new Enemy1258(atlas);
        assetEnemy1259 = new Enemy1259(atlas);
        assetEnemy1260 = new Enemy1260(atlas);
        assetEnemy1261 = new Enemy1261(atlas);
        assetEnemy1262 = new Enemy1262(atlas);
        assetEnemy1263 = new Enemy1263(atlas);
        assetEnemy1264 = new Enemy1264(atlas);
        assetEnemy1265 = new Enemy1265(atlas);
        assetEnemy1266 = new Enemy1266(atlas);
        assetEnemy1267 = new Enemy1267(atlas);
        assetEnemy1268 = new Enemy1268(atlas);
        assetEnemy1269 = new Enemy1269(atlas);
        assetEnemy1270 = new Enemy1270(atlas);
        assetEnemy1271 = new Enemy1271(atlas);
        assetEnemy1272 = new Enemy1272(atlas);
        assetEnemy1273 = new Enemy1273(atlas);
        assetEnemy1274 = new Enemy1274(atlas);
        assetEnemy1275 = new Enemy1275(atlas);
        assetEnemy1276 = new Enemy1276(atlas);
        assetEnemy1277 = new Enemy1277(atlas);
        assetEnemy1278 = new Enemy1278(atlas);
        assetEnemy1279 = new Enemy1279(atlas);
        assetEnemy1280 = new Enemy1280(atlas);
        assetEnemy1281 = new Enemy1281(atlas);
        assetEnemy1282 = new Enemy1282(atlas);
        assetEnemy1283 = new Enemy1283(atlas);
        assetEnemy1284 = new Enemy1284(atlas);
        assetEnemy1285 = new Enemy1285(atlas);
        assetEnemy1286 = new Enemy1286(atlas);
        assetEnemy1287 = new Enemy1287(atlas);
        assetEnemy1288 = new Enemy1288(atlas);
        assetEnemy1289 = new Enemy1289(atlas);
        assetEnemy1290 = new Enemy1290(atlas);
        assetEnemy1291 = new Enemy1291(atlas);
        assetEnemy1292 = new Enemy1292(atlas);
        assetEnemy1293 = new Enemy1293(atlas);
        assetEnemy1294 = new Enemy1294(atlas);
        assetEnemy1295 = new Enemy1295(atlas);
        assetEnemy1296 = new Enemy1296(atlas);
        assetEnemy1297 = new Enemy1297(atlas);
        assetEnemy1298 = new Enemy1298(atlas);
        assetEnemy1299 = new Enemy1299(atlas);
        assetEnemy1300 = new Enemy1300(atlas);
        assetEnemy1301 = new Enemy1301(atlas);
        assetEnemy1302 = new Enemy1302(atlas);
        assetEnemy1303 = new Enemy1303(atlas);
        assetEnemy1304 = new Enemy1304(atlas);
        assetEnemy1305 = new Enemy1305(atlas);
        assetEnemy1306 = new Enemy1306(atlas);
        assetEnemy1307 = new Enemy1307(atlas);
        assetEnemy1308 = new Enemy1308(atlas);
        assetEnemy1309 = new Enemy1309(atlas);
        assetEnemy1310 = new Enemy1310(atlas);
        assetEnemy1311 = new Enemy1311(atlas);
        assetEnemy1312 = new Enemy1312(atlas);
        assetEnemy1313 = new Enemy1313(atlas);
        assetEnemy1314 = new Enemy1314(atlas);
        assetEnemy1315 = new Enemy1315(atlas);
        assetEnemy1316 = new Enemy1316(atlas);
        assetEnemy1317 = new Enemy1317(atlas);
        assetEnemy1318 = new Enemy1318(atlas);
        assetEnemy1319 = new Enemy1319(atlas);
        assetEnemy1320 = new Enemy1320(atlas);
        assetEnemy1321 = new Enemy1321(atlas);
        assetEnemy1322 = new Enemy1322(atlas);
        assetEnemy1323 = new Enemy1323(atlas);
        assetEnemy1324 = new Enemy1324(atlas);
        assetEnemy1325 = new Enemy1325(atlas);
        assetEnemy1326 = new Enemy1326(atlas);
        assetEnemy1327 = new Enemy1327(atlas);
        assetEnemy1328 = new Enemy1328(atlas);
        assetEnemy1329 = new Enemy1329(atlas);
        assetEnemy1330 = new Enemy1330(atlas);
        assetEnemy1331 = new Enemy1331(atlas);
        assetEnemy1332 = new Enemy1332(atlas);
        assetEnemy1333 = new Enemy1333(atlas);
        assetEnemy1334 = new Enemy1334(atlas);
        assetEnemy1335 = new Enemy1335(atlas);
        assetEnemy1336 = new Enemy1336(atlas);
        assetEnemy1337 = new Enemy1337(atlas);
        assetEnemy1338 = new Enemy1338(atlas);
        assetEnemy1339 = new Enemy1339(atlas);
        assetEnemy1340 = new Enemy1340(atlas);
        assetEnemy1341 = new Enemy1341(atlas);
        assetEnemy1342 = new Enemy1342(atlas);
        assetEnemy1343 = new Enemy1343(atlas);
        assetEnemy1344 = new Enemy1344(atlas);
        assetEnemy1345 = new Enemy1345(atlas);
        assetEnemy1346 = new Enemy1346(atlas);
        assetEnemy1347 = new Enemy1347(atlas);
        assetEnemy1348 = new Enemy1348(atlas);
        assetEnemy1349 = new Enemy1349(atlas);
        assetEnemy1350 = new Enemy1350(atlas);
        assetEnemy1351 = new Enemy1351(atlas);
        assetEnemy1352 = new Enemy1352(atlas);
        assetEnemy1353 = new Enemy1353(atlas);
        assetEnemy1354 = new Enemy1354(atlas);
        assetEnemy1355 = new Enemy1355(atlas);
        assetEnemy1356 = new Enemy1356(atlas);
        assetEnemy1357 = new Enemy1357(atlas);
        assetEnemy1358 = new Enemy1358(atlas);
        assetEnemy1359 = new Enemy1359(atlas);
        assetEnemy1360 = new Enemy1360(atlas);
        assetEnemy1361 = new Enemy1361(atlas);
        assetEnemy1362 = new Enemy1362(atlas);
        assetEnemy1363 = new Enemy1363(atlas);
        assetEnemy1364 = new Enemy1364(atlas);
        assetEnemy1365 = new Enemy1365(atlas);
        assetEnemy1366 = new Enemy1366(atlas);
        assetEnemy1367 = new Enemy1367(atlas);
        assetEnemy1368 = new Enemy1368(atlas);
        assetEnemy1369 = new Enemy1369(atlas);
        assetEnemy1370 = new Enemy1370(atlas);
        assetEnemy1371 = new Enemy1371(atlas);
        assetEnemy1372 = new Enemy1372(atlas);
        assetEnemy1373 = new Enemy1373(atlas);
        assetEnemy1374 = new Enemy1374(atlas);
        assetEnemy1375 = new Enemy1375(atlas);
        assetEnemy1376 = new Enemy1376(atlas);
        assetEnemy1377 = new Enemy1377(atlas);
        assetEnemy1378 = new Enemy1378(atlas);
        assetEnemy1379 = new Enemy1379(atlas);
        assetEnemy1380 = new Enemy1380(atlas);
        assetEnemy1381 = new Enemy1381(atlas);
        assetEnemy1382 = new Enemy1382(atlas);
        assetEnemy1383 = new Enemy1383(atlas);
        assetEnemy1384 = new Enemy1384(atlas);
        assetEnemy1385 = new Enemy1385(atlas);
        assetEnemy1386 = new Enemy1386(atlas);
        assetEnemy1387 = new Enemy1387(atlas);
        assetEnemy1388 = new Enemy1388(atlas);
        assetEnemy1389 = new Enemy1389(atlas);
        assetEnemy1390 = new Enemy1390(atlas);
        assetEnemy1391 = new Enemy1391(atlas);
        assetEnemy1392 = new Enemy1392(atlas);
        assetEnemy1393 = new Enemy1393(atlas);
        assetEnemy1394 = new Enemy1394(atlas);
        assetEnemy1395 = new Enemy1395(atlas);
        assetEnemy1396 = new Enemy1396(atlas);
        assetEnemy1397 = new Enemy1397(atlas);
    }

    @Override
    public void dispose () {
        assetManager.dispose();
    }

    @Override
    public void error(AssetDescriptor asset, Throwable throwable) {

    }
    public class Enemy0 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy0 (TextureAtlas atlas) {
            region = atlas.findRegion("0");
        }
    }
    public class Enemy1 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1 (TextureAtlas atlas) {
            region = atlas.findRegion("1");
        }
    }
    public class Enemy2 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy2 (TextureAtlas atlas) {
            region = atlas.findRegion("2");
        }
    }
    public class Enemy3 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy3 (TextureAtlas atlas) {
            region = atlas.findRegion("3");
        }
    }
    public class Enemy4 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy4 (TextureAtlas atlas) {
            region = atlas.findRegion("4");
        }
    }
    public class Enemy5 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy5 (TextureAtlas atlas) {
            region = atlas.findRegion("5");
        }
    }
    public class Enemy6 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy6 (TextureAtlas atlas) {
            region = atlas.findRegion("6");
        }
    }
    public class Enemy7 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy7 (TextureAtlas atlas) {
            region = atlas.findRegion("7");
        }
    }
    public class Enemy8 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy8 (TextureAtlas atlas) {
            region = atlas.findRegion("8");
        }
    }
    public class Enemy9 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy9 (TextureAtlas atlas) {
            region = atlas.findRegion("9");
        }
    }
    public class Enemy10 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy10 (TextureAtlas atlas) {
            region = atlas.findRegion("10");
        }
    }
    public class Enemy11 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy11 (TextureAtlas atlas) {
            region = atlas.findRegion("11");
        }
    }
    public class Enemy12 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy12 (TextureAtlas atlas) {
            region = atlas.findRegion("12");
        }
    }
    public class Enemy13 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy13 (TextureAtlas atlas) {
            region = atlas.findRegion("13");
        }
    }
    public class Enemy14 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy14 (TextureAtlas atlas) {
            region = atlas.findRegion("14");
        }
    }
    public class Enemy15 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy15 (TextureAtlas atlas) {
            region = atlas.findRegion("15");
        }
    }
    public class Enemy16 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy16 (TextureAtlas atlas) {
            region = atlas.findRegion("16");
        }
    }
    public class Enemy17 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy17 (TextureAtlas atlas) {
            region = atlas.findRegion("17");
        }
    }
    public class Enemy18 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy18 (TextureAtlas atlas) {
            region = atlas.findRegion("18");
        }
    }
    public class Enemy19 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy19 (TextureAtlas atlas) {
            region = atlas.findRegion("19");
        }
    }
    public class Enemy20 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy20 (TextureAtlas atlas) {
            region = atlas.findRegion("20");
        }
    }
    public class Enemy21 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy21 (TextureAtlas atlas) {
            region = atlas.findRegion("21");
        }
    }
    public class Enemy22 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy22 (TextureAtlas atlas) {
            region = atlas.findRegion("22");
        }
    }
    public class Enemy23 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy23 (TextureAtlas atlas) {
            region = atlas.findRegion("23");
        }
    }
    public class Enemy24 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy24 (TextureAtlas atlas) {
            region = atlas.findRegion("24");
        }
    }
    public class Enemy25 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy25 (TextureAtlas atlas) {
            region = atlas.findRegion("25");
        }
    }
    public class Enemy26 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy26 (TextureAtlas atlas) {
            region = atlas.findRegion("26");
        }
    }
    public class Enemy27 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy27 (TextureAtlas atlas) {
            region = atlas.findRegion("27");
        }
    }
    public class Enemy28 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy28 (TextureAtlas atlas) {
            region = atlas.findRegion("28");
        }
    }
    public class Enemy29 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy29 (TextureAtlas atlas) {
            region = atlas.findRegion("29");
        }
    }
    public class Enemy30 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy30 (TextureAtlas atlas) {
            region = atlas.findRegion("30");
        }
    }
    public class Enemy31 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy31 (TextureAtlas atlas) {
            region = atlas.findRegion("31");
        }
    }
    public class Enemy32 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy32 (TextureAtlas atlas) {
            region = atlas.findRegion("32");
        }
    }
    public class Enemy33 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy33 (TextureAtlas atlas) {
            region = atlas.findRegion("33");
        }
    }
    public class Enemy34 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy34 (TextureAtlas atlas) {
            region = atlas.findRegion("34");
        }
    }
    public class Enemy35 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy35 (TextureAtlas atlas) {
            region = atlas.findRegion("35");
        }
    }
    public class Enemy36 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy36 (TextureAtlas atlas) {
            region = atlas.findRegion("36");
        }
    }
    public class Enemy37 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy37 (TextureAtlas atlas) {
            region = atlas.findRegion("37");
        }
    }
    public class Enemy38 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy38 (TextureAtlas atlas) {
            region = atlas.findRegion("38");
        }
    }
    public class Enemy39 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy39 (TextureAtlas atlas) {
            region = atlas.findRegion("39");
        }
    }
    public class Enemy40 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy40 (TextureAtlas atlas) {
            region = atlas.findRegion("40");
        }
    }
    public class Enemy41 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy41 (TextureAtlas atlas) {
            region = atlas.findRegion("41");
        }
    }
    public class Enemy42 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy42 (TextureAtlas atlas) {
            region = atlas.findRegion("42");
        }
    }
    public class Enemy43 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy43 (TextureAtlas atlas) {
            region = atlas.findRegion("43");
        }
    }
    public class Enemy44 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy44 (TextureAtlas atlas) {
            region = atlas.findRegion("44");
        }
    }
    public class Enemy45 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy45 (TextureAtlas atlas) {
            region = atlas.findRegion("45");
        }
    }
    public class Enemy46 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy46 (TextureAtlas atlas) {
            region = atlas.findRegion("46");
        }
    }
    public class Enemy47 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy47 (TextureAtlas atlas) {
            region = atlas.findRegion("47");
        }
    }
    public class Enemy48 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy48 (TextureAtlas atlas) {
            region = atlas.findRegion("48");
        }
    }
    public class Enemy49 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy49 (TextureAtlas atlas) {
            region = atlas.findRegion("49");
        }
    }
    public class Enemy50 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy50 (TextureAtlas atlas) {
            region = atlas.findRegion("50");
        }
    }
    public class Enemy51 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy51 (TextureAtlas atlas) {
            region = atlas.findRegion("51");
        }
    }
    public class Enemy52 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy52 (TextureAtlas atlas) {
            region = atlas.findRegion("52");
        }
    }
    public class Enemy53 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy53 (TextureAtlas atlas) {
            region = atlas.findRegion("53");
        }
    }
    public class Enemy54 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy54 (TextureAtlas atlas) {
            region = atlas.findRegion("54");
        }
    }
    public class Enemy55 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy55 (TextureAtlas atlas) {
            region = atlas.findRegion("55");
        }
    }
    public class Enemy56 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy56 (TextureAtlas atlas) {
            region = atlas.findRegion("56");
        }
    }
    public class Enemy57 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy57 (TextureAtlas atlas) {
            region = atlas.findRegion("57");
        }
    }
    public class Enemy58 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy58 (TextureAtlas atlas) {
            region = atlas.findRegion("58");
        }
    }
    public class Enemy59 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy59 (TextureAtlas atlas) {
            region = atlas.findRegion("59");
        }
    }
    public class Enemy60 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy60 (TextureAtlas atlas) {
            region = atlas.findRegion("60");
        }
    }
    public class Enemy61 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy61 (TextureAtlas atlas) {
            region = atlas.findRegion("61");
        }
    }
    public class Enemy62 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy62 (TextureAtlas atlas) {
            region = atlas.findRegion("62");
        }
    }
    public class Enemy63 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy63 (TextureAtlas atlas) {
            region = atlas.findRegion("63");
        }
    }
    public class Enemy64 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy64 (TextureAtlas atlas) {
            region = atlas.findRegion("64");
        }
    }
    public class Enemy65 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy65 (TextureAtlas atlas) {
            region = atlas.findRegion("65");
        }
    }
    public class Enemy66 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy66 (TextureAtlas atlas) {
            region = atlas.findRegion("66");
        }
    }
    public class Enemy67 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy67 (TextureAtlas atlas) {
            region = atlas.findRegion("67");
        }
    }
    public class Enemy68 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy68 (TextureAtlas atlas) {
            region = atlas.findRegion("68");
        }
    }
    public class Enemy69 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy69 (TextureAtlas atlas) {
            region = atlas.findRegion("69");
        }
    }
    public class Enemy70 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy70 (TextureAtlas atlas) {
            region = atlas.findRegion("70");
        }
    }
    public class Enemy71 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy71 (TextureAtlas atlas) {
            region = atlas.findRegion("71");
        }
    }
    public class Enemy72 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy72 (TextureAtlas atlas) {
            region = atlas.findRegion("72");
        }
    }
    public class Enemy73 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy73 (TextureAtlas atlas) {
            region = atlas.findRegion("73");
        }
    }
    public class Enemy74 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy74 (TextureAtlas atlas) {
            region = atlas.findRegion("74");
        }
    }
    public class Enemy75 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy75 (TextureAtlas atlas) {
            region = atlas.findRegion("75");
        }
    }
    public class Enemy76 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy76 (TextureAtlas atlas) {
            region = atlas.findRegion("76");
        }
    }
    public class Enemy77 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy77 (TextureAtlas atlas) {
            region = atlas.findRegion("77");
        }
    }
    public class Enemy78 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy78 (TextureAtlas atlas) {
            region = atlas.findRegion("78");
        }
    }
    public class Enemy79 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy79 (TextureAtlas atlas) {
            region = atlas.findRegion("79");
        }
    }
    public class Enemy80 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy80 (TextureAtlas atlas) {
            region = atlas.findRegion("80");
        }
    }
    public class Enemy81 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy81 (TextureAtlas atlas) {
            region = atlas.findRegion("81");
        }
    }
    public class Enemy82 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy82 (TextureAtlas atlas) {
            region = atlas.findRegion("82");
        }
    }
    public class Enemy83 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy83 (TextureAtlas atlas) {
            region = atlas.findRegion("83");
        }
    }
    public class Enemy84 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy84 (TextureAtlas atlas) {
            region = atlas.findRegion("84");
        }
    }
    public class Enemy85 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy85 (TextureAtlas atlas) {
            region = atlas.findRegion("85");
        }
    }
    public class Enemy86 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy86 (TextureAtlas atlas) {
            region = atlas.findRegion("86");
        }
    }
    public class Enemy87 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy87 (TextureAtlas atlas) {
            region = atlas.findRegion("87");
        }
    }
    public class Enemy88 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy88 (TextureAtlas atlas) {
            region = atlas.findRegion("88");
        }
    }
    public class Enemy89 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy89 (TextureAtlas atlas) {
            region = atlas.findRegion("89");
        }
    }
    public class Enemy90 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy90 (TextureAtlas atlas) {
            region = atlas.findRegion("90");
        }
    }
    public class Enemy91 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy91 (TextureAtlas atlas) {
            region = atlas.findRegion("91");
        }
    }
    public class Enemy92 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy92 (TextureAtlas atlas) {
            region = atlas.findRegion("92");
        }
    }
    public class Enemy93 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy93 (TextureAtlas atlas) {
            region = atlas.findRegion("93");
        }
    }
    public class Enemy94 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy94 (TextureAtlas atlas) {
            region = atlas.findRegion("94");
        }
    }
    public class Enemy95 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy95 (TextureAtlas atlas) {
            region = atlas.findRegion("95");
        }
    }
    public class Enemy96 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy96 (TextureAtlas atlas) {
            region = atlas.findRegion("96");
        }
    }
    public class Enemy97 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy97 (TextureAtlas atlas) {
            region = atlas.findRegion("97");
        }
    }
    public class Enemy98 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy98 (TextureAtlas atlas) {
            region = atlas.findRegion("98");
        }
    }
    public class Enemy99 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy99 (TextureAtlas atlas) {
            region = atlas.findRegion("99");
        }
    }
    public class Enemy100 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy100 (TextureAtlas atlas) {
            region = atlas.findRegion("100");
        }
    }
    public class Enemy101 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy101 (TextureAtlas atlas) {
            region = atlas.findRegion("101");
        }
    }
    public class Enemy102 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy102 (TextureAtlas atlas) {
            region = atlas.findRegion("102");
        }
    }
    public class Enemy103 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy103 (TextureAtlas atlas) {
            region = atlas.findRegion("103");
        }
    }
    public class Enemy104 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy104 (TextureAtlas atlas) {
            region = atlas.findRegion("104");
        }
    }
    public class Enemy105 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy105 (TextureAtlas atlas) {
            region = atlas.findRegion("105");
        }
    }
    public class Enemy106 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy106 (TextureAtlas atlas) {
            region = atlas.findRegion("106");
        }
    }
    public class Enemy107 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy107 (TextureAtlas atlas) {
            region = atlas.findRegion("107");
        }
    }
    public class Enemy108 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy108 (TextureAtlas atlas) {
            region = atlas.findRegion("108");
        }
    }
    public class Enemy109 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy109 (TextureAtlas atlas) {
            region = atlas.findRegion("109");
        }
    }
    public class Enemy110 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy110 (TextureAtlas atlas) {
            region = atlas.findRegion("110");
        }
    }
    public class Enemy111 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy111 (TextureAtlas atlas) {
            region = atlas.findRegion("111");
        }
    }
    public class Enemy112 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy112 (TextureAtlas atlas) {
            region = atlas.findRegion("112");
        }
    }
    public class Enemy113 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy113 (TextureAtlas atlas) {
            region = atlas.findRegion("113");
        }
    }
    public class Enemy114 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy114 (TextureAtlas atlas) {
            region = atlas.findRegion("114");
        }
    }
    public class Enemy115 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy115 (TextureAtlas atlas) {
            region = atlas.findRegion("115");
        }
    }
    public class Enemy116 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy116 (TextureAtlas atlas) {
            region = atlas.findRegion("116");
        }
    }
    public class Enemy117 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy117 (TextureAtlas atlas) {
            region = atlas.findRegion("117");
        }
    }
    public class Enemy118 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy118 (TextureAtlas atlas) {
            region = atlas.findRegion("118");
        }
    }
    public class Enemy119 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy119 (TextureAtlas atlas) {
            region = atlas.findRegion("119");
        }
    }
    public class Enemy120 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy120 (TextureAtlas atlas) {
            region = atlas.findRegion("120");
        }
    }
    public class Enemy121 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy121 (TextureAtlas atlas) {
            region = atlas.findRegion("121");
        }
    }
    public class Enemy122 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy122 (TextureAtlas atlas) {
            region = atlas.findRegion("122");
        }
    }
    public class Enemy123 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy123 (TextureAtlas atlas) {
            region = atlas.findRegion("123");
        }
    }
    public class Enemy124 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy124 (TextureAtlas atlas) {
            region = atlas.findRegion("124");
        }
    }
    public class Enemy125 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy125 (TextureAtlas atlas) {
            region = atlas.findRegion("125");
        }
    }
    public class Enemy126 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy126 (TextureAtlas atlas) {
            region = atlas.findRegion("126");
        }
    }
    public class Enemy127 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy127 (TextureAtlas atlas) {
            region = atlas.findRegion("127");
        }
    }
    public class Enemy128 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy128 (TextureAtlas atlas) {
            region = atlas.findRegion("128");
        }
    }
    public class Enemy129 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy129 (TextureAtlas atlas) {
            region = atlas.findRegion("129");
        }
    }
    public class Enemy130 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy130 (TextureAtlas atlas) {
            region = atlas.findRegion("130");
        }
    }
    public class Enemy131 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy131 (TextureAtlas atlas) {
            region = atlas.findRegion("131");
        }
    }
    public class Enemy132 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy132 (TextureAtlas atlas) {
            region = atlas.findRegion("132");
        }
    }
    public class Enemy133 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy133 (TextureAtlas atlas) {
            region = atlas.findRegion("133");
        }
    }
    public class Enemy134 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy134 (TextureAtlas atlas) {
            region = atlas.findRegion("134");
        }
    }
    public class Enemy135 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy135 (TextureAtlas atlas) {
            region = atlas.findRegion("135");
        }
    }
    public class Enemy136 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy136 (TextureAtlas atlas) {
            region = atlas.findRegion("136");
        }
    }
    public class Enemy137 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy137 (TextureAtlas atlas) {
            region = atlas.findRegion("137");
        }
    }
    public class Enemy138 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy138 (TextureAtlas atlas) {
            region = atlas.findRegion("138");
        }
    }
    public class Enemy139 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy139 (TextureAtlas atlas) {
            region = atlas.findRegion("139");
        }
    }
    public class Enemy140 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy140 (TextureAtlas atlas) {
            region = atlas.findRegion("140");
        }
    }
    public class Enemy141 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy141 (TextureAtlas atlas) {
            region = atlas.findRegion("141");
        }
    }
    public class Enemy142 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy142 (TextureAtlas atlas) {
            region = atlas.findRegion("142");
        }
    }
    public class Enemy143 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy143 (TextureAtlas atlas) {
            region = atlas.findRegion("143");
        }
    }
    public class Enemy144 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy144 (TextureAtlas atlas) {
            region = atlas.findRegion("144");
        }
    }
    public class Enemy145 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy145 (TextureAtlas atlas) {
            region = atlas.findRegion("145");
        }
    }
    public class Enemy146 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy146 (TextureAtlas atlas) {
            region = atlas.findRegion("146");
        }
    }
    public class Enemy147 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy147 (TextureAtlas atlas) {
            region = atlas.findRegion("147");
        }
    }
    public class Enemy148 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy148 (TextureAtlas atlas) {
            region = atlas.findRegion("148");
        }
    }
    public class Enemy149 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy149 (TextureAtlas atlas) {
            region = atlas.findRegion("149");
        }
    }
    public class Enemy150 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy150 (TextureAtlas atlas) {
            region = atlas.findRegion("150");
        }
    }
    public class Enemy151 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy151 (TextureAtlas atlas) {
            region = atlas.findRegion("151");
        }
    }
    public class Enemy152 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy152 (TextureAtlas atlas) {
            region = atlas.findRegion("152");
        }
    }
    public class Enemy153 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy153 (TextureAtlas atlas) {
            region = atlas.findRegion("153");
        }
    }
    public class Enemy154 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy154 (TextureAtlas atlas) {
            region = atlas.findRegion("154");
        }
    }
    public class Enemy155 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy155 (TextureAtlas atlas) {
            region = atlas.findRegion("155");
        }
    }
    public class Enemy156 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy156 (TextureAtlas atlas) {
            region = atlas.findRegion("156");
        }
    }
    public class Enemy157 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy157 (TextureAtlas atlas) {
            region = atlas.findRegion("157");
        }
    }
    public class Enemy158 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy158 (TextureAtlas atlas) {
            region = atlas.findRegion("158");
        }
    }
    public class Enemy159 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy159 (TextureAtlas atlas) {
            region = atlas.findRegion("159");
        }
    }
    public class Enemy160 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy160 (TextureAtlas atlas) {
            region = atlas.findRegion("160");
        }
    }
    public class Enemy161 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy161 (TextureAtlas atlas) {
            region = atlas.findRegion("161");
        }
    }
    public class Enemy162 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy162 (TextureAtlas atlas) {
            region = atlas.findRegion("162");
        }
    }
    public class Enemy163 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy163 (TextureAtlas atlas) {
            region = atlas.findRegion("163");
        }
    }
    public class Enemy164 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy164 (TextureAtlas atlas) {
            region = atlas.findRegion("164");
        }
    }
    public class Enemy165 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy165 (TextureAtlas atlas) {
            region = atlas.findRegion("165");
        }
    }
    public class Enemy166 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy166 (TextureAtlas atlas) {
            region = atlas.findRegion("166");
        }
    }
    public class Enemy167 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy167 (TextureAtlas atlas) {
            region = atlas.findRegion("167");
        }
    }
    public class Enemy168 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy168 (TextureAtlas atlas) {
            region = atlas.findRegion("168");
        }
    }
    public class Enemy169 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy169 (TextureAtlas atlas) {
            region = atlas.findRegion("169");
        }
    }
    public class Enemy170 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy170 (TextureAtlas atlas) {
            region = atlas.findRegion("170");
        }
    }
    public class Enemy171 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy171 (TextureAtlas atlas) {
            region = atlas.findRegion("171");
        }
    }
    public class Enemy172 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy172 (TextureAtlas atlas) {
            region = atlas.findRegion("172");
        }
    }
    public class Enemy173 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy173 (TextureAtlas atlas) {
            region = atlas.findRegion("173");
        }
    }
    public class Enemy174 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy174 (TextureAtlas atlas) {
            region = atlas.findRegion("174");
        }
    }
    public class Enemy175 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy175 (TextureAtlas atlas) {
            region = atlas.findRegion("175");
        }
    }
    public class Enemy176 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy176 (TextureAtlas atlas) {
            region = atlas.findRegion("176");
        }
    }
    public class Enemy177 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy177 (TextureAtlas atlas) {
            region = atlas.findRegion("177");
        }
    }
    public class Enemy178 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy178 (TextureAtlas atlas) {
            region = atlas.findRegion("178");
        }
    }
    public class Enemy179 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy179 (TextureAtlas atlas) {
            region = atlas.findRegion("179");
        }
    }
    public class Enemy180 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy180 (TextureAtlas atlas) {
            region = atlas.findRegion("180");
        }
    }
    public class Enemy181 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy181 (TextureAtlas atlas) {
            region = atlas.findRegion("181");
        }
    }
    public class Enemy182 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy182 (TextureAtlas atlas) {
            region = atlas.findRegion("182");
        }
    }
    public class Enemy183 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy183 (TextureAtlas atlas) {
            region = atlas.findRegion("183");
        }
    }
    public class Enemy184 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy184 (TextureAtlas atlas) {
            region = atlas.findRegion("184");
        }
    }
    public class Enemy185 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy185 (TextureAtlas atlas) {
            region = atlas.findRegion("185");
        }
    }
    public class Enemy186 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy186 (TextureAtlas atlas) {
            region = atlas.findRegion("186");
        }
    }
    public class Enemy187 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy187 (TextureAtlas atlas) {
            region = atlas.findRegion("187");
        }
    }
    public class Enemy188 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy188 (TextureAtlas atlas) {
            region = atlas.findRegion("188");
        }
    }
    public class Enemy189 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy189 (TextureAtlas atlas) {
            region = atlas.findRegion("189");
        }
    }
    public class Enemy190 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy190 (TextureAtlas atlas) {
            region = atlas.findRegion("190");
        }
    }
    public class Enemy191 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy191 (TextureAtlas atlas) {
            region = atlas.findRegion("191");
        }
    }
    public class Enemy192 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy192 (TextureAtlas atlas) {
            region = atlas.findRegion("192");
        }
    }
    public class Enemy193 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy193 (TextureAtlas atlas) {
            region = atlas.findRegion("193");
        }
    }
    public class Enemy194 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy194 (TextureAtlas atlas) {
            region = atlas.findRegion("194");
        }
    }
    public class Enemy195 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy195 (TextureAtlas atlas) {
            region = atlas.findRegion("195");
        }
    }
    public class Enemy196 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy196 (TextureAtlas atlas) {
            region = atlas.findRegion("196");
        }
    }
    public class Enemy197 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy197 (TextureAtlas atlas) {
            region = atlas.findRegion("197");
        }
    }
    public class Enemy198 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy198 (TextureAtlas atlas) {
            region = atlas.findRegion("198");
        }
    }
    public class Enemy199 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy199 (TextureAtlas atlas) {
            region = atlas.findRegion("199");
        }
    }
    public class Enemy200 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy200 (TextureAtlas atlas) {
            region = atlas.findRegion("200");
        }
    }
    public class Enemy201 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy201 (TextureAtlas atlas) {
            region = atlas.findRegion("201");
        }
    }
    public class Enemy202 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy202 (TextureAtlas atlas) {
            region = atlas.findRegion("202");
        }
    }
    public class Enemy203 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy203 (TextureAtlas atlas) {
            region = atlas.findRegion("203");
        }
    }
    public class Enemy204 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy204 (TextureAtlas atlas) {
            region = atlas.findRegion("204");
        }
    }
    public class Enemy205 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy205 (TextureAtlas atlas) {
            region = atlas.findRegion("205");
        }
    }
    public class Enemy206 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy206 (TextureAtlas atlas) {
            region = atlas.findRegion("206");
        }
    }
    public class Enemy207 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy207 (TextureAtlas atlas) {
            region = atlas.findRegion("207");
        }
    }
    public class Enemy208 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy208 (TextureAtlas atlas) {
            region = atlas.findRegion("208");
        }
    }
    public class Enemy209 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy209 (TextureAtlas atlas) {
            region = atlas.findRegion("209");
        }
    }
    public class Enemy210 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy210 (TextureAtlas atlas) {
            region = atlas.findRegion("210");
        }
    }
    public class Enemy211 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy211 (TextureAtlas atlas) {
            region = atlas.findRegion("211");
        }
    }
    public class Enemy212 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy212 (TextureAtlas atlas) {
            region = atlas.findRegion("212");
        }
    }
    public class Enemy213 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy213 (TextureAtlas atlas) {
            region = atlas.findRegion("213");
        }
    }
    public class Enemy214 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy214 (TextureAtlas atlas) {
            region = atlas.findRegion("214");
        }
    }
    public class Enemy215 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy215 (TextureAtlas atlas) {
            region = atlas.findRegion("215");
        }
    }
    public class Enemy216 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy216 (TextureAtlas atlas) {
            region = atlas.findRegion("216");
        }
    }
    public class Enemy217 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy217 (TextureAtlas atlas) {
            region = atlas.findRegion("217");
        }
    }
    public class Enemy218 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy218 (TextureAtlas atlas) {
            region = atlas.findRegion("218");
        }
    }
    public class Enemy219 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy219 (TextureAtlas atlas) {
            region = atlas.findRegion("219");
        }
    }
    public class Enemy220 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy220 (TextureAtlas atlas) {
            region = atlas.findRegion("220");
        }
    }
    public class Enemy221 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy221 (TextureAtlas atlas) {
            region = atlas.findRegion("221");
        }
    }
    public class Enemy222 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy222 (TextureAtlas atlas) {
            region = atlas.findRegion("222");
        }
    }
    public class Enemy223 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy223 (TextureAtlas atlas) {
            region = atlas.findRegion("223");
        }
    }
    public class Enemy224 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy224 (TextureAtlas atlas) {
            region = atlas.findRegion("224");
        }
    }
    public class Enemy225 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy225 (TextureAtlas atlas) {
            region = atlas.findRegion("225");
        }
    }
    public class Enemy226 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy226 (TextureAtlas atlas) {
            region = atlas.findRegion("226");
        }
    }
    public class Enemy227 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy227 (TextureAtlas atlas) {
            region = atlas.findRegion("227");
        }
    }
    public class Enemy228 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy228 (TextureAtlas atlas) {
            region = atlas.findRegion("228");
        }
    }
    public class Enemy229 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy229 (TextureAtlas atlas) {
            region = atlas.findRegion("229");
        }
    }
    public class Enemy230 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy230 (TextureAtlas atlas) {
            region = atlas.findRegion("230");
        }
    }
    public class Enemy231 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy231 (TextureAtlas atlas) {
            region = atlas.findRegion("231");
        }
    }
    public class Enemy232 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy232 (TextureAtlas atlas) {
            region = atlas.findRegion("232");
        }
    }
    public class Enemy233 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy233 (TextureAtlas atlas) {
            region = atlas.findRegion("233");
        }
    }
    public class Enemy234 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy234 (TextureAtlas atlas) {
            region = atlas.findRegion("234");
        }
    }
    public class Enemy235 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy235 (TextureAtlas atlas) {
            region = atlas.findRegion("235");
        }
    }
    public class Enemy236 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy236 (TextureAtlas atlas) {
            region = atlas.findRegion("236");
        }
    }
    public class Enemy237 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy237 (TextureAtlas atlas) {
            region = atlas.findRegion("237");
        }
    }
    public class Enemy238 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy238 (TextureAtlas atlas) {
            region = atlas.findRegion("238");
        }
    }
    public class Enemy239 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy239 (TextureAtlas atlas) {
            region = atlas.findRegion("239");
        }
    }
    public class Enemy240 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy240 (TextureAtlas atlas) {
            region = atlas.findRegion("240");
        }
    }
    public class Enemy241 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy241 (TextureAtlas atlas) {
            region = atlas.findRegion("241");
        }
    }
    public class Enemy242 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy242 (TextureAtlas atlas) {
            region = atlas.findRegion("242");
        }
    }
    public class Enemy243 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy243 (TextureAtlas atlas) {
            region = atlas.findRegion("243");
        }
    }
    public class Enemy244 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy244 (TextureAtlas atlas) {
            region = atlas.findRegion("244");
        }
    }
    public class Enemy245 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy245 (TextureAtlas atlas) {
            region = atlas.findRegion("245");
        }
    }
    public class Enemy246 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy246 (TextureAtlas atlas) {
            region = atlas.findRegion("246");
        }
    }
    public class Enemy247 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy247 (TextureAtlas atlas) {
            region = atlas.findRegion("247");
        }
    }
    public class Enemy248 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy248 (TextureAtlas atlas) {
            region = atlas.findRegion("248");
        }
    }
    public class Enemy249 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy249 (TextureAtlas atlas) {
            region = atlas.findRegion("249");
        }
    }
    public class Enemy250 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy250 (TextureAtlas atlas) {
            region = atlas.findRegion("250");
        }
    }
    public class Enemy251 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy251 (TextureAtlas atlas) {
            region = atlas.findRegion("251");
        }
    }
    public class Enemy252 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy252 (TextureAtlas atlas) {
            region = atlas.findRegion("252");
        }
    }
    public class Enemy253 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy253 (TextureAtlas atlas) {
            region = atlas.findRegion("253");
        }
    }
    public class Enemy254 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy254 (TextureAtlas atlas) {
            region = atlas.findRegion("254");
        }
    }
    public class Enemy255 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy255 (TextureAtlas atlas) {
            region = atlas.findRegion("255");
        }
    }
    public class Enemy256 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy256 (TextureAtlas atlas) {
            region = atlas.findRegion("256");
        }
    }
    public class Enemy257 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy257 (TextureAtlas atlas) {
            region = atlas.findRegion("257");
        }
    }
    public class Enemy258 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy258 (TextureAtlas atlas) {
            region = atlas.findRegion("258");
        }
    }
    public class Enemy259 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy259 (TextureAtlas atlas) {
            region = atlas.findRegion("259");
        }
    }
    public class Enemy260 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy260 (TextureAtlas atlas) {
            region = atlas.findRegion("260");
        }
    }
    public class Enemy261 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy261 (TextureAtlas atlas) {
            region = atlas.findRegion("261");
        }
    }
    public class Enemy262 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy262 (TextureAtlas atlas) {
            region = atlas.findRegion("262");
        }
    }
    public class Enemy263 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy263 (TextureAtlas atlas) {
            region = atlas.findRegion("263");
        }
    }
    public class Enemy264 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy264 (TextureAtlas atlas) {
            region = atlas.findRegion("264");
        }
    }
    public class Enemy265 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy265 (TextureAtlas atlas) {
            region = atlas.findRegion("265");
        }
    }
    public class Enemy266 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy266 (TextureAtlas atlas) {
            region = atlas.findRegion("266");
        }
    }
    public class Enemy267 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy267 (TextureAtlas atlas) {
            region = atlas.findRegion("267");
        }
    }
    public class Enemy268 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy268 (TextureAtlas atlas) {
            region = atlas.findRegion("268");
        }
    }
    public class Enemy269 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy269 (TextureAtlas atlas) {
            region = atlas.findRegion("269");
        }
    }
    public class Enemy270 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy270 (TextureAtlas atlas) {
            region = atlas.findRegion("270");
        }
    }
    public class Enemy271 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy271 (TextureAtlas atlas) {
            region = atlas.findRegion("271");
        }
    }
    public class Enemy272 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy272 (TextureAtlas atlas) {
            region = atlas.findRegion("272");
        }
    }
    public class Enemy273 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy273 (TextureAtlas atlas) {
            region = atlas.findRegion("273");
        }
    }
    public class Enemy274 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy274 (TextureAtlas atlas) {
            region = atlas.findRegion("274");
        }
    }
    public class Enemy275 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy275 (TextureAtlas atlas) {
            region = atlas.findRegion("275");
        }
    }
    public class Enemy276 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy276 (TextureAtlas atlas) {
            region = atlas.findRegion("276");
        }
    }
    public class Enemy277 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy277 (TextureAtlas atlas) {
            region = atlas.findRegion("277");
        }
    }
    public class Enemy278 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy278 (TextureAtlas atlas) {
            region = atlas.findRegion("278");
        }
    }
    public class Enemy279 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy279 (TextureAtlas atlas) {
            region = atlas.findRegion("279");
        }
    }
    public class Enemy280 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy280 (TextureAtlas atlas) {
            region = atlas.findRegion("280");
        }
    }
    public class Enemy281 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy281 (TextureAtlas atlas) {
            region = atlas.findRegion("281");
        }
    }
    public class Enemy282 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy282 (TextureAtlas atlas) {
            region = atlas.findRegion("282");
        }
    }
    public class Enemy283 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy283 (TextureAtlas atlas) {
            region = atlas.findRegion("283");
        }
    }
    public class Enemy284 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy284 (TextureAtlas atlas) {
            region = atlas.findRegion("284");
        }
    }
    public class Enemy285 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy285 (TextureAtlas atlas) {
            region = atlas.findRegion("285");
        }
    }
    public class Enemy286 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy286 (TextureAtlas atlas) {
            region = atlas.findRegion("286");
        }
    }
    public class Enemy287 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy287 (TextureAtlas atlas) {
            region = atlas.findRegion("287");
        }
    }
    public class Enemy288 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy288 (TextureAtlas atlas) {
            region = atlas.findRegion("288");
        }
    }
    public class Enemy289 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy289 (TextureAtlas atlas) {
            region = atlas.findRegion("289");
        }
    }
    public class Enemy290 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy290 (TextureAtlas atlas) {
            region = atlas.findRegion("290");
        }
    }
    public class Enemy291 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy291 (TextureAtlas atlas) {
            region = atlas.findRegion("291");
        }
    }
    public class Enemy292 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy292 (TextureAtlas atlas) {
            region = atlas.findRegion("292");
        }
    }
    public class Enemy293 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy293 (TextureAtlas atlas) {
            region = atlas.findRegion("293");
        }
    }
    public class Enemy294 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy294 (TextureAtlas atlas) {
            region = atlas.findRegion("294");
        }
    }
    public class Enemy295 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy295 (TextureAtlas atlas) {
            region = atlas.findRegion("295");
        }
    }
    public class Enemy296 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy296 (TextureAtlas atlas) {
            region = atlas.findRegion("296");
        }
    }
    public class Enemy297 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy297 (TextureAtlas atlas) {
            region = atlas.findRegion("297");
        }
    }
    public class Enemy298 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy298 (TextureAtlas atlas) {
            region = atlas.findRegion("298");
        }
    }
    public class Enemy299 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy299 (TextureAtlas atlas) {
            region = atlas.findRegion("299");
        }
    }
    public class Enemy300 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy300 (TextureAtlas atlas) {
            region = atlas.findRegion("300");
        }
    }
    public class Enemy301 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy301 (TextureAtlas atlas) {
            region = atlas.findRegion("301");
        }
    }
    public class Enemy302 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy302 (TextureAtlas atlas) {
            region = atlas.findRegion("302");
        }
    }
    public class Enemy303 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy303 (TextureAtlas atlas) {
            region = atlas.findRegion("303");
        }
    }
    public class Enemy304 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy304 (TextureAtlas atlas) {
            region = atlas.findRegion("304");
        }
    }
    public class Enemy305 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy305 (TextureAtlas atlas) {
            region = atlas.findRegion("305");
        }
    }
    public class Enemy306 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy306 (TextureAtlas atlas) {
            region = atlas.findRegion("306");
        }
    }
    public class Enemy307 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy307 (TextureAtlas atlas) {
            region = atlas.findRegion("307");
        }
    }
    public class Enemy308 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy308 (TextureAtlas atlas) {
            region = atlas.findRegion("308");
        }
    }
    public class Enemy309 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy309 (TextureAtlas atlas) {
            region = atlas.findRegion("309");
        }
    }
    public class Enemy310 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy310 (TextureAtlas atlas) {
            region = atlas.findRegion("310");
        }
    }
    public class Enemy311 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy311 (TextureAtlas atlas) {
            region = atlas.findRegion("311");
        }
    }
    public class Enemy312 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy312 (TextureAtlas atlas) {
            region = atlas.findRegion("312");
        }
    }
    public class Enemy313 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy313 (TextureAtlas atlas) {
            region = atlas.findRegion("313");
        }
    }
    public class Enemy314 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy314 (TextureAtlas atlas) {
            region = atlas.findRegion("314");
        }
    }
    public class Enemy315 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy315 (TextureAtlas atlas) {
            region = atlas.findRegion("315");
        }
    }
    public class Enemy316 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy316 (TextureAtlas atlas) {
            region = atlas.findRegion("316");
        }
    }
    public class Enemy317 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy317 (TextureAtlas atlas) {
            region = atlas.findRegion("317");
        }
    }
    public class Enemy318 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy318 (TextureAtlas atlas) {
            region = atlas.findRegion("318");
        }
    }
    public class Enemy319 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy319 (TextureAtlas atlas) {
            region = atlas.findRegion("319");
        }
    }
    public class Enemy320 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy320 (TextureAtlas atlas) {
            region = atlas.findRegion("320");
        }
    }
    public class Enemy321 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy321 (TextureAtlas atlas) {
            region = atlas.findRegion("321");
        }
    }
    public class Enemy322 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy322 (TextureAtlas atlas) {
            region = atlas.findRegion("322");
        }
    }
    public class Enemy323 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy323 (TextureAtlas atlas) {
            region = atlas.findRegion("323");
        }
    }
    public class Enemy324 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy324 (TextureAtlas atlas) {
            region = atlas.findRegion("324");
        }
    }
    public class Enemy325 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy325 (TextureAtlas atlas) {
            region = atlas.findRegion("325");
        }
    }
    public class Enemy326 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy326 (TextureAtlas atlas) {
            region = atlas.findRegion("326");
        }
    }
    public class Enemy327 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy327 (TextureAtlas atlas) {
            region = atlas.findRegion("327");
        }
    }
    public class Enemy328 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy328 (TextureAtlas atlas) {
            region = atlas.findRegion("328");
        }
    }
    public class Enemy329 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy329 (TextureAtlas atlas) {
            region = atlas.findRegion("329");
        }
    }
    public class Enemy330 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy330 (TextureAtlas atlas) {
            region = atlas.findRegion("330");
        }
    }
    public class Enemy331 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy331 (TextureAtlas atlas) {
            region = atlas.findRegion("331");
        }
    }
    public class Enemy332 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy332 (TextureAtlas atlas) {
            region = atlas.findRegion("332");
        }
    }
    public class Enemy333 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy333 (TextureAtlas atlas) {
            region = atlas.findRegion("333");
        }
    }
    public class Enemy334 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy334 (TextureAtlas atlas) {
            region = atlas.findRegion("334");
        }
    }
    public class Enemy335 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy335 (TextureAtlas atlas) {
            region = atlas.findRegion("335");
        }
    }
    public class Enemy336 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy336 (TextureAtlas atlas) {
            region = atlas.findRegion("336");
        }
    }
    public class Enemy337 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy337 (TextureAtlas atlas) {
            region = atlas.findRegion("337");
        }
    }
    public class Enemy338 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy338 (TextureAtlas atlas) {
            region = atlas.findRegion("338");
        }
    }
    public class Enemy339 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy339 (TextureAtlas atlas) {
            region = atlas.findRegion("339");
        }
    }
    public class Enemy340 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy340 (TextureAtlas atlas) {
            region = atlas.findRegion("340");
        }
    }
    public class Enemy341 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy341 (TextureAtlas atlas) {
            region = atlas.findRegion("341");
        }
    }
    public class Enemy342 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy342 (TextureAtlas atlas) {
            region = atlas.findRegion("342");
        }
    }
    public class Enemy343 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy343 (TextureAtlas atlas) {
            region = atlas.findRegion("343");
        }
    }
    public class Enemy344 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy344 (TextureAtlas atlas) {
            region = atlas.findRegion("344");
        }
    }
    public class Enemy345 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy345 (TextureAtlas atlas) {
            region = atlas.findRegion("345");
        }
    }
    public class Enemy346 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy346 (TextureAtlas atlas) {
            region = atlas.findRegion("346");
        }
    }
    public class Enemy347 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy347 (TextureAtlas atlas) {
            region = atlas.findRegion("347");
        }
    }
    public class Enemy348 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy348 (TextureAtlas atlas) {
            region = atlas.findRegion("348");
        }
    }
    public class Enemy349 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy349 (TextureAtlas atlas) {
            region = atlas.findRegion("349");
        }
    }
    public class Enemy350 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy350 (TextureAtlas atlas) {
            region = atlas.findRegion("350");
        }
    }
    public class Enemy351 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy351 (TextureAtlas atlas) {
            region = atlas.findRegion("351");
        }
    }
    public class Enemy352 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy352 (TextureAtlas atlas) {
            region = atlas.findRegion("352");
        }
    }
    public class Enemy353 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy353 (TextureAtlas atlas) {
            region = atlas.findRegion("353");
        }
    }
    public class Enemy354 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy354 (TextureAtlas atlas) {
            region = atlas.findRegion("354");
        }
    }
    public class Enemy355 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy355 (TextureAtlas atlas) {
            region = atlas.findRegion("355");
        }
    }
    public class Enemy356 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy356 (TextureAtlas atlas) {
            region = atlas.findRegion("356");
        }
    }
    public class Enemy357 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy357 (TextureAtlas atlas) {
            region = atlas.findRegion("357");
        }
    }
    public class Enemy358 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy358 (TextureAtlas atlas) {
            region = atlas.findRegion("358");
        }
    }
    public class Enemy359 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy359 (TextureAtlas atlas) {
            region = atlas.findRegion("359");
        }
    }
    public class Enemy360 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy360 (TextureAtlas atlas) {
            region = atlas.findRegion("360");
        }
    }
    public class Enemy361 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy361 (TextureAtlas atlas) {
            region = atlas.findRegion("361");
        }
    }
    public class Enemy362 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy362 (TextureAtlas atlas) {
            region = atlas.findRegion("362");
        }
    }
    public class Enemy363 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy363 (TextureAtlas atlas) {
            region = atlas.findRegion("363");
        }
    }
    public class Enemy364 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy364 (TextureAtlas atlas) {
            region = atlas.findRegion("364");
        }
    }
    public class Enemy365 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy365 (TextureAtlas atlas) {
            region = atlas.findRegion("365");
        }
    }
    public class Enemy366 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy366 (TextureAtlas atlas) {
            region = atlas.findRegion("366");
        }
    }
    public class Enemy367 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy367 (TextureAtlas atlas) {
            region = atlas.findRegion("367");
        }
    }
    public class Enemy368 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy368 (TextureAtlas atlas) {
            region = atlas.findRegion("368");
        }
    }
    public class Enemy369 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy369 (TextureAtlas atlas) {
            region = atlas.findRegion("369");
        }
    }
    public class Enemy370 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy370 (TextureAtlas atlas) {
            region = atlas.findRegion("370");
        }
    }
    public class Enemy371 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy371 (TextureAtlas atlas) {
            region = atlas.findRegion("371");
        }
    }
    public class Enemy372 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy372 (TextureAtlas atlas) {
            region = atlas.findRegion("372");
        }
    }
    public class Enemy373 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy373 (TextureAtlas atlas) {
            region = atlas.findRegion("373");
        }
    }
    public class Enemy374 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy374 (TextureAtlas atlas) {
            region = atlas.findRegion("374");
        }
    }
    public class Enemy375 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy375 (TextureAtlas atlas) {
            region = atlas.findRegion("375");
        }
    }
    public class Enemy376 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy376 (TextureAtlas atlas) {
            region = atlas.findRegion("376");
        }
    }
    public class Enemy377 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy377 (TextureAtlas atlas) {
            region = atlas.findRegion("377");
        }
    }
    public class Enemy378 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy378 (TextureAtlas atlas) {
            region = atlas.findRegion("378");
        }
    }
    public class Enemy379 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy379 (TextureAtlas atlas) {
            region = atlas.findRegion("379");
        }
    }
    public class Enemy380 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy380 (TextureAtlas atlas) {
            region = atlas.findRegion("380");
        }
    }
    public class Enemy381 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy381 (TextureAtlas atlas) {
            region = atlas.findRegion("381");
        }
    }
    public class Enemy382 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy382 (TextureAtlas atlas) {
            region = atlas.findRegion("382");
        }
    }
    public class Enemy383 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy383 (TextureAtlas atlas) {
            region = atlas.findRegion("383");
        }
    }
    public class Enemy384 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy384 (TextureAtlas atlas) {
            region = atlas.findRegion("384");
        }
    }
    public class Enemy385 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy385 (TextureAtlas atlas) {
            region = atlas.findRegion("385");
        }
    }
    public class Enemy386 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy386 (TextureAtlas atlas) {
            region = atlas.findRegion("386");
        }
    }
    public class Enemy387 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy387 (TextureAtlas atlas) {
            region = atlas.findRegion("387");
        }
    }
    public class Enemy388 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy388 (TextureAtlas atlas) {
            region = atlas.findRegion("388");
        }
    }
    public class Enemy389 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy389 (TextureAtlas atlas) {
            region = atlas.findRegion("389");
        }
    }
    public class Enemy390 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy390 (TextureAtlas atlas) {
            region = atlas.findRegion("390");
        }
    }
    public class Enemy391 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy391 (TextureAtlas atlas) {
            region = atlas.findRegion("391");
        }
    }
    public class Enemy392 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy392 (TextureAtlas atlas) {
            region = atlas.findRegion("392");
        }
    }
    public class Enemy393 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy393 (TextureAtlas atlas) {
            region = atlas.findRegion("393");
        }
    }
    public class Enemy394 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy394 (TextureAtlas atlas) {
            region = atlas.findRegion("394");
        }
    }
    public class Enemy395 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy395 (TextureAtlas atlas) {
            region = atlas.findRegion("395");
        }
    }
    public class Enemy396 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy396 (TextureAtlas atlas) {
            region = atlas.findRegion("396");
        }
    }
    public class Enemy397 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy397 (TextureAtlas atlas) {
            region = atlas.findRegion("397");
        }
    }
    public class Enemy398 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy398 (TextureAtlas atlas) {
            region = atlas.findRegion("398");
        }
    }
    public class Enemy399 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy399 (TextureAtlas atlas) {
            region = atlas.findRegion("399");
        }
    }
    public class Enemy400 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy400 (TextureAtlas atlas) {
            region = atlas.findRegion("400");
        }
    }
    public class Enemy401 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy401 (TextureAtlas atlas) {
            region = atlas.findRegion("401");
        }
    }
    public class Enemy402 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy402 (TextureAtlas atlas) {
            region = atlas.findRegion("402");
        }
    }
    public class Enemy403 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy403 (TextureAtlas atlas) {
            region = atlas.findRegion("403");
        }
    }
    public class Enemy404 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy404 (TextureAtlas atlas) {
            region = atlas.findRegion("404");
        }
    }
    public class Enemy405 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy405 (TextureAtlas atlas) {
            region = atlas.findRegion("405");
        }
    }
    public class Enemy406 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy406 (TextureAtlas atlas) {
            region = atlas.findRegion("406");
        }
    }
    public class Enemy407 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy407 (TextureAtlas atlas) {
            region = atlas.findRegion("407");
        }
    }
    public class Enemy408 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy408 (TextureAtlas atlas) {
            region = atlas.findRegion("408");
        }
    }
    public class Enemy409 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy409 (TextureAtlas atlas) {
            region = atlas.findRegion("409");
        }
    }
    public class Enemy410 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy410 (TextureAtlas atlas) {
            region = atlas.findRegion("410");
        }
    }
    public class Enemy411 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy411 (TextureAtlas atlas) {
            region = atlas.findRegion("411");
        }
    }
    public class Enemy412 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy412 (TextureAtlas atlas) {
            region = atlas.findRegion("412");
        }
    }
    public class Enemy413 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy413 (TextureAtlas atlas) {
            region = atlas.findRegion("413");
        }
    }
    public class Enemy414 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy414 (TextureAtlas atlas) {
            region = atlas.findRegion("414");
        }
    }
    public class Enemy415 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy415 (TextureAtlas atlas) {
            region = atlas.findRegion("415");
        }
    }
    public class Enemy416 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy416 (TextureAtlas atlas) {
            region = atlas.findRegion("416");
        }
    }
    public class Enemy417 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy417 (TextureAtlas atlas) {
            region = atlas.findRegion("417");
        }
    }
    public class Enemy418 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy418 (TextureAtlas atlas) {
            region = atlas.findRegion("418");
        }
    }
    public class Enemy419 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy419 (TextureAtlas atlas) {
            region = atlas.findRegion("419");
        }
    }
    public class Enemy420 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy420 (TextureAtlas atlas) {
            region = atlas.findRegion("420");
        }
    }
    public class Enemy421 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy421 (TextureAtlas atlas) {
            region = atlas.findRegion("421");
        }
    }
    public class Enemy422 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy422 (TextureAtlas atlas) {
            region = atlas.findRegion("422");
        }
    }
    public class Enemy423 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy423 (TextureAtlas atlas) {
            region = atlas.findRegion("423");
        }
    }
    public class Enemy424 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy424 (TextureAtlas atlas) {
            region = atlas.findRegion("424");
        }
    }
    public class Enemy425 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy425 (TextureAtlas atlas) {
            region = atlas.findRegion("425");
        }
    }
    public class Enemy426 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy426 (TextureAtlas atlas) {
            region = atlas.findRegion("426");
        }
    }
    public class Enemy427 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy427 (TextureAtlas atlas) {
            region = atlas.findRegion("427");
        }
    }
    public class Enemy428 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy428 (TextureAtlas atlas) {
            region = atlas.findRegion("428");
        }
    }
    public class Enemy429 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy429 (TextureAtlas atlas) {
            region = atlas.findRegion("429");
        }
    }
    public class Enemy430 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy430 (TextureAtlas atlas) {
            region = atlas.findRegion("430");
        }
    }
    public class Enemy431 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy431 (TextureAtlas atlas) {
            region = atlas.findRegion("431");
        }
    }
    public class Enemy432 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy432 (TextureAtlas atlas) {
            region = atlas.findRegion("432");
        }
    }
    public class Enemy433 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy433 (TextureAtlas atlas) {
            region = atlas.findRegion("433");
        }
    }
    public class Enemy434 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy434 (TextureAtlas atlas) {
            region = atlas.findRegion("434");
        }
    }
    public class Enemy435 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy435 (TextureAtlas atlas) {
            region = atlas.findRegion("435");
        }
    }
    public class Enemy436 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy436 (TextureAtlas atlas) {
            region = atlas.findRegion("436");
        }
    }
    public class Enemy437 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy437 (TextureAtlas atlas) {
            region = atlas.findRegion("437");
        }
    }
    public class Enemy438 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy438 (TextureAtlas atlas) {
            region = atlas.findRegion("438");
        }
    }
    public class Enemy439 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy439 (TextureAtlas atlas) {
            region = atlas.findRegion("439");
        }
    }
    public class Enemy440 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy440 (TextureAtlas atlas) {
            region = atlas.findRegion("440");
        }
    }
    public class Enemy441 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy441 (TextureAtlas atlas) {
            region = atlas.findRegion("441");
        }
    }
    public class Enemy442 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy442 (TextureAtlas atlas) {
            region = atlas.findRegion("442");
        }
    }
    public class Enemy443 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy443 (TextureAtlas atlas) {
            region = atlas.findRegion("443");
        }
    }
    public class Enemy444 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy444 (TextureAtlas atlas) {
            region = atlas.findRegion("444");
        }
    }
    public class Enemy445 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy445 (TextureAtlas atlas) {
            region = atlas.findRegion("445");
        }
    }
    public class Enemy446 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy446 (TextureAtlas atlas) {
            region = atlas.findRegion("446");
        }
    }
    public class Enemy447 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy447 (TextureAtlas atlas) {
            region = atlas.findRegion("447");
        }
    }
    public class Enemy448 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy448 (TextureAtlas atlas) {
            region = atlas.findRegion("448");
        }
    }
    public class Enemy449 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy449 (TextureAtlas atlas) {
            region = atlas.findRegion("449");
        }
    }
    public class Enemy450 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy450 (TextureAtlas atlas) {
            region = atlas.findRegion("450");
        }
    }
    public class Enemy451 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy451 (TextureAtlas atlas) {
            region = atlas.findRegion("451");
        }
    }
    public class Enemy452 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy452 (TextureAtlas atlas) {
            region = atlas.findRegion("452");
        }
    }
    public class Enemy453 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy453 (TextureAtlas atlas) {
            region = atlas.findRegion("453");
        }
    }
    public class Enemy454 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy454 (TextureAtlas atlas) {
            region = atlas.findRegion("454");
        }
    }
    public class Enemy455 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy455 (TextureAtlas atlas) {
            region = atlas.findRegion("455");
        }
    }
    public class Enemy456 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy456 (TextureAtlas atlas) {
            region = atlas.findRegion("456");
        }
    }
    public class Enemy457 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy457 (TextureAtlas atlas) {
            region = atlas.findRegion("457");
        }
    }
    public class Enemy458 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy458 (TextureAtlas atlas) {
            region = atlas.findRegion("458");
        }
    }
    public class Enemy459 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy459 (TextureAtlas atlas) {
            region = atlas.findRegion("459");
        }
    }
    public class Enemy460 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy460 (TextureAtlas atlas) {
            region = atlas.findRegion("460");
        }
    }
    public class Enemy461 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy461 (TextureAtlas atlas) {
            region = atlas.findRegion("461");
        }
    }
    public class Enemy462 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy462 (TextureAtlas atlas) {
            region = atlas.findRegion("462");
        }
    }
    public class Enemy463 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy463 (TextureAtlas atlas) {
            region = atlas.findRegion("463");
        }
    }
    public class Enemy464 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy464 (TextureAtlas atlas) {
            region = atlas.findRegion("464");
        }
    }
    public class Enemy465 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy465 (TextureAtlas atlas) {
            region = atlas.findRegion("465");
        }
    }
    public class Enemy466 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy466 (TextureAtlas atlas) {
            region = atlas.findRegion("466");
        }
    }
    public class Enemy467 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy467 (TextureAtlas atlas) {
            region = atlas.findRegion("467");
        }
    }
    public class Enemy468 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy468 (TextureAtlas atlas) {
            region = atlas.findRegion("468");
        }
    }
    public class Enemy469 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy469 (TextureAtlas atlas) {
            region = atlas.findRegion("469");
        }
    }
    public class Enemy470 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy470 (TextureAtlas atlas) {
            region = atlas.findRegion("470");
        }
    }
    public class Enemy471 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy471 (TextureAtlas atlas) {
            region = atlas.findRegion("471");
        }
    }
    public class Enemy472 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy472 (TextureAtlas atlas) {
            region = atlas.findRegion("472");
        }
    }
    public class Enemy473 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy473 (TextureAtlas atlas) {
            region = atlas.findRegion("473");
        }
    }
    public class Enemy474 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy474 (TextureAtlas atlas) {
            region = atlas.findRegion("474");
        }
    }
    public class Enemy475 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy475 (TextureAtlas atlas) {
            region = atlas.findRegion("475");
        }
    }
    public class Enemy476 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy476 (TextureAtlas atlas) {
            region = atlas.findRegion("476");
        }
    }
    public class Enemy477 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy477 (TextureAtlas atlas) {
            region = atlas.findRegion("477");
        }
    }
    public class Enemy478 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy478 (TextureAtlas atlas) {
            region = atlas.findRegion("478");
        }
    }
    public class Enemy479 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy479 (TextureAtlas atlas) {
            region = atlas.findRegion("479");
        }
    }
    public class Enemy480 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy480 (TextureAtlas atlas) {
            region = atlas.findRegion("480");
        }
    }
    public class Enemy481 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy481 (TextureAtlas atlas) {
            region = atlas.findRegion("481");
        }
    }
    public class Enemy482 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy482 (TextureAtlas atlas) {
            region = atlas.findRegion("482");
        }
    }
    public class Enemy483 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy483 (TextureAtlas atlas) {
            region = atlas.findRegion("483");
        }
    }
    public class Enemy484 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy484 (TextureAtlas atlas) {
            region = atlas.findRegion("484");
        }
    }
    public class Enemy485 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy485 (TextureAtlas atlas) {
            region = atlas.findRegion("485");
        }
    }
    public class Enemy486 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy486 (TextureAtlas atlas) {
            region = atlas.findRegion("486");
        }
    }
    public class Enemy487 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy487 (TextureAtlas atlas) {
            region = atlas.findRegion("487");
        }
    }
    public class Enemy488 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy488 (TextureAtlas atlas) {
            region = atlas.findRegion("488");
        }
    }
    public class Enemy489 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy489 (TextureAtlas atlas) {
            region = atlas.findRegion("489");
        }
    }
    public class Enemy490 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy490 (TextureAtlas atlas) {
            region = atlas.findRegion("490");
        }
    }
    public class Enemy491 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy491 (TextureAtlas atlas) {
            region = atlas.findRegion("491");
        }
    }
    public class Enemy492 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy492 (TextureAtlas atlas) {
            region = atlas.findRegion("492");
        }
    }
    public class Enemy493 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy493 (TextureAtlas atlas) {
            region = atlas.findRegion("493");
        }
    }
    public class Enemy494 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy494 (TextureAtlas atlas) {
            region = atlas.findRegion("494");
        }
    }
    public class Enemy495 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy495 (TextureAtlas atlas) {
            region = atlas.findRegion("495");
        }
    }
    public class Enemy496 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy496 (TextureAtlas atlas) {
            region = atlas.findRegion("496");
        }
    }
    public class Enemy497 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy497 (TextureAtlas atlas) {
            region = atlas.findRegion("497");
        }
    }
    public class Enemy498 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy498 (TextureAtlas atlas) {
            region = atlas.findRegion("498");
        }
    }
    public class Enemy499 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy499 (TextureAtlas atlas) {
            region = atlas.findRegion("499");
        }
    }
    public class Enemy500 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy500 (TextureAtlas atlas) {
            region = atlas.findRegion("500");
        }
    }
    public class Enemy501 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy501 (TextureAtlas atlas) {
            region = atlas.findRegion("501");
        }
    }
    public class Enemy502 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy502 (TextureAtlas atlas) {
            region = atlas.findRegion("502");
        }
    }
    public class Enemy503 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy503 (TextureAtlas atlas) {
            region = atlas.findRegion("503");
        }
    }
    public class Enemy504 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy504 (TextureAtlas atlas) {
            region = atlas.findRegion("504");
        }
    }
    public class Enemy505 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy505 (TextureAtlas atlas) {
            region = atlas.findRegion("505");
        }
    }
    public class Enemy506 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy506 (TextureAtlas atlas) {
            region = atlas.findRegion("506");
        }
    }
    public class Enemy507 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy507 (TextureAtlas atlas) {
            region = atlas.findRegion("507");
        }
    }
    public class Enemy508 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy508 (TextureAtlas atlas) {
            region = atlas.findRegion("508");
        }
    }
    public class Enemy509 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy509 (TextureAtlas atlas) {
            region = atlas.findRegion("509");
        }
    }
    public class Enemy510 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy510 (TextureAtlas atlas) {
            region = atlas.findRegion("510");
        }
    }
    public class Enemy511 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy511 (TextureAtlas atlas) {
            region = atlas.findRegion("511");
        }
    }
    public class Enemy512 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy512 (TextureAtlas atlas) {
            region = atlas.findRegion("512");
        }
    }
    public class Enemy513 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy513 (TextureAtlas atlas) {
            region = atlas.findRegion("513");
        }
    }
    public class Enemy514 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy514 (TextureAtlas atlas) {
            region = atlas.findRegion("514");
        }
    }
    public class Enemy515 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy515 (TextureAtlas atlas) {
            region = atlas.findRegion("515");
        }
    }
    public class Enemy516 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy516 (TextureAtlas atlas) {
            region = atlas.findRegion("516");
        }
    }
    public class Enemy517 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy517 (TextureAtlas atlas) {
            region = atlas.findRegion("517");
        }
    }
    public class Enemy518 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy518 (TextureAtlas atlas) {
            region = atlas.findRegion("518");
        }
    }
    public class Enemy519 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy519 (TextureAtlas atlas) {
            region = atlas.findRegion("519");
        }
    }
    public class Enemy520 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy520 (TextureAtlas atlas) {
            region = atlas.findRegion("520");
        }
    }
    public class Enemy521 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy521 (TextureAtlas atlas) {
            region = atlas.findRegion("521");
        }
    }
    public class Enemy522 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy522 (TextureAtlas atlas) {
            region = atlas.findRegion("522");
        }
    }
    public class Enemy523 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy523 (TextureAtlas atlas) {
            region = atlas.findRegion("523");
        }
    }
    public class Enemy524 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy524 (TextureAtlas atlas) {
            region = atlas.findRegion("524");
        }
    }
    public class Enemy525 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy525 (TextureAtlas atlas) {
            region = atlas.findRegion("525");
        }
    }
    public class Enemy526 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy526 (TextureAtlas atlas) {
            region = atlas.findRegion("526");
        }
    }
    public class Enemy527 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy527 (TextureAtlas atlas) {
            region = atlas.findRegion("527");
        }
    }
    public class Enemy528 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy528 (TextureAtlas atlas) {
            region = atlas.findRegion("528");
        }
    }
    public class Enemy529 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy529 (TextureAtlas atlas) {
            region = atlas.findRegion("529");
        }
    }
    public class Enemy530 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy530 (TextureAtlas atlas) {
            region = atlas.findRegion("530");
        }
    }
    public class Enemy531 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy531 (TextureAtlas atlas) {
            region = atlas.findRegion("531");
        }
    }
    public class Enemy532 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy532 (TextureAtlas atlas) {
            region = atlas.findRegion("532");
        }
    }
    public class Enemy533 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy533 (TextureAtlas atlas) {
            region = atlas.findRegion("533");
        }
    }
    public class Enemy534 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy534 (TextureAtlas atlas) {
            region = atlas.findRegion("534");
        }
    }
    public class Enemy535 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy535 (TextureAtlas atlas) {
            region = atlas.findRegion("535");
        }
    }
    public class Enemy536 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy536 (TextureAtlas atlas) {
            region = atlas.findRegion("536");
        }
    }
    public class Enemy537 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy537 (TextureAtlas atlas) {
            region = atlas.findRegion("537");
        }
    }
    public class Enemy538 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy538 (TextureAtlas atlas) {
            region = atlas.findRegion("538");
        }
    }
    public class Enemy539 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy539 (TextureAtlas atlas) {
            region = atlas.findRegion("539");
        }
    }
    public class Enemy540 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy540 (TextureAtlas atlas) {
            region = atlas.findRegion("540");
        }
    }
    public class Enemy541 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy541 (TextureAtlas atlas) {
            region = atlas.findRegion("541");
        }
    }
    public class Enemy542 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy542 (TextureAtlas atlas) {
            region = atlas.findRegion("542");
        }
    }
    public class Enemy543 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy543 (TextureAtlas atlas) {
            region = atlas.findRegion("543");
        }
    }
    public class Enemy544 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy544 (TextureAtlas atlas) {
            region = atlas.findRegion("544");
        }
    }
    public class Enemy545 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy545 (TextureAtlas atlas) {
            region = atlas.findRegion("545");
        }
    }
    public class Enemy546 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy546 (TextureAtlas atlas) {
            region = atlas.findRegion("546");
        }
    }
    public class Enemy547 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy547 (TextureAtlas atlas) {
            region = atlas.findRegion("547");
        }
    }
    public class Enemy548 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy548 (TextureAtlas atlas) {
            region = atlas.findRegion("548");
        }
    }
    public class Enemy549 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy549 (TextureAtlas atlas) {
            region = atlas.findRegion("549");
        }
    }
    public class Enemy550 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy550 (TextureAtlas atlas) {
            region = atlas.findRegion("550");
        }
    }
    public class Enemy551 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy551 (TextureAtlas atlas) {
            region = atlas.findRegion("551");
        }
    }
    public class Enemy552 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy552 (TextureAtlas atlas) {
            region = atlas.findRegion("552");
        }
    }
    public class Enemy553 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy553 (TextureAtlas atlas) {
            region = atlas.findRegion("553");
        }
    }
    public class Enemy554 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy554 (TextureAtlas atlas) {
            region = atlas.findRegion("554");
        }
    }
    public class Enemy555 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy555 (TextureAtlas atlas) {
            region = atlas.findRegion("555");
        }
    }
    public class Enemy556 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy556 (TextureAtlas atlas) {
            region = atlas.findRegion("556");
        }
    }
    public class Enemy557 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy557 (TextureAtlas atlas) {
            region = atlas.findRegion("557");
        }
    }
    public class Enemy558 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy558 (TextureAtlas atlas) {
            region = atlas.findRegion("558");
        }
    }
    public class Enemy559 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy559 (TextureAtlas atlas) {
            region = atlas.findRegion("559");
        }
    }
    public class Enemy560 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy560 (TextureAtlas atlas) {
            region = atlas.findRegion("560");
        }
    }
    public class Enemy561 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy561 (TextureAtlas atlas) {
            region = atlas.findRegion("561");
        }
    }
    public class Enemy562 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy562 (TextureAtlas atlas) {
            region = atlas.findRegion("562");
        }
    }
    public class Enemy563 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy563 (TextureAtlas atlas) {
            region = atlas.findRegion("563");
        }
    }
    public class Enemy564 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy564 (TextureAtlas atlas) {
            region = atlas.findRegion("564");
        }
    }
    public class Enemy565 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy565 (TextureAtlas atlas) {
            region = atlas.findRegion("565");
        }
    }
    public class Enemy566 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy566 (TextureAtlas atlas) {
            region = atlas.findRegion("566");
        }
    }
    public class Enemy567 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy567 (TextureAtlas atlas) {
            region = atlas.findRegion("567");
        }
    }
    public class Enemy568 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy568 (TextureAtlas atlas) {
            region = atlas.findRegion("568");
        }
    }
    public class Enemy569 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy569 (TextureAtlas atlas) {
            region = atlas.findRegion("569");
        }
    }
    public class Enemy570 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy570 (TextureAtlas atlas) {
            region = atlas.findRegion("570");
        }
    }
    public class Enemy571 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy571 (TextureAtlas atlas) {
            region = atlas.findRegion("571");
        }
    }
    public class Enemy572 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy572 (TextureAtlas atlas) {
            region = atlas.findRegion("572");
        }
    }
    public class Enemy573 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy573 (TextureAtlas atlas) {
            region = atlas.findRegion("573");
        }
    }
    public class Enemy574 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy574 (TextureAtlas atlas) {
            region = atlas.findRegion("574");
        }
    }
    public class Enemy575 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy575 (TextureAtlas atlas) {
            region = atlas.findRegion("575");
        }
    }
    public class Enemy576 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy576 (TextureAtlas atlas) {
            region = atlas.findRegion("576");
        }
    }
    public class Enemy577 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy577 (TextureAtlas atlas) {
            region = atlas.findRegion("577");
        }
    }
    public class Enemy578 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy578 (TextureAtlas atlas) {
            region = atlas.findRegion("578");
        }
    }
    public class Enemy579 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy579 (TextureAtlas atlas) {
            region = atlas.findRegion("579");
        }
    }
    public class Enemy580 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy580 (TextureAtlas atlas) {
            region = atlas.findRegion("580");
        }
    }
    public class Enemy581 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy581 (TextureAtlas atlas) {
            region = atlas.findRegion("581");
        }
    }
    public class Enemy582 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy582 (TextureAtlas atlas) {
            region = atlas.findRegion("582");
        }
    }
    public class Enemy583 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy583 (TextureAtlas atlas) {
            region = atlas.findRegion("583");
        }
    }
    public class Enemy584 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy584 (TextureAtlas atlas) {
            region = atlas.findRegion("584");
        }
    }
    public class Enemy585 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy585 (TextureAtlas atlas) {
            region = atlas.findRegion("585");
        }
    }
    public class Enemy586 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy586 (TextureAtlas atlas) {
            region = atlas.findRegion("586");
        }
    }
    public class Enemy587 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy587 (TextureAtlas atlas) {
            region = atlas.findRegion("587");
        }
    }
    public class Enemy588 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy588 (TextureAtlas atlas) {
            region = atlas.findRegion("588");
        }
    }
    public class Enemy589 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy589 (TextureAtlas atlas) {
            region = atlas.findRegion("589");
        }
    }
    public class Enemy590 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy590 (TextureAtlas atlas) {
            region = atlas.findRegion("590");
        }
    }
    public class Enemy591 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy591 (TextureAtlas atlas) {
            region = atlas.findRegion("591");
        }
    }
    public class Enemy592 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy592 (TextureAtlas atlas) {
            region = atlas.findRegion("592");
        }
    }
    public class Enemy593 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy593 (TextureAtlas atlas) {
            region = atlas.findRegion("593");
        }
    }
    public class Enemy594 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy594 (TextureAtlas atlas) {
            region = atlas.findRegion("594");
        }
    }
    public class Enemy595 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy595 (TextureAtlas atlas) {
            region = atlas.findRegion("595");
        }
    }
    public class Enemy596 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy596 (TextureAtlas atlas) {
            region = atlas.findRegion("596");
        }
    }
    public class Enemy597 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy597 (TextureAtlas atlas) {
            region = atlas.findRegion("597");
        }
    }
    public class Enemy598 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy598 (TextureAtlas atlas) {
            region = atlas.findRegion("598");
        }
    }
    public class Enemy599 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy599 (TextureAtlas atlas) {
            region = atlas.findRegion("599");
        }
    }
    public class Enemy600 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy600 (TextureAtlas atlas) {
            region = atlas.findRegion("600");
        }
    }
    public class Enemy601 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy601 (TextureAtlas atlas) {
            region = atlas.findRegion("601");
        }
    }
    public class Enemy602 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy602 (TextureAtlas atlas) {
            region = atlas.findRegion("602");
        }
    }
    public class Enemy603 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy603 (TextureAtlas atlas) {
            region = atlas.findRegion("603");
        }
    }
    public class Enemy604 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy604 (TextureAtlas atlas) {
            region = atlas.findRegion("604");
        }
    }
    public class Enemy605 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy605 (TextureAtlas atlas) {
            region = atlas.findRegion("605");
        }
    }
    public class Enemy606 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy606 (TextureAtlas atlas) {
            region = atlas.findRegion("606");
        }
    }
    public class Enemy607 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy607 (TextureAtlas atlas) {
            region = atlas.findRegion("607");
        }
    }
    public class Enemy608 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy608 (TextureAtlas atlas) {
            region = atlas.findRegion("608");
        }
    }
    public class Enemy609 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy609 (TextureAtlas atlas) {
            region = atlas.findRegion("609");
        }
    }
    public class Enemy610 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy610 (TextureAtlas atlas) {
            region = atlas.findRegion("610");
        }
    }
    public class Enemy611 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy611 (TextureAtlas atlas) {
            region = atlas.findRegion("611");
        }
    }
    public class Enemy612 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy612 (TextureAtlas atlas) {
            region = atlas.findRegion("612");
        }
    }
    public class Enemy613 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy613 (TextureAtlas atlas) {
            region = atlas.findRegion("613");
        }
    }
    public class Enemy614 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy614 (TextureAtlas atlas) {
            region = atlas.findRegion("614");
        }
    }
    public class Enemy615 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy615 (TextureAtlas atlas) {
            region = atlas.findRegion("615");
        }
    }
    public class Enemy616 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy616 (TextureAtlas atlas) {
            region = atlas.findRegion("616");
        }
    }
    public class Enemy617 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy617 (TextureAtlas atlas) {
            region = atlas.findRegion("617");
        }
    }
    public class Enemy618 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy618 (TextureAtlas atlas) {
            region = atlas.findRegion("618");
        }
    }
    public class Enemy619 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy619 (TextureAtlas atlas) {
            region = atlas.findRegion("619");
        }
    }
    public class Enemy620 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy620 (TextureAtlas atlas) {
            region = atlas.findRegion("620");
        }
    }
    public class Enemy621 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy621 (TextureAtlas atlas) {
            region = atlas.findRegion("621");
        }
    }
    public class Enemy622 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy622 (TextureAtlas atlas) {
            region = atlas.findRegion("622");
        }
    }
    public class Enemy623 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy623 (TextureAtlas atlas) {
            region = atlas.findRegion("623");
        }
    }
    public class Enemy624 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy624 (TextureAtlas atlas) {
            region = atlas.findRegion("624");
        }
    }
    public class Enemy625 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy625 (TextureAtlas atlas) {
            region = atlas.findRegion("625");
        }
    }
    public class Enemy626 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy626 (TextureAtlas atlas) {
            region = atlas.findRegion("626");
        }
    }
    public class Enemy627 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy627 (TextureAtlas atlas) {
            region = atlas.findRegion("627");
        }
    }
    public class Enemy628 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy628 (TextureAtlas atlas) {
            region = atlas.findRegion("628");
        }
    }
    public class Enemy629 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy629 (TextureAtlas atlas) {
            region = atlas.findRegion("629");
        }
    }
    public class Enemy630 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy630 (TextureAtlas atlas) {
            region = atlas.findRegion("630");
        }
    }
    public class Enemy631 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy631 (TextureAtlas atlas) {
            region = atlas.findRegion("631");
        }
    }
    public class Enemy632 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy632 (TextureAtlas atlas) {
            region = atlas.findRegion("632");
        }
    }
    public class Enemy633 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy633 (TextureAtlas atlas) {
            region = atlas.findRegion("633");
        }
    }
    public class Enemy634 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy634 (TextureAtlas atlas) {
            region = atlas.findRegion("634");
        }
    }
    public class Enemy635 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy635 (TextureAtlas atlas) {
            region = atlas.findRegion("635");
        }
    }
    public class Enemy636 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy636 (TextureAtlas atlas) {
            region = atlas.findRegion("636");
        }
    }
    public class Enemy637 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy637 (TextureAtlas atlas) {
            region = atlas.findRegion("637");
        }
    }
    public class Enemy638 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy638 (TextureAtlas atlas) {
            region = atlas.findRegion("638");
        }
    }
    public class Enemy639 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy639 (TextureAtlas atlas) {
            region = atlas.findRegion("639");
        }
    }
    public class Enemy640 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy640 (TextureAtlas atlas) {
            region = atlas.findRegion("640");
        }
    }
    public class Enemy641 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy641 (TextureAtlas atlas) {
            region = atlas.findRegion("641");
        }
    }
    public class Enemy642 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy642 (TextureAtlas atlas) {
            region = atlas.findRegion("642");
        }
    }
    public class Enemy643 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy643 (TextureAtlas atlas) {
            region = atlas.findRegion("643");
        }
    }
    public class Enemy644 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy644 (TextureAtlas atlas) {
            region = atlas.findRegion("644");
        }
    }
    public class Enemy645 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy645 (TextureAtlas atlas) {
            region = atlas.findRegion("645");
        }
    }
    public class Enemy646 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy646 (TextureAtlas atlas) {
            region = atlas.findRegion("646");
        }
    }
    public class Enemy647 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy647 (TextureAtlas atlas) {
            region = atlas.findRegion("647");
        }
    }
    public class Enemy648 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy648 (TextureAtlas atlas) {
            region = atlas.findRegion("648");
        }
    }
    public class Enemy649 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy649 (TextureAtlas atlas) {
            region = atlas.findRegion("649");
        }
    }
    public class Enemy650 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy650 (TextureAtlas atlas) {
            region = atlas.findRegion("650");
        }
    }
    public class Enemy651 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy651 (TextureAtlas atlas) {
            region = atlas.findRegion("651");
        }
    }
    public class Enemy652 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy652 (TextureAtlas atlas) {
            region = atlas.findRegion("652");
        }
    }
    public class Enemy653 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy653 (TextureAtlas atlas) {
            region = atlas.findRegion("653");
        }
    }
    public class Enemy654 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy654 (TextureAtlas atlas) {
            region = atlas.findRegion("654");
        }
    }
    public class Enemy655 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy655 (TextureAtlas atlas) {
            region = atlas.findRegion("655");
        }
    }
    public class Enemy656 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy656 (TextureAtlas atlas) {
            region = atlas.findRegion("656");
        }
    }
    public class Enemy657 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy657 (TextureAtlas atlas) {
            region = atlas.findRegion("657");
        }
    }
    public class Enemy658 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy658 (TextureAtlas atlas) {
            region = atlas.findRegion("658");
        }
    }
    public class Enemy659 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy659 (TextureAtlas atlas) {
            region = atlas.findRegion("659");
        }
    }
    public class Enemy660 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy660 (TextureAtlas atlas) {
            region = atlas.findRegion("660");
        }
    }
    public class Enemy661 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy661 (TextureAtlas atlas) {
            region = atlas.findRegion("661");
        }
    }
    public class Enemy662 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy662 (TextureAtlas atlas) {
            region = atlas.findRegion("662");
        }
    }
    public class Enemy663 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy663 (TextureAtlas atlas) {
            region = atlas.findRegion("663");
        }
    }
    public class Enemy664 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy664 (TextureAtlas atlas) {
            region = atlas.findRegion("664");
        }
    }
    public class Enemy665 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy665 (TextureAtlas atlas) {
            region = atlas.findRegion("665");
        }
    }
    public class Enemy666 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy666 (TextureAtlas atlas) {
            region = atlas.findRegion("666");
        }
    }
    public class Enemy667 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy667 (TextureAtlas atlas) {
            region = atlas.findRegion("667");
        }
    }
    public class Enemy668 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy668 (TextureAtlas atlas) {
            region = atlas.findRegion("668");
        }
    }
    public class Enemy669 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy669 (TextureAtlas atlas) {
            region = atlas.findRegion("669");
        }
    }
    public class Enemy670 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy670 (TextureAtlas atlas) {
            region = atlas.findRegion("670");
        }
    }
    public class Enemy671 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy671 (TextureAtlas atlas) {
            region = atlas.findRegion("671");
        }
    }
    public class Enemy672 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy672 (TextureAtlas atlas) {
            region = atlas.findRegion("672");
        }
    }
    public class Enemy673 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy673 (TextureAtlas atlas) {
            region = atlas.findRegion("673");
        }
    }
    public class Enemy674 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy674 (TextureAtlas atlas) {
            region = atlas.findRegion("674");
        }
    }
    public class Enemy675 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy675 (TextureAtlas atlas) {
            region = atlas.findRegion("675");
        }
    }
    public class Enemy676 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy676 (TextureAtlas atlas) {
            region = atlas.findRegion("676");
        }
    }
    public class Enemy677 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy677 (TextureAtlas atlas) {
            region = atlas.findRegion("677");
        }
    }
    public class Enemy678 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy678 (TextureAtlas atlas) {
            region = atlas.findRegion("678");
        }
    }
    public class Enemy679 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy679 (TextureAtlas atlas) {
            region = atlas.findRegion("679");
        }
    }
    public class Enemy680 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy680 (TextureAtlas atlas) {
            region = atlas.findRegion("680");
        }
    }
    public class Enemy681 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy681 (TextureAtlas atlas) {
            region = atlas.findRegion("681");
        }
    }
    public class Enemy682 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy682 (TextureAtlas atlas) {
            region = atlas.findRegion("682");
        }
    }
    public class Enemy683 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy683 (TextureAtlas atlas) {
            region = atlas.findRegion("683");
        }
    }
    public class Enemy684 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy684 (TextureAtlas atlas) {
            region = atlas.findRegion("684");
        }
    }
    public class Enemy685 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy685 (TextureAtlas atlas) {
            region = atlas.findRegion("685");
        }
    }
    public class Enemy686 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy686 (TextureAtlas atlas) {
            region = atlas.findRegion("686");
        }
    }
    public class Enemy687 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy687 (TextureAtlas atlas) {
            region = atlas.findRegion("687");
        }
    }
    public class Enemy688 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy688 (TextureAtlas atlas) {
            region = atlas.findRegion("688");
        }
    }
    public class Enemy689 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy689 (TextureAtlas atlas) {
            region = atlas.findRegion("689");
        }
    }
    public class Enemy690 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy690 (TextureAtlas atlas) {
            region = atlas.findRegion("690");
        }
    }
    public class Enemy691 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy691 (TextureAtlas atlas) {
            region = atlas.findRegion("691");
        }
    }
    public class Enemy692 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy692 (TextureAtlas atlas) {
            region = atlas.findRegion("692");
        }
    }
    public class Enemy693 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy693 (TextureAtlas atlas) {
            region = atlas.findRegion("693");
        }
    }
    public class Enemy694 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy694 (TextureAtlas atlas) {
            region = atlas.findRegion("694");
        }
    }
    public class Enemy695 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy695 (TextureAtlas atlas) {
            region = atlas.findRegion("695");
        }
    }
    public class Enemy696 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy696 (TextureAtlas atlas) {
            region = atlas.findRegion("696");
        }
    }
    public class Enemy697 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy697 (TextureAtlas atlas) {
            region = atlas.findRegion("697");
        }
    }
    public class Enemy698 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy698 (TextureAtlas atlas) {
            region = atlas.findRegion("698");
        }
    }
    public class Enemy699 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy699 (TextureAtlas atlas) {
            region = atlas.findRegion("699");
        }
    }
    public class Enemy700 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy700 (TextureAtlas atlas) {
            region = atlas.findRegion("700");
        }
    }
    public class Enemy701 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy701 (TextureAtlas atlas) {
            region = atlas.findRegion("701");
        }
    }
    public class Enemy702 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy702 (TextureAtlas atlas) {
            region = atlas.findRegion("702");
        }
    }
    public class Enemy703 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy703 (TextureAtlas atlas) {
            region = atlas.findRegion("703");
        }
    }
    public class Enemy704 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy704 (TextureAtlas atlas) {
            region = atlas.findRegion("704");
        }
    }
    public class Enemy705 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy705 (TextureAtlas atlas) {
            region = atlas.findRegion("705");
        }
    }
    public class Enemy706 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy706 (TextureAtlas atlas) {
            region = atlas.findRegion("706");
        }
    }
    public class Enemy707 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy707 (TextureAtlas atlas) {
            region = atlas.findRegion("707");
        }
    }
    public class Enemy708 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy708 (TextureAtlas atlas) {
            region = atlas.findRegion("708");
        }
    }
    public class Enemy709 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy709 (TextureAtlas atlas) {
            region = atlas.findRegion("709");
        }
    }
    public class Enemy710 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy710 (TextureAtlas atlas) {
            region = atlas.findRegion("710");
        }
    }
    public class Enemy711 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy711 (TextureAtlas atlas) {
            region = atlas.findRegion("711");
        }
    }
    public class Enemy712 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy712 (TextureAtlas atlas) {
            region = atlas.findRegion("712");
        }
    }
    public class Enemy713 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy713 (TextureAtlas atlas) {
            region = atlas.findRegion("713");
        }
    }
    public class Enemy714 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy714 (TextureAtlas atlas) {
            region = atlas.findRegion("714");
        }
    }
    public class Enemy715 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy715 (TextureAtlas atlas) {
            region = atlas.findRegion("715");
        }
    }
    public class Enemy716 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy716 (TextureAtlas atlas) {
            region = atlas.findRegion("716");
        }
    }
    public class Enemy717 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy717 (TextureAtlas atlas) {
            region = atlas.findRegion("717");
        }
    }
    public class Enemy718 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy718 (TextureAtlas atlas) {
            region = atlas.findRegion("718");
        }
    }
    public class Enemy719 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy719 (TextureAtlas atlas) {
            region = atlas.findRegion("719");
        }
    }
    public class Enemy720 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy720 (TextureAtlas atlas) {
            region = atlas.findRegion("720");
        }
    }
    public class Enemy721 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy721 (TextureAtlas atlas) {
            region = atlas.findRegion("721");
        }
    }
    public class Enemy722 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy722 (TextureAtlas atlas) {
            region = atlas.findRegion("722");
        }
    }
    public class Enemy723 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy723 (TextureAtlas atlas) {
            region = atlas.findRegion("723");
        }
    }
    public class Enemy724 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy724 (TextureAtlas atlas) {
            region = atlas.findRegion("724");
        }
    }
    public class Enemy725 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy725 (TextureAtlas atlas) {
            region = atlas.findRegion("725");
        }
    }
    public class Enemy726 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy726 (TextureAtlas atlas) {
            region = atlas.findRegion("726");
        }
    }
    public class Enemy727 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy727 (TextureAtlas atlas) {
            region = atlas.findRegion("727");
        }
    }
    public class Enemy728 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy728 (TextureAtlas atlas) {
            region = atlas.findRegion("728");
        }
    }
    public class Enemy729 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy729 (TextureAtlas atlas) {
            region = atlas.findRegion("729");
        }
    }
    public class Enemy730 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy730 (TextureAtlas atlas) {
            region = atlas.findRegion("730");
        }
    }
    public class Enemy731 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy731 (TextureAtlas atlas) {
            region = atlas.findRegion("731");
        }
    }
    public class Enemy732 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy732 (TextureAtlas atlas) {
            region = atlas.findRegion("732");
        }
    }
    public class Enemy733 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy733 (TextureAtlas atlas) {
            region = atlas.findRegion("733");
        }
    }
    public class Enemy734 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy734 (TextureAtlas atlas) {
            region = atlas.findRegion("734");
        }
    }
    public class Enemy735 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy735 (TextureAtlas atlas) {
            region = atlas.findRegion("735");
        }
    }
    public class Enemy736 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy736 (TextureAtlas atlas) {
            region = atlas.findRegion("736");
        }
    }
    public class Enemy737 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy737 (TextureAtlas atlas) {
            region = atlas.findRegion("737");
        }
    }
    public class Enemy738 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy738 (TextureAtlas atlas) {
            region = atlas.findRegion("738");
        }
    }
    public class Enemy739 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy739 (TextureAtlas atlas) {
            region = atlas.findRegion("739");
        }
    }
    public class Enemy740 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy740 (TextureAtlas atlas) {
            region = atlas.findRegion("740");
        }
    }
    public class Enemy741 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy741 (TextureAtlas atlas) {
            region = atlas.findRegion("741");
        }
    }
    public class Enemy742 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy742 (TextureAtlas atlas) {
            region = atlas.findRegion("742");
        }
    }
    public class Enemy743 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy743 (TextureAtlas atlas) {
            region = atlas.findRegion("743");
        }
    }
    public class Enemy744 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy744 (TextureAtlas atlas) {
            region = atlas.findRegion("744");
        }
    }
    public class Enemy745 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy745 (TextureAtlas atlas) {
            region = atlas.findRegion("745");
        }
    }
    public class Enemy746 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy746 (TextureAtlas atlas) {
            region = atlas.findRegion("746");
        }
    }
    public class Enemy747 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy747 (TextureAtlas atlas) {
            region = atlas.findRegion("747");
        }
    }
    public class Enemy748 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy748 (TextureAtlas atlas) {
            region = atlas.findRegion("748");
        }
    }
    public class Enemy749 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy749 (TextureAtlas atlas) {
            region = atlas.findRegion("749");
        }
    }
    public class Enemy750 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy750 (TextureAtlas atlas) {
            region = atlas.findRegion("750");
        }
    }
    public class Enemy751 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy751 (TextureAtlas atlas) {
            region = atlas.findRegion("751");
        }
    }
    public class Enemy752 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy752 (TextureAtlas atlas) {
            region = atlas.findRegion("752");
        }
    }
    public class Enemy753 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy753 (TextureAtlas atlas) {
            region = atlas.findRegion("753");
        }
    }
    public class Enemy754 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy754 (TextureAtlas atlas) {
            region = atlas.findRegion("754");
        }
    }
    public class Enemy755 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy755 (TextureAtlas atlas) {
            region = atlas.findRegion("755");
        }
    }
    public class Enemy756 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy756 (TextureAtlas atlas) {
            region = atlas.findRegion("756");
        }
    }
    public class Enemy757 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy757 (TextureAtlas atlas) {
            region = atlas.findRegion("757");
        }
    }
    public class Enemy758 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy758 (TextureAtlas atlas) {
            region = atlas.findRegion("758");
        }
    }
    public class Enemy759 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy759 (TextureAtlas atlas) {
            region = atlas.findRegion("759");
        }
    }
    public class Enemy760 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy760 (TextureAtlas atlas) {
            region = atlas.findRegion("760");
        }
    }
    public class Enemy761 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy761 (TextureAtlas atlas) {
            region = atlas.findRegion("761");
        }
    }
    public class Enemy762 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy762 (TextureAtlas atlas) {
            region = atlas.findRegion("762");
        }
    }
    public class Enemy763 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy763 (TextureAtlas atlas) {
            region = atlas.findRegion("763");
        }
    }
    public class Enemy764 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy764 (TextureAtlas atlas) {
            region = atlas.findRegion("764");
        }
    }
    public class Enemy765 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy765 (TextureAtlas atlas) {
            region = atlas.findRegion("765");
        }
    }
    public class Enemy766 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy766 (TextureAtlas atlas) {
            region = atlas.findRegion("766");
        }
    }
    public class Enemy767 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy767 (TextureAtlas atlas) {
            region = atlas.findRegion("767");
        }
    }
    public class Enemy768 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy768 (TextureAtlas atlas) {
            region = atlas.findRegion("768");
        }
    }
    public class Enemy769 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy769 (TextureAtlas atlas) {
            region = atlas.findRegion("769");
        }
    }
    public class Enemy770 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy770 (TextureAtlas atlas) {
            region = atlas.findRegion("770");
        }
    }
    public class Enemy771 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy771 (TextureAtlas atlas) {
            region = atlas.findRegion("771");
        }
    }
    public class Enemy772 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy772 (TextureAtlas atlas) {
            region = atlas.findRegion("772");
        }
    }
    public class Enemy773 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy773 (TextureAtlas atlas) {
            region = atlas.findRegion("773");
        }
    }
    public class Enemy774 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy774 (TextureAtlas atlas) {
            region = atlas.findRegion("774");
        }
    }
    public class Enemy775 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy775 (TextureAtlas atlas) {
            region = atlas.findRegion("775");
        }
    }
    public class Enemy776 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy776 (TextureAtlas atlas) {
            region = atlas.findRegion("776");
        }
    }
    public class Enemy777 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy777 (TextureAtlas atlas) {
            region = atlas.findRegion("777");
        }
    }
    public class Enemy778 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy778 (TextureAtlas atlas) {
            region = atlas.findRegion("778");
        }
    }
    public class Enemy779 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy779 (TextureAtlas atlas) {
            region = atlas.findRegion("779");
        }
    }
    public class Enemy780 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy780 (TextureAtlas atlas) {
            region = atlas.findRegion("780");
        }
    }
    public class Enemy781 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy781 (TextureAtlas atlas) {
            region = atlas.findRegion("781");
        }
    }
    public class Enemy782 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy782 (TextureAtlas atlas) {
            region = atlas.findRegion("782");
        }
    }
    public class Enemy783 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy783 (TextureAtlas atlas) {
            region = atlas.findRegion("783");
        }
    }
    public class Enemy784 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy784 (TextureAtlas atlas) {
            region = atlas.findRegion("784");
        }
    }
    public class Enemy785 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy785 (TextureAtlas atlas) {
            region = atlas.findRegion("785");
        }
    }
    public class Enemy786 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy786 (TextureAtlas atlas) {
            region = atlas.findRegion("786");
        }
    }
    public class Enemy787 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy787 (TextureAtlas atlas) {
            region = atlas.findRegion("787");
        }
    }
    public class Enemy788 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy788 (TextureAtlas atlas) {
            region = atlas.findRegion("788");
        }
    }
    public class Enemy789 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy789 (TextureAtlas atlas) {
            region = atlas.findRegion("789");
        }
    }
    public class Enemy790 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy790 (TextureAtlas atlas) {
            region = atlas.findRegion("790");
        }
    }
    public class Enemy791 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy791 (TextureAtlas atlas) {
            region = atlas.findRegion("791");
        }
    }
    public class Enemy792 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy792 (TextureAtlas atlas) {
            region = atlas.findRegion("792");
        }
    }
    public class Enemy793 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy793 (TextureAtlas atlas) {
            region = atlas.findRegion("793");
        }
    }
    public class Enemy794 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy794 (TextureAtlas atlas) {
            region = atlas.findRegion("794");
        }
    }
    public class Enemy795 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy795 (TextureAtlas atlas) {
            region = atlas.findRegion("795");
        }
    }
    public class Enemy796 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy796 (TextureAtlas atlas) {
            region = atlas.findRegion("796");
        }
    }
    public class Enemy797 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy797 (TextureAtlas atlas) {
            region = atlas.findRegion("797");
        }
    }
    public class Enemy798 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy798 (TextureAtlas atlas) {
            region = atlas.findRegion("798");
        }
    }
    public class Enemy799 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy799 (TextureAtlas atlas) {
            region = atlas.findRegion("799");
        }
    }
    public class Enemy800 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy800 (TextureAtlas atlas) {
            region = atlas.findRegion("800");
        }
    }
    public class Enemy801 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy801 (TextureAtlas atlas) {
            region = atlas.findRegion("801");
        }
    }
    public class Enemy802 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy802 (TextureAtlas atlas) {
            region = atlas.findRegion("802");
        }
    }
    public class Enemy803 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy803 (TextureAtlas atlas) {
            region = atlas.findRegion("803");
        }
    }
    public class Enemy804 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy804 (TextureAtlas atlas) {
            region = atlas.findRegion("804");
        }
    }
    public class Enemy805 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy805 (TextureAtlas atlas) {
            region = atlas.findRegion("805");
        }
    }
    public class Enemy806 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy806 (TextureAtlas atlas) {
            region = atlas.findRegion("806");
        }
    }
    public class Enemy807 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy807 (TextureAtlas atlas) {
            region = atlas.findRegion("807");
        }
    }
    public class Enemy808 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy808 (TextureAtlas atlas) {
            region = atlas.findRegion("808");
        }
    }
    public class Enemy809 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy809 (TextureAtlas atlas) {
            region = atlas.findRegion("809");
        }
    }
    public class Enemy810 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy810 (TextureAtlas atlas) {
            region = atlas.findRegion("810");
        }
    }
    public class Enemy811 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy811 (TextureAtlas atlas) {
            region = atlas.findRegion("811");
        }
    }
    public class Enemy812 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy812 (TextureAtlas atlas) {
            region = atlas.findRegion("812");
        }
    }
    public class Enemy813 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy813 (TextureAtlas atlas) {
            region = atlas.findRegion("813");
        }
    }
    public class Enemy814 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy814 (TextureAtlas atlas) {
            region = atlas.findRegion("814");
        }
    }
    public class Enemy815 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy815 (TextureAtlas atlas) {
            region = atlas.findRegion("815");
        }
    }
    public class Enemy816 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy816 (TextureAtlas atlas) {
            region = atlas.findRegion("816");
        }
    }
    public class Enemy817 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy817 (TextureAtlas atlas) {
            region = atlas.findRegion("817");
        }
    }
    public class Enemy818 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy818 (TextureAtlas atlas) {
            region = atlas.findRegion("818");
        }
    }
    public class Enemy819 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy819 (TextureAtlas atlas) {
            region = atlas.findRegion("819");
        }
    }
    public class Enemy820 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy820 (TextureAtlas atlas) {
            region = atlas.findRegion("820");
        }
    }
    public class Enemy821 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy821 (TextureAtlas atlas) {
            region = atlas.findRegion("821");
        }
    }
    public class Enemy822 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy822 (TextureAtlas atlas) {
            region = atlas.findRegion("822");
        }
    }
    public class Enemy823 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy823 (TextureAtlas atlas) {
            region = atlas.findRegion("823");
        }
    }
    public class Enemy824 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy824 (TextureAtlas atlas) {
            region = atlas.findRegion("824");
        }
    }
    public class Enemy825 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy825 (TextureAtlas atlas) {
            region = atlas.findRegion("825");
        }
    }
    public class Enemy826 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy826 (TextureAtlas atlas) {
            region = atlas.findRegion("826");
        }
    }
    public class Enemy827 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy827 (TextureAtlas atlas) {
            region = atlas.findRegion("827");
        }
    }
    public class Enemy828 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy828 (TextureAtlas atlas) {
            region = atlas.findRegion("828");
        }
    }
    public class Enemy829 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy829 (TextureAtlas atlas) {
            region = atlas.findRegion("829");
        }
    }
    public class Enemy830 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy830 (TextureAtlas atlas) {
            region = atlas.findRegion("830");
        }
    }
    public class Enemy831 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy831 (TextureAtlas atlas) {
            region = atlas.findRegion("831");
        }
    }
    public class Enemy832 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy832 (TextureAtlas atlas) {
            region = atlas.findRegion("832");
        }
    }
    public class Enemy833 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy833 (TextureAtlas atlas) {
            region = atlas.findRegion("833");
        }
    }
    public class Enemy834 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy834 (TextureAtlas atlas) {
            region = atlas.findRegion("834");
        }
    }
    public class Enemy835 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy835 (TextureAtlas atlas) {
            region = atlas.findRegion("835");
        }
    }
    public class Enemy836 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy836 (TextureAtlas atlas) {
            region = atlas.findRegion("836");
        }
    }
    public class Enemy837 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy837 (TextureAtlas atlas) {
            region = atlas.findRegion("837");
        }
    }
    public class Enemy838 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy838 (TextureAtlas atlas) {
            region = atlas.findRegion("838");
        }
    }
    public class Enemy839 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy839 (TextureAtlas atlas) {
            region = atlas.findRegion("839");
        }
    }
    public class Enemy840 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy840 (TextureAtlas atlas) {
            region = atlas.findRegion("840");
        }
    }
    public class Enemy841 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy841 (TextureAtlas atlas) {
            region = atlas.findRegion("841");
        }
    }
    public class Enemy842 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy842 (TextureAtlas atlas) {
            region = atlas.findRegion("842");
        }
    }
    public class Enemy843 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy843 (TextureAtlas atlas) {
            region = atlas.findRegion("843");
        }
    }
    public class Enemy844 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy844 (TextureAtlas atlas) {
            region = atlas.findRegion("844");
        }
    }
    public class Enemy845 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy845 (TextureAtlas atlas) {
            region = atlas.findRegion("845");
        }
    }
    public class Enemy846 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy846 (TextureAtlas atlas) {
            region = atlas.findRegion("846");
        }
    }
    public class Enemy847 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy847 (TextureAtlas atlas) {
            region = atlas.findRegion("847");
        }
    }
    public class Enemy848 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy848 (TextureAtlas atlas) {
            region = atlas.findRegion("848");
        }
    }
    public class Enemy849 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy849 (TextureAtlas atlas) {
            region = atlas.findRegion("849");
        }
    }
    public class Enemy850 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy850 (TextureAtlas atlas) {
            region = atlas.findRegion("850");
        }
    }
    public class Enemy851 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy851 (TextureAtlas atlas) {
            region = atlas.findRegion("851");
        }
    }
    public class Enemy852 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy852 (TextureAtlas atlas) {
            region = atlas.findRegion("852");
        }
    }
    public class Enemy853 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy853 (TextureAtlas atlas) {
            region = atlas.findRegion("853");
        }
    }
    public class Enemy854 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy854 (TextureAtlas atlas) {
            region = atlas.findRegion("854");
        }
    }
    public class Enemy855 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy855 (TextureAtlas atlas) {
            region = atlas.findRegion("855");
        }
    }
    public class Enemy856 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy856 (TextureAtlas atlas) {
            region = atlas.findRegion("856");
        }
    }
    public class Enemy857 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy857 (TextureAtlas atlas) {
            region = atlas.findRegion("857");
        }
    }
    public class Enemy858 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy858 (TextureAtlas atlas) {
            region = atlas.findRegion("858");
        }
    }
    public class Enemy859 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy859 (TextureAtlas atlas) {
            region = atlas.findRegion("859");
        }
    }
    public class Enemy860 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy860 (TextureAtlas atlas) {
            region = atlas.findRegion("860");
        }
    }
    public class Enemy861 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy861 (TextureAtlas atlas) {
            region = atlas.findRegion("861");
        }
    }
    public class Enemy862 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy862 (TextureAtlas atlas) {
            region = atlas.findRegion("862");
        }
    }
    public class Enemy863 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy863 (TextureAtlas atlas) {
            region = atlas.findRegion("863");
        }
    }
    public class Enemy864 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy864 (TextureAtlas atlas) {
            region = atlas.findRegion("864");
        }
    }
    public class Enemy865 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy865 (TextureAtlas atlas) {
            region = atlas.findRegion("865");
        }
    }
    public class Enemy866 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy866 (TextureAtlas atlas) {
            region = atlas.findRegion("866");
        }
    }
    public class Enemy867 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy867 (TextureAtlas atlas) {
            region = atlas.findRegion("867");
        }
    }
    public class Enemy868 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy868 (TextureAtlas atlas) {
            region = atlas.findRegion("868");
        }
    }
    public class Enemy869 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy869 (TextureAtlas atlas) {
            region = atlas.findRegion("869");
        }
    }
    public class Enemy870 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy870 (TextureAtlas atlas) {
            region = atlas.findRegion("870");
        }
    }
    public class Enemy871 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy871 (TextureAtlas atlas) {
            region = atlas.findRegion("871");
        }
    }
    public class Enemy872 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy872 (TextureAtlas atlas) {
            region = atlas.findRegion("872");
        }
    }
    public class Enemy873 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy873 (TextureAtlas atlas) {
            region = atlas.findRegion("873");
        }
    }
    public class Enemy874 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy874 (TextureAtlas atlas) {
            region = atlas.findRegion("874");
        }
    }
    public class Enemy875 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy875 (TextureAtlas atlas) {
            region = atlas.findRegion("875");
        }
    }
    public class Enemy876 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy876 (TextureAtlas atlas) {
            region = atlas.findRegion("876");
        }
    }
    public class Enemy877 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy877 (TextureAtlas atlas) {
            region = atlas.findRegion("877");
        }
    }
    public class Enemy878 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy878 (TextureAtlas atlas) {
            region = atlas.findRegion("878");
        }
    }
    public class Enemy879 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy879 (TextureAtlas atlas) {
            region = atlas.findRegion("879");
        }
    }
    public class Enemy880 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy880 (TextureAtlas atlas) {
            region = atlas.findRegion("880");
        }
    }
    public class Enemy881 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy881 (TextureAtlas atlas) {
            region = atlas.findRegion("881");
        }
    }
    public class Enemy882 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy882 (TextureAtlas atlas) {
            region = atlas.findRegion("882");
        }
    }
    public class Enemy883 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy883 (TextureAtlas atlas) {
            region = atlas.findRegion("883");
        }
    }
    public class Enemy884 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy884 (TextureAtlas atlas) {
            region = atlas.findRegion("884");
        }
    }
    public class Enemy885 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy885 (TextureAtlas atlas) {
            region = atlas.findRegion("885");
        }
    }
    public class Enemy886 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy886 (TextureAtlas atlas) {
            region = atlas.findRegion("886");
        }
    }
    public class Enemy887 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy887 (TextureAtlas atlas) {
            region = atlas.findRegion("887");
        }
    }
    public class Enemy888 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy888 (TextureAtlas atlas) {
            region = atlas.findRegion("888");
        }
    }
    public class Enemy889 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy889 (TextureAtlas atlas) {
            region = atlas.findRegion("889");
        }
    }
    public class Enemy890 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy890 (TextureAtlas atlas) {
            region = atlas.findRegion("890");
        }
    }
    public class Enemy891 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy891 (TextureAtlas atlas) {
            region = atlas.findRegion("891");
        }
    }
    public class Enemy892 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy892 (TextureAtlas atlas) {
            region = atlas.findRegion("892");
        }
    }
    public class Enemy893 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy893 (TextureAtlas atlas) {
            region = atlas.findRegion("893");
        }
    }
    public class Enemy894 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy894 (TextureAtlas atlas) {
            region = atlas.findRegion("894");
        }
    }
    public class Enemy895 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy895 (TextureAtlas atlas) {
            region = atlas.findRegion("895");
        }
    }
    public class Enemy896 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy896 (TextureAtlas atlas) {
            region = atlas.findRegion("896");
        }
    }
    public class Enemy897 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy897 (TextureAtlas atlas) {
            region = atlas.findRegion("897");
        }
    }
    public class Enemy898 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy898 (TextureAtlas atlas) {
            region = atlas.findRegion("898");
        }
    }
    public class Enemy899 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy899 (TextureAtlas atlas) {
            region = atlas.findRegion("899");
        }
    }
    public class Enemy900 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy900 (TextureAtlas atlas) {
            region = atlas.findRegion("900");
        }
    }
    public class Enemy901 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy901 (TextureAtlas atlas) {
            region = atlas.findRegion("901");
        }
    }
    public class Enemy902 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy902 (TextureAtlas atlas) {
            region = atlas.findRegion("902");
        }
    }
    public class Enemy903 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy903 (TextureAtlas atlas) {
            region = atlas.findRegion("903");
        }
    }
    public class Enemy904 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy904 (TextureAtlas atlas) {
            region = atlas.findRegion("904");
        }
    }
    public class Enemy905 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy905 (TextureAtlas atlas) {
            region = atlas.findRegion("905");
        }
    }
    public class Enemy906 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy906 (TextureAtlas atlas) {
            region = atlas.findRegion("906");
        }
    }
    public class Enemy907 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy907 (TextureAtlas atlas) {
            region = atlas.findRegion("907");
        }
    }
    public class Enemy908 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy908 (TextureAtlas atlas) {
            region = atlas.findRegion("908");
        }
    }
    public class Enemy909 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy909 (TextureAtlas atlas) {
            region = atlas.findRegion("909");
        }
    }
    public class Enemy910 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy910 (TextureAtlas atlas) {
            region = atlas.findRegion("910");
        }
    }
    public class Enemy911 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy911 (TextureAtlas atlas) {
            region = atlas.findRegion("911");
        }
    }
    public class Enemy912 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy912 (TextureAtlas atlas) {
            region = atlas.findRegion("912");
        }
    }
    public class Enemy913 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy913 (TextureAtlas atlas) {
            region = atlas.findRegion("913");
        }
    }
    public class Enemy914 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy914 (TextureAtlas atlas) {
            region = atlas.findRegion("914");
        }
    }
    public class Enemy915 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy915 (TextureAtlas atlas) {
            region = atlas.findRegion("915");
        }
    }
    public class Enemy916 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy916 (TextureAtlas atlas) {
            region = atlas.findRegion("916");
        }
    }
    public class Enemy917 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy917 (TextureAtlas atlas) {
            region = atlas.findRegion("917");
        }
    }
    public class Enemy918 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy918 (TextureAtlas atlas) {
            region = atlas.findRegion("918");
        }
    }
    public class Enemy919 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy919 (TextureAtlas atlas) {
            region = atlas.findRegion("919");
        }
    }
    public class Enemy920 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy920 (TextureAtlas atlas) {
            region = atlas.findRegion("920");
        }
    }
    public class Enemy921 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy921 (TextureAtlas atlas) {
            region = atlas.findRegion("921");
        }
    }
    public class Enemy922 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy922 (TextureAtlas atlas) {
            region = atlas.findRegion("922");
        }
    }
    public class Enemy923 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy923 (TextureAtlas atlas) {
            region = atlas.findRegion("923");
        }
    }
    public class Enemy924 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy924 (TextureAtlas atlas) {
            region = atlas.findRegion("924");
        }
    }
    public class Enemy925 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy925 (TextureAtlas atlas) {
            region = atlas.findRegion("925");
        }
    }
    public class Enemy926 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy926 (TextureAtlas atlas) {
            region = atlas.findRegion("926");
        }
    }
    public class Enemy927 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy927 (TextureAtlas atlas) {
            region = atlas.findRegion("927");
        }
    }
    public class Enemy928 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy928 (TextureAtlas atlas) {
            region = atlas.findRegion("928");
        }
    }
    public class Enemy929 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy929 (TextureAtlas atlas) {
            region = atlas.findRegion("929");
        }
    }
    public class Enemy930 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy930 (TextureAtlas atlas) {
            region = atlas.findRegion("930");
        }
    }
    public class Enemy931 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy931 (TextureAtlas atlas) {
            region = atlas.findRegion("931");
        }
    }
    public class Enemy932 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy932 (TextureAtlas atlas) {
            region = atlas.findRegion("932");
        }
    }
    public class Enemy933 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy933 (TextureAtlas atlas) {
            region = atlas.findRegion("933");
        }
    }
    public class Enemy934 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy934 (TextureAtlas atlas) {
            region = atlas.findRegion("934");
        }
    }
    public class Enemy935 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy935 (TextureAtlas atlas) {
            region = atlas.findRegion("935");
        }
    }
    public class Enemy936 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy936 (TextureAtlas atlas) {
            region = atlas.findRegion("936");
        }
    }
    public class Enemy937 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy937 (TextureAtlas atlas) {
            region = atlas.findRegion("937");
        }
    }
    public class Enemy938 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy938 (TextureAtlas atlas) {
            region = atlas.findRegion("938");
        }
    }
    public class Enemy939 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy939 (TextureAtlas atlas) {
            region = atlas.findRegion("939");
        }
    }
    public class Enemy940 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy940 (TextureAtlas atlas) {
            region = atlas.findRegion("940");
        }
    }
    public class Enemy941 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy941 (TextureAtlas atlas) {
            region = atlas.findRegion("941");
        }
    }
    public class Enemy942 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy942 (TextureAtlas atlas) {
            region = atlas.findRegion("942");
        }
    }
    public class Enemy943 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy943 (TextureAtlas atlas) {
            region = atlas.findRegion("943");
        }
    }
    public class Enemy944 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy944 (TextureAtlas atlas) {
            region = atlas.findRegion("944");
        }
    }
    public class Enemy945 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy945 (TextureAtlas atlas) {
            region = atlas.findRegion("945");
        }
    }
    public class Enemy946 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy946 (TextureAtlas atlas) {
            region = atlas.findRegion("946");
        }
    }
    public class Enemy947 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy947 (TextureAtlas atlas) {
            region = atlas.findRegion("947");
        }
    }
    public class Enemy948 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy948 (TextureAtlas atlas) {
            region = atlas.findRegion("948");
        }
    }
    public class Enemy949 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy949 (TextureAtlas atlas) {
            region = atlas.findRegion("949");
        }
    }
    public class Enemy950 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy950 (TextureAtlas atlas) {
            region = atlas.findRegion("950");
        }
    }
    public class Enemy951 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy951 (TextureAtlas atlas) {
            region = atlas.findRegion("951");
        }
    }
    public class Enemy952 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy952 (TextureAtlas atlas) {
            region = atlas.findRegion("952");
        }
    }
    public class Enemy953 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy953 (TextureAtlas atlas) {
            region = atlas.findRegion("953");
        }
    }
    public class Enemy954 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy954 (TextureAtlas atlas) {
            region = atlas.findRegion("954");
        }
    }
    public class Enemy955 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy955 (TextureAtlas atlas) {
            region = atlas.findRegion("955");
        }
    }
    public class Enemy956 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy956 (TextureAtlas atlas) {
            region = atlas.findRegion("956");
        }
    }
    public class Enemy957 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy957 (TextureAtlas atlas) {
            region = atlas.findRegion("957");
        }
    }
    public class Enemy958 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy958 (TextureAtlas atlas) {
            region = atlas.findRegion("958");
        }
    }
    public class Enemy959 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy959 (TextureAtlas atlas) {
            region = atlas.findRegion("959");
        }
    }
    public class Enemy960 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy960 (TextureAtlas atlas) {
            region = atlas.findRegion("960");
        }
    }
    public class Enemy961 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy961 (TextureAtlas atlas) {
            region = atlas.findRegion("961");
        }
    }
    public class Enemy962 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy962 (TextureAtlas atlas) {
            region = atlas.findRegion("962");
        }
    }
    public class Enemy963 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy963 (TextureAtlas atlas) {
            region = atlas.findRegion("963");
        }
    }
    public class Enemy964 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy964 (TextureAtlas atlas) {
            region = atlas.findRegion("964");
        }
    }
    public class Enemy965 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy965 (TextureAtlas atlas) {
            region = atlas.findRegion("965");
        }
    }
    public class Enemy966 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy966 (TextureAtlas atlas) {
            region = atlas.findRegion("966");
        }
    }
    public class Enemy967 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy967 (TextureAtlas atlas) {
            region = atlas.findRegion("967");
        }
    }
    public class Enemy968 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy968 (TextureAtlas atlas) {
            region = atlas.findRegion("968");
        }
    }
    public class Enemy969 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy969 (TextureAtlas atlas) {
            region = atlas.findRegion("969");
        }
    }
    public class Enemy970 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy970 (TextureAtlas atlas) {
            region = atlas.findRegion("970");
        }
    }
    public class Enemy971 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy971 (TextureAtlas atlas) {
            region = atlas.findRegion("971");
        }
    }
    public class Enemy972 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy972 (TextureAtlas atlas) {
            region = atlas.findRegion("972");
        }
    }
    public class Enemy973 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy973 (TextureAtlas atlas) {
            region = atlas.findRegion("973");
        }
    }
    public class Enemy974 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy974 (TextureAtlas atlas) {
            region = atlas.findRegion("974");
        }
    }
    public class Enemy975 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy975 (TextureAtlas atlas) {
            region = atlas.findRegion("975");
        }
    }
    public class Enemy976 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy976 (TextureAtlas atlas) {
            region = atlas.findRegion("976");
        }
    }
    public class Enemy977 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy977 (TextureAtlas atlas) {
            region = atlas.findRegion("977");
        }
    }
    public class Enemy978 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy978 (TextureAtlas atlas) {
            region = atlas.findRegion("978");
        }
    }
    public class Enemy979 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy979 (TextureAtlas atlas) {
            region = atlas.findRegion("979");
        }
    }
    public class Enemy980 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy980 (TextureAtlas atlas) {
            region = atlas.findRegion("980");
        }
    }
    public class Enemy981 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy981 (TextureAtlas atlas) {
            region = atlas.findRegion("981");
        }
    }
    public class Enemy982 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy982 (TextureAtlas atlas) {
            region = atlas.findRegion("982");
        }
    }
    public class Enemy983 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy983 (TextureAtlas atlas) {
            region = atlas.findRegion("983");
        }
    }
    public class Enemy984 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy984 (TextureAtlas atlas) {
            region = atlas.findRegion("984");
        }
    }
    public class Enemy985 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy985 (TextureAtlas atlas) {
            region = atlas.findRegion("985");
        }
    }
    public class Enemy986 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy986 (TextureAtlas atlas) {
            region = atlas.findRegion("986");
        }
    }
    public class Enemy987 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy987 (TextureAtlas atlas) {
            region = atlas.findRegion("987");
        }
    }
    public class Enemy988 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy988 (TextureAtlas atlas) {
            region = atlas.findRegion("988");
        }
    }
    public class Enemy989 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy989 (TextureAtlas atlas) {
            region = atlas.findRegion("989");
        }
    }
    public class Enemy990 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy990 (TextureAtlas atlas) {
            region = atlas.findRegion("990");
        }
    }
    public class Enemy991 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy991 (TextureAtlas atlas) {
            region = atlas.findRegion("991");
        }
    }
    public class Enemy992 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy992 (TextureAtlas atlas) {
            region = atlas.findRegion("992");
        }
    }
    public class Enemy993 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy993 (TextureAtlas atlas) {
            region = atlas.findRegion("993");
        }
    }
    public class Enemy994 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy994 (TextureAtlas atlas) {
            region = atlas.findRegion("994");
        }
    }
    public class Enemy995 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy995 (TextureAtlas atlas) {
            region = atlas.findRegion("995");
        }
    }
    public class Enemy996 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy996 (TextureAtlas atlas) {
            region = atlas.findRegion("996");
        }
    }
    public class Enemy997 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy997 (TextureAtlas atlas) {
            region = atlas.findRegion("997");
        }
    }
    public class Enemy998 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy998 (TextureAtlas atlas) {
            region = atlas.findRegion("998");
        }
    }
    public class Enemy999 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy999 (TextureAtlas atlas) {
            region = atlas.findRegion("999");
        }
    }
    public class Enemy1000 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1000 (TextureAtlas atlas) {
            region = atlas.findRegion("1000");
        }
    }
    public class Enemy1001 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1001 (TextureAtlas atlas) {
            region = atlas.findRegion("1001");
        }
    }
    public class Enemy1002 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1002 (TextureAtlas atlas) {
            region = atlas.findRegion("1002");
        }
    }
    public class Enemy1003 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1003 (TextureAtlas atlas) {
            region = atlas.findRegion("1003");
        }
    }
    public class Enemy1004 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1004 (TextureAtlas atlas) {
            region = atlas.findRegion("1004");
        }
    }
    public class Enemy1005 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1005 (TextureAtlas atlas) {
            region = atlas.findRegion("1005");
        }
    }
    public class Enemy1006 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1006 (TextureAtlas atlas) {
            region = atlas.findRegion("1006");
        }
    }
    public class Enemy1007 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1007 (TextureAtlas atlas) {
            region = atlas.findRegion("1007");
        }
    }
    public class Enemy1008 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1008 (TextureAtlas atlas) {
            region = atlas.findRegion("1008");
        }
    }
    public class Enemy1009 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1009 (TextureAtlas atlas) {
            region = atlas.findRegion("1009");
        }
    }
    public class Enemy1010 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1010 (TextureAtlas atlas) {
            region = atlas.findRegion("1010");
        }
    }
    public class Enemy1011 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1011 (TextureAtlas atlas) {
            region = atlas.findRegion("1011");
        }
    }
    public class Enemy1012 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1012 (TextureAtlas atlas) {
            region = atlas.findRegion("1012");
        }
    }
    public class Enemy1013 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1013 (TextureAtlas atlas) {
            region = atlas.findRegion("1013");
        }
    }
    public class Enemy1014 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1014 (TextureAtlas atlas) {
            region = atlas.findRegion("1014");
        }
    }
    public class Enemy1015 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1015 (TextureAtlas atlas) {
            region = atlas.findRegion("1015");
        }
    }
    public class Enemy1016 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1016 (TextureAtlas atlas) {
            region = atlas.findRegion("1016");
        }
    }
    public class Enemy1017 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1017 (TextureAtlas atlas) {
            region = atlas.findRegion("1017");
        }
    }
    public class Enemy1018 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1018 (TextureAtlas atlas) {
            region = atlas.findRegion("1018");
        }
    }
    public class Enemy1019 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1019 (TextureAtlas atlas) {
            region = atlas.findRegion("1019");
        }
    }
    public class Enemy1020 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1020 (TextureAtlas atlas) {
            region = atlas.findRegion("1020");
        }
    }
    public class Enemy1021 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1021 (TextureAtlas atlas) {
            region = atlas.findRegion("1021");
        }
    }
    public class Enemy1022 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1022 (TextureAtlas atlas) {
            region = atlas.findRegion("1022");
        }
    }
    public class Enemy1023 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1023 (TextureAtlas atlas) {
            region = atlas.findRegion("1023");
        }
    }
    public class Enemy1024 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1024 (TextureAtlas atlas) {
            region = atlas.findRegion("1024");
        }
    }
    public class Enemy1025 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1025 (TextureAtlas atlas) {
            region = atlas.findRegion("1025");
        }
    }
    public class Enemy1026 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1026 (TextureAtlas atlas) {
            region = atlas.findRegion("1026");
        }
    }
    public class Enemy1027 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1027 (TextureAtlas atlas) {
            region = atlas.findRegion("1027");
        }
    }
    public class Enemy1028 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1028 (TextureAtlas atlas) {
            region = atlas.findRegion("1028");
        }
    }
    public class Enemy1029 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1029 (TextureAtlas atlas) {
            region = atlas.findRegion("1029");
        }
    }
    public class Enemy1030 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1030 (TextureAtlas atlas) {
            region = atlas.findRegion("1030");
        }
    }
    public class Enemy1031 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1031 (TextureAtlas atlas) {
            region = atlas.findRegion("1031");
        }
    }
    public class Enemy1032 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1032 (TextureAtlas atlas) {
            region = atlas.findRegion("1032");
        }
    }
    public class Enemy1033 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1033 (TextureAtlas atlas) {
            region = atlas.findRegion("1033");
        }
    }
    public class Enemy1034 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1034 (TextureAtlas atlas) {
            region = atlas.findRegion("1034");
        }
    }
    public class Enemy1035 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1035 (TextureAtlas atlas) {
            region = atlas.findRegion("1035");
        }
    }
    public class Enemy1036 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1036 (TextureAtlas atlas) {
            region = atlas.findRegion("1036");
        }
    }
    public class Enemy1037 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1037 (TextureAtlas atlas) {
            region = atlas.findRegion("1037");
        }
    }
    public class Enemy1038 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1038 (TextureAtlas atlas) {
            region = atlas.findRegion("1038");
        }
    }
    public class Enemy1039 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1039 (TextureAtlas atlas) {
            region = atlas.findRegion("1039");
        }
    }
    public class Enemy1040 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1040 (TextureAtlas atlas) {
            region = atlas.findRegion("1040");
        }
    }
    public class Enemy1041 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1041 (TextureAtlas atlas) {
            region = atlas.findRegion("1041");
        }
    }
    public class Enemy1042 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1042 (TextureAtlas atlas) {
            region = atlas.findRegion("1042");
        }
    }
    public class Enemy1043 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1043 (TextureAtlas atlas) {
            region = atlas.findRegion("1043");
        }
    }
    public class Enemy1044 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1044 (TextureAtlas atlas) {
            region = atlas.findRegion("1044");
        }
    }
    public class Enemy1045 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1045 (TextureAtlas atlas) {
            region = atlas.findRegion("1045");
        }
    }
    public class Enemy1046 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1046 (TextureAtlas atlas) {
            region = atlas.findRegion("1046");
        }
    }
    public class Enemy1047 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1047 (TextureAtlas atlas) {
            region = atlas.findRegion("1047");
        }
    }
    public class Enemy1048 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1048 (TextureAtlas atlas) {
            region = atlas.findRegion("1048");
        }
    }
    public class Enemy1049 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1049 (TextureAtlas atlas) {
            region = atlas.findRegion("1049");
        }
    }
    public class Enemy1050 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1050 (TextureAtlas atlas) {
            region = atlas.findRegion("1050");
        }
    }
    public class Enemy1051 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1051 (TextureAtlas atlas) {
            region = atlas.findRegion("1051");
        }
    }
    public class Enemy1052 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1052 (TextureAtlas atlas) {
            region = atlas.findRegion("1052");
        }
    }
    public class Enemy1053 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1053 (TextureAtlas atlas) {
            region = atlas.findRegion("1053");
        }
    }
    public class Enemy1054 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1054 (TextureAtlas atlas) {
            region = atlas.findRegion("1054");
        }
    }
    public class Enemy1055 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1055 (TextureAtlas atlas) {
            region = atlas.findRegion("1055");
        }
    }
    public class Enemy1056 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1056 (TextureAtlas atlas) {
            region = atlas.findRegion("1056");
        }
    }
    public class Enemy1057 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1057 (TextureAtlas atlas) {
            region = atlas.findRegion("1057");
        }
    }
    public class Enemy1058 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1058 (TextureAtlas atlas) {
            region = atlas.findRegion("1058");
        }
    }
    public class Enemy1059 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1059 (TextureAtlas atlas) {
            region = atlas.findRegion("1059");
        }
    }
    public class Enemy1060 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1060 (TextureAtlas atlas) {
            region = atlas.findRegion("1060");
        }
    }
    public class Enemy1061 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1061 (TextureAtlas atlas) {
            region = atlas.findRegion("1061");
        }
    }
    public class Enemy1062 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1062 (TextureAtlas atlas) {
            region = atlas.findRegion("1062");
        }
    }
    public class Enemy1063 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1063 (TextureAtlas atlas) {
            region = atlas.findRegion("1063");
        }
    }
    public class Enemy1064 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1064 (TextureAtlas atlas) {
            region = atlas.findRegion("1064");
        }
    }
    public class Enemy1065 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1065 (TextureAtlas atlas) {
            region = atlas.findRegion("1065");
        }
    }
    public class Enemy1066 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1066 (TextureAtlas atlas) {
            region = atlas.findRegion("1066");
        }
    }
    public class Enemy1067 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1067 (TextureAtlas atlas) {
            region = atlas.findRegion("1067");
        }
    }
    public class Enemy1068 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1068 (TextureAtlas atlas) {
            region = atlas.findRegion("1068");
        }
    }
    public class Enemy1069 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1069 (TextureAtlas atlas) {
            region = atlas.findRegion("1069");
        }
    }
    public class Enemy1070 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1070 (TextureAtlas atlas) {
            region = atlas.findRegion("1070");
        }
    }
    public class Enemy1071 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1071 (TextureAtlas atlas) {
            region = atlas.findRegion("1071");
        }
    }
    public class Enemy1072 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1072 (TextureAtlas atlas) {
            region = atlas.findRegion("1072");
        }
    }
    public class Enemy1073 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1073 (TextureAtlas atlas) {
            region = atlas.findRegion("1073");
        }
    }
    public class Enemy1074 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1074 (TextureAtlas atlas) {
            region = atlas.findRegion("1074");
        }
    }
    public class Enemy1075 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1075 (TextureAtlas atlas) {
            region = atlas.findRegion("1075");
        }
    }
    public class Enemy1076 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1076 (TextureAtlas atlas) {
            region = atlas.findRegion("1076");
        }
    }
    public class Enemy1077 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1077 (TextureAtlas atlas) {
            region = atlas.findRegion("1077");
        }
    }
    public class Enemy1078 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1078 (TextureAtlas atlas) {
            region = atlas.findRegion("1078");
        }
    }
    public class Enemy1079 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1079 (TextureAtlas atlas) {
            region = atlas.findRegion("1079");
        }
    }
    public class Enemy1080 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1080 (TextureAtlas atlas) {
            region = atlas.findRegion("1080");
        }
    }
    public class Enemy1081 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1081 (TextureAtlas atlas) {
            region = atlas.findRegion("1081");
        }
    }
    public class Enemy1082 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1082 (TextureAtlas atlas) {
            region = atlas.findRegion("1082");
        }
    }
    public class Enemy1083 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1083 (TextureAtlas atlas) {
            region = atlas.findRegion("1083");
        }
    }
    public class Enemy1084 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1084 (TextureAtlas atlas) {
            region = atlas.findRegion("1084");
        }
    }
    public class Enemy1085 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1085 (TextureAtlas atlas) {
            region = atlas.findRegion("1085");
        }
    }
    public class Enemy1086 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1086 (TextureAtlas atlas) {
            region = atlas.findRegion("1086");
        }
    }
    public class Enemy1087 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1087 (TextureAtlas atlas) {
            region = atlas.findRegion("1087");
        }
    }
    public class Enemy1088 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1088 (TextureAtlas atlas) {
            region = atlas.findRegion("1088");
        }
    }
    public class Enemy1089 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1089 (TextureAtlas atlas) {
            region = atlas.findRegion("1089");
        }
    }
    public class Enemy1090 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1090 (TextureAtlas atlas) {
            region = atlas.findRegion("1090");
        }
    }
    public class Enemy1091 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1091 (TextureAtlas atlas) {
            region = atlas.findRegion("1091");
        }
    }
    public class Enemy1092 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1092 (TextureAtlas atlas) {
            region = atlas.findRegion("1092");
        }
    }
    public class Enemy1093 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1093 (TextureAtlas atlas) {
            region = atlas.findRegion("1093");
        }
    }
    public class Enemy1094 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1094 (TextureAtlas atlas) {
            region = atlas.findRegion("1094");
        }
    }
    public class Enemy1095 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1095 (TextureAtlas atlas) {
            region = atlas.findRegion("1095");
        }
    }
    public class Enemy1096 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1096 (TextureAtlas atlas) {
            region = atlas.findRegion("1096");
        }
    }
    public class Enemy1097 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1097 (TextureAtlas atlas) {
            region = atlas.findRegion("1097");
        }
    }
    public class Enemy1098 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1098 (TextureAtlas atlas) {
            region = atlas.findRegion("1098");
        }
    }
    public class Enemy1099 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1099 (TextureAtlas atlas) {
            region = atlas.findRegion("1099");
        }
    }
    public class Enemy1100 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1100 (TextureAtlas atlas) {
            region = atlas.findRegion("1100");
        }
    }
    public class Enemy1101 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1101 (TextureAtlas atlas) {
            region = atlas.findRegion("1101");
        }
    }
    public class Enemy1102 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1102 (TextureAtlas atlas) {
            region = atlas.findRegion("1102");
        }
    }
    public class Enemy1103 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1103 (TextureAtlas atlas) {
            region = atlas.findRegion("1103");
        }
    }
    public class Enemy1104 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1104 (TextureAtlas atlas) {
            region = atlas.findRegion("1104");
        }
    }
    public class Enemy1105 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1105 (TextureAtlas atlas) {
            region = atlas.findRegion("1105");
        }
    }
    public class Enemy1106 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1106 (TextureAtlas atlas) {
            region = atlas.findRegion("1106");
        }
    }
    public class Enemy1107 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1107 (TextureAtlas atlas) {
            region = atlas.findRegion("1107");
        }
    }
    public class Enemy1108 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1108 (TextureAtlas atlas) {
            region = atlas.findRegion("1108");
        }
    }
    public class Enemy1109 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1109 (TextureAtlas atlas) {
            region = atlas.findRegion("1109");
        }
    }
    public class Enemy1110 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1110 (TextureAtlas atlas) {
            region = atlas.findRegion("1110");
        }
    }
    public class Enemy1111 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1111 (TextureAtlas atlas) {
            region = atlas.findRegion("1111");
        }
    }
    public class Enemy1112 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1112 (TextureAtlas atlas) {
            region = atlas.findRegion("1112");
        }
    }
    public class Enemy1113 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1113 (TextureAtlas atlas) {
            region = atlas.findRegion("1113");
        }
    }
    public class Enemy1114 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1114 (TextureAtlas atlas) {
            region = atlas.findRegion("1114");
        }
    }
    public class Enemy1115 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1115 (TextureAtlas atlas) {
            region = atlas.findRegion("1115");
        }
    }
    public class Enemy1116 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1116 (TextureAtlas atlas) {
            region = atlas.findRegion("1116");
        }
    }
    public class Enemy1117 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1117 (TextureAtlas atlas) {
            region = atlas.findRegion("1117");
        }
    }
    public class Enemy1118 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1118 (TextureAtlas atlas) {
            region = atlas.findRegion("1118");
        }
    }
    public class Enemy1119 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1119 (TextureAtlas atlas) {
            region = atlas.findRegion("1119");
        }
    }
    public class Enemy1120 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1120 (TextureAtlas atlas) {
            region = atlas.findRegion("1120");
        }
    }
    public class Enemy1121 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1121 (TextureAtlas atlas) {
            region = atlas.findRegion("1121");
        }
    }
    public class Enemy1122 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1122 (TextureAtlas atlas) {
            region = atlas.findRegion("1122");
        }
    }
    public class Enemy1123 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1123 (TextureAtlas atlas) {
            region = atlas.findRegion("1123");
        }
    }
    public class Enemy1124 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1124 (TextureAtlas atlas) {
            region = atlas.findRegion("1124");
        }
    }
    public class Enemy1125 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1125 (TextureAtlas atlas) {
            region = atlas.findRegion("1125");
        }
    }
    public class Enemy1126 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1126 (TextureAtlas atlas) {
            region = atlas.findRegion("1126");
        }
    }
    public class Enemy1127 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1127 (TextureAtlas atlas) {
            region = atlas.findRegion("1127");
        }
    }
    public class Enemy1128 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1128 (TextureAtlas atlas) {
            region = atlas.findRegion("1128");
        }
    }
    public class Enemy1129 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1129 (TextureAtlas atlas) {
            region = atlas.findRegion("1129");
        }
    }
    public class Enemy1130 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1130 (TextureAtlas atlas) {
            region = atlas.findRegion("1130");
        }
    }
    public class Enemy1131 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1131 (TextureAtlas atlas) {
            region = atlas.findRegion("1131");
        }
    }
    public class Enemy1132 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1132 (TextureAtlas atlas) {
            region = atlas.findRegion("1132");
        }
    }
    public class Enemy1133 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1133 (TextureAtlas atlas) {
            region = atlas.findRegion("1133");
        }
    }
    public class Enemy1134 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1134 (TextureAtlas atlas) {
            region = atlas.findRegion("1134");
        }
    }
    public class Enemy1135 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1135 (TextureAtlas atlas) {
            region = atlas.findRegion("1135");
        }
    }
    public class Enemy1136 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1136 (TextureAtlas atlas) {
            region = atlas.findRegion("1136");
        }
    }
    public class Enemy1137 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1137 (TextureAtlas atlas) {
            region = atlas.findRegion("1137");
        }
    }
    public class Enemy1138 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1138 (TextureAtlas atlas) {
            region = atlas.findRegion("1138");
        }
    }
    public class Enemy1139 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1139 (TextureAtlas atlas) {
            region = atlas.findRegion("1139");
        }
    }
    public class Enemy1140 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1140 (TextureAtlas atlas) {
            region = atlas.findRegion("1140");
        }
    }
    public class Enemy1141 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1141 (TextureAtlas atlas) {
            region = atlas.findRegion("1141");
        }
    }
    public class Enemy1142 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1142 (TextureAtlas atlas) {
            region = atlas.findRegion("1142");
        }
    }
    public class Enemy1143 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1143 (TextureAtlas atlas) {
            region = atlas.findRegion("1143");
        }
    }
    public class Enemy1144 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1144 (TextureAtlas atlas) {
            region = atlas.findRegion("1144");
        }
    }
    public class Enemy1145 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1145 (TextureAtlas atlas) {
            region = atlas.findRegion("1145");
        }
    }
    public class Enemy1146 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1146 (TextureAtlas atlas) {
            region = atlas.findRegion("1146");
        }
    }
    public class Enemy1147 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1147 (TextureAtlas atlas) {
            region = atlas.findRegion("1147");
        }
    }
    public class Enemy1148 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1148 (TextureAtlas atlas) {
            region = atlas.findRegion("1148");
        }
    }
    public class Enemy1149 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1149 (TextureAtlas atlas) {
            region = atlas.findRegion("1149");
        }
    }
    public class Enemy1150 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1150 (TextureAtlas atlas) {
            region = atlas.findRegion("1150");
        }
    }
    public class Enemy1151 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1151 (TextureAtlas atlas) {
            region = atlas.findRegion("1151");
        }
    }
    public class Enemy1152 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1152 (TextureAtlas atlas) {
            region = atlas.findRegion("1152");
        }
    }
    public class Enemy1153 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1153 (TextureAtlas atlas) {
            region = atlas.findRegion("1153");
        }
    }
    public class Enemy1154 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1154 (TextureAtlas atlas) {
            region = atlas.findRegion("1154");
        }
    }
    public class Enemy1155 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1155 (TextureAtlas atlas) {
            region = atlas.findRegion("1155");
        }
    }
    public class Enemy1156 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1156 (TextureAtlas atlas) {
            region = atlas.findRegion("1156");
        }
    }
    public class Enemy1157 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1157 (TextureAtlas atlas) {
            region = atlas.findRegion("1157");
        }
    }
    public class Enemy1158 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1158 (TextureAtlas atlas) {
            region = atlas.findRegion("1158");
        }
    }
    public class Enemy1159 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1159 (TextureAtlas atlas) {
            region = atlas.findRegion("1159");
        }
    }
    public class Enemy1160 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1160 (TextureAtlas atlas) {
            region = atlas.findRegion("1160");
        }
    }
    public class Enemy1161 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1161 (TextureAtlas atlas) {
            region = atlas.findRegion("1161");
        }
    }
    public class Enemy1162 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1162 (TextureAtlas atlas) {
            region = atlas.findRegion("1162");
        }
    }
    public class Enemy1163 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1163 (TextureAtlas atlas) {
            region = atlas.findRegion("1163");
        }
    }
    public class Enemy1164 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1164 (TextureAtlas atlas) {
            region = atlas.findRegion("1164");
        }
    }
    public class Enemy1165 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1165 (TextureAtlas atlas) {
            region = atlas.findRegion("1165");
        }
    }
    public class Enemy1166 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1166 (TextureAtlas atlas) {
            region = atlas.findRegion("1166");
        }
    }
    public class Enemy1167 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1167 (TextureAtlas atlas) {
            region = atlas.findRegion("1167");
        }
    }
    public class Enemy1168 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1168 (TextureAtlas atlas) {
            region = atlas.findRegion("1168");
        }
    }
    public class Enemy1169 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1169 (TextureAtlas atlas) {
            region = atlas.findRegion("1169");
        }
    }
    public class Enemy1170 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1170 (TextureAtlas atlas) {
            region = atlas.findRegion("1170");
        }
    }
    public class Enemy1171 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1171 (TextureAtlas atlas) {
            region = atlas.findRegion("1171");
        }
    }
    public class Enemy1172 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1172 (TextureAtlas atlas) {
            region = atlas.findRegion("1172");
        }
    }
    public class Enemy1173 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1173 (TextureAtlas atlas) {
            region = atlas.findRegion("1173");
        }
    }
    public class Enemy1174 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1174 (TextureAtlas atlas) {
            region = atlas.findRegion("1174");
        }
    }
    public class Enemy1175 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1175 (TextureAtlas atlas) {
            region = atlas.findRegion("1175");
        }
    }
    public class Enemy1176 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1176 (TextureAtlas atlas) {
            region = atlas.findRegion("1176");
        }
    }
    public class Enemy1177 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1177 (TextureAtlas atlas) {
            region = atlas.findRegion("1177");
        }
    }
    public class Enemy1178 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1178 (TextureAtlas atlas) {
            region = atlas.findRegion("1178");
        }
    }
    public class Enemy1179 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1179 (TextureAtlas atlas) {
            region = atlas.findRegion("1179");
        }
    }
    public class Enemy1180 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1180 (TextureAtlas atlas) {
            region = atlas.findRegion("1180");
        }
    }
    public class Enemy1181 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1181 (TextureAtlas atlas) {
            region = atlas.findRegion("1181");
        }
    }
    public class Enemy1182 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1182 (TextureAtlas atlas) {
            region = atlas.findRegion("1182");
        }
    }
    public class Enemy1183 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1183 (TextureAtlas atlas) {
            region = atlas.findRegion("1183");
        }
    }
    public class Enemy1184 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1184 (TextureAtlas atlas) {
            region = atlas.findRegion("1184");
        }
    }
    public class Enemy1185 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1185 (TextureAtlas atlas) {
            region = atlas.findRegion("1185");
        }
    }
    public class Enemy1186 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1186 (TextureAtlas atlas) {
            region = atlas.findRegion("1186");
        }
    }
    public class Enemy1187 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1187 (TextureAtlas atlas) {
            region = atlas.findRegion("1187");
        }
    }
    public class Enemy1188 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1188 (TextureAtlas atlas) {
            region = atlas.findRegion("1188");
        }
    }
    public class Enemy1189 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1189 (TextureAtlas atlas) {
            region = atlas.findRegion("1189");
        }
    }
    public class Enemy1190 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1190 (TextureAtlas atlas) {
            region = atlas.findRegion("1190");
        }
    }
    public class Enemy1191 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1191 (TextureAtlas atlas) {
            region = atlas.findRegion("1191");
        }
    }
    public class Enemy1192 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1192 (TextureAtlas atlas) {
            region = atlas.findRegion("1192");
        }
    }
    public class Enemy1193 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1193 (TextureAtlas atlas) {
            region = atlas.findRegion("1193");
        }
    }
    public class Enemy1194 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1194 (TextureAtlas atlas) {
            region = atlas.findRegion("1194");
        }
    }
    public class Enemy1195 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1195 (TextureAtlas atlas) {
            region = atlas.findRegion("1195");
        }
    }
    public class Enemy1196 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1196 (TextureAtlas atlas) {
            region = atlas.findRegion("1196");
        }
    }
    public class Enemy1197 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1197 (TextureAtlas atlas) {
            region = atlas.findRegion("1197");
        }
    }
    public class Enemy1198 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1198 (TextureAtlas atlas) {
            region = atlas.findRegion("1198");
        }
    }
    public class Enemy1199 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1199 (TextureAtlas atlas) {
            region = atlas.findRegion("1199");
        }
    }
    public class Enemy1200 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1200 (TextureAtlas atlas) {
            region = atlas.findRegion("1200");
        }
    }
    public class Enemy1201 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1201 (TextureAtlas atlas) {
            region = atlas.findRegion("1201");
        }
    }
    public class Enemy1202 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1202 (TextureAtlas atlas) {
            region = atlas.findRegion("1202");
        }
    }
    public class Enemy1203 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1203 (TextureAtlas atlas) {
            region = atlas.findRegion("1203");
        }
    }
    public class Enemy1204 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1204 (TextureAtlas atlas) {
            region = atlas.findRegion("1204");
        }
    }
    public class Enemy1205 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1205 (TextureAtlas atlas) {
            region = atlas.findRegion("1205");
        }
    }
    public class Enemy1206 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1206 (TextureAtlas atlas) {
            region = atlas.findRegion("1206");
        }
    }
    public class Enemy1207 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1207 (TextureAtlas atlas) {
            region = atlas.findRegion("1207");
        }
    }
    public class Enemy1208 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1208 (TextureAtlas atlas) {
            region = atlas.findRegion("1208");
        }
    }
    public class Enemy1209 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1209 (TextureAtlas atlas) {
            region = atlas.findRegion("1209");
        }
    }
    public class Enemy1210 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1210 (TextureAtlas atlas) {
            region = atlas.findRegion("1210");
        }
    }
    public class Enemy1211 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1211 (TextureAtlas atlas) {
            region = atlas.findRegion("1211");
        }
    }
    public class Enemy1212 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1212 (TextureAtlas atlas) {
            region = atlas.findRegion("1212");
        }
    }
    public class Enemy1213 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1213 (TextureAtlas atlas) {
            region = atlas.findRegion("1213");
        }
    }
    public class Enemy1214 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1214 (TextureAtlas atlas) {
            region = atlas.findRegion("1214");
        }
    }
    public class Enemy1215 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1215 (TextureAtlas atlas) {
            region = atlas.findRegion("1215");
        }
    }
    public class Enemy1216 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1216 (TextureAtlas atlas) {
            region = atlas.findRegion("1216");
        }
    }
    public class Enemy1217 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1217 (TextureAtlas atlas) {
            region = atlas.findRegion("1217");
        }
    }
    public class Enemy1218 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1218 (TextureAtlas atlas) {
            region = atlas.findRegion("1218");
        }
    }
    public class Enemy1219 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1219 (TextureAtlas atlas) {
            region = atlas.findRegion("1219");
        }
    }
    public class Enemy1220 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1220 (TextureAtlas atlas) {
            region = atlas.findRegion("1220");
        }
    }
    public class Enemy1221 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1221 (TextureAtlas atlas) {
            region = atlas.findRegion("1221");
        }
    }
    public class Enemy1222 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1222 (TextureAtlas atlas) {
            region = atlas.findRegion("1222");
        }
    }
    public class Enemy1223 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1223 (TextureAtlas atlas) {
            region = atlas.findRegion("1223");
        }
    }
    public class Enemy1224 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1224 (TextureAtlas atlas) {
            region = atlas.findRegion("1224");
        }
    }
    public class Enemy1225 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1225 (TextureAtlas atlas) {
            region = atlas.findRegion("1225");
        }
    }
    public class Enemy1226 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1226 (TextureAtlas atlas) {
            region = atlas.findRegion("1226");
        }
    }
    public class Enemy1227 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1227 (TextureAtlas atlas) {
            region = atlas.findRegion("1227");
        }
    }
    public class Enemy1228 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1228 (TextureAtlas atlas) {
            region = atlas.findRegion("1228");
        }
    }
    public class Enemy1229 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1229 (TextureAtlas atlas) {
            region = atlas.findRegion("1229");
        }
    }
    public class Enemy1230 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1230 (TextureAtlas atlas) {
            region = atlas.findRegion("1230");
        }
    }
    public class Enemy1231 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1231 (TextureAtlas atlas) {
            region = atlas.findRegion("1231");
        }
    }
    public class Enemy1232 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1232 (TextureAtlas atlas) {
            region = atlas.findRegion("1232");
        }
    }
    public class Enemy1233 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1233 (TextureAtlas atlas) {
            region = atlas.findRegion("1233");
        }
    }
    public class Enemy1234 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1234 (TextureAtlas atlas) {
            region = atlas.findRegion("1234");
        }
    }
    public class Enemy1235 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1235 (TextureAtlas atlas) {
            region = atlas.findRegion("1235");
        }
    }
    public class Enemy1236 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1236 (TextureAtlas atlas) {
            region = atlas.findRegion("1236");
        }
    }
    public class Enemy1237 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1237 (TextureAtlas atlas) {
            region = atlas.findRegion("1237");
        }
    }
    public class Enemy1238 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1238 (TextureAtlas atlas) {
            region = atlas.findRegion("1238");
        }
    }
    public class Enemy1239 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1239 (TextureAtlas atlas) {
            region = atlas.findRegion("1239");
        }
    }
    public class Enemy1240 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1240 (TextureAtlas atlas) {
            region = atlas.findRegion("1240");
        }
    }
    public class Enemy1241 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1241 (TextureAtlas atlas) {
            region = atlas.findRegion("1241");
        }
    }
    public class Enemy1242 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1242 (TextureAtlas atlas) {
            region = atlas.findRegion("1242");
        }
    }
    public class Enemy1243 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1243 (TextureAtlas atlas) {
            region = atlas.findRegion("1243");
        }
    }
    public class Enemy1244 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1244 (TextureAtlas atlas) {
            region = atlas.findRegion("1244");
        }
    }
    public class Enemy1245 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1245 (TextureAtlas atlas) {
            region = atlas.findRegion("1245");
        }
    }
    public class Enemy1246 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1246 (TextureAtlas atlas) {
            region = atlas.findRegion("1246");
        }
    }
    public class Enemy1247 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1247 (TextureAtlas atlas) {
            region = atlas.findRegion("1247");
        }
    }
    public class Enemy1248 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1248 (TextureAtlas atlas) {
            region = atlas.findRegion("1248");
        }
    }
    public class Enemy1249 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1249 (TextureAtlas atlas) {
            region = atlas.findRegion("1249");
        }
    }
    public class Enemy1250 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1250 (TextureAtlas atlas) {
            region = atlas.findRegion("1250");
        }
    }
    public class Enemy1251 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1251 (TextureAtlas atlas) {
            region = atlas.findRegion("1251");
        }
    }
    public class Enemy1252 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1252 (TextureAtlas atlas) {
            region = atlas.findRegion("1252");
        }
    }
    public class Enemy1253 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1253 (TextureAtlas atlas) {
            region = atlas.findRegion("1253");
        }
    }
    public class Enemy1254 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1254 (TextureAtlas atlas) {
            region = atlas.findRegion("1254");
        }
    }
    public class Enemy1255 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1255 (TextureAtlas atlas) {
            region = atlas.findRegion("1255");
        }
    }
    public class Enemy1256 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1256 (TextureAtlas atlas) {
            region = atlas.findRegion("1256");
        }
    }
    public class Enemy1257 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1257 (TextureAtlas atlas) {
            region = atlas.findRegion("1257");
        }
    }
    public class Enemy1258 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1258 (TextureAtlas atlas) {
            region = atlas.findRegion("1258");
        }
    }
    public class Enemy1259 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1259 (TextureAtlas atlas) {
            region = atlas.findRegion("1259");
        }
    }
    public class Enemy1260 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1260 (TextureAtlas atlas) {
            region = atlas.findRegion("1260");
        }
    }
    public class Enemy1261 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1261 (TextureAtlas atlas) {
            region = atlas.findRegion("1261");
        }
    }
    public class Enemy1262 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1262 (TextureAtlas atlas) {
            region = atlas.findRegion("1262");
        }
    }
    public class Enemy1263 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1263 (TextureAtlas atlas) {
            region = atlas.findRegion("1263");
        }
    }
    public class Enemy1264 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1264 (TextureAtlas atlas) {
            region = atlas.findRegion("1264");
        }
    }
    public class Enemy1265 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1265 (TextureAtlas atlas) {
            region = atlas.findRegion("1265");
        }
    }
    public class Enemy1266 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1266 (TextureAtlas atlas) {
            region = atlas.findRegion("1266");
        }
    }
    public class Enemy1267 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1267 (TextureAtlas atlas) {
            region = atlas.findRegion("1267");
        }
    }
    public class Enemy1268 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1268 (TextureAtlas atlas) {
            region = atlas.findRegion("1268");
        }
    }
    public class Enemy1269 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1269 (TextureAtlas atlas) {
            region = atlas.findRegion("1269");
        }
    }
    public class Enemy1270 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1270 (TextureAtlas atlas) {
            region = atlas.findRegion("1270");
        }
    }
    public class Enemy1271 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1271 (TextureAtlas atlas) {
            region = atlas.findRegion("1271");
        }
    }
    public class Enemy1272 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1272 (TextureAtlas atlas) {
            region = atlas.findRegion("1272");
        }
    }
    public class Enemy1273 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1273 (TextureAtlas atlas) {
            region = atlas.findRegion("1273");
        }
    }
    public class Enemy1274 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1274 (TextureAtlas atlas) {
            region = atlas.findRegion("1274");
        }
    }
    public class Enemy1275 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1275 (TextureAtlas atlas) {
            region = atlas.findRegion("1275");
        }
    }
    public class Enemy1276 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1276 (TextureAtlas atlas) {
            region = atlas.findRegion("1276");
        }
    }
    public class Enemy1277 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1277 (TextureAtlas atlas) {
            region = atlas.findRegion("1277");
        }
    }
    public class Enemy1278 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1278 (TextureAtlas atlas) {
            region = atlas.findRegion("1278");
        }
    }
    public class Enemy1279 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1279 (TextureAtlas atlas) {
            region = atlas.findRegion("1279");
        }
    }
    public class Enemy1280 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1280 (TextureAtlas atlas) {
            region = atlas.findRegion("1280");
        }
    }
    public class Enemy1281 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1281 (TextureAtlas atlas) {
            region = atlas.findRegion("1281");
        }
    }
    public class Enemy1282 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1282 (TextureAtlas atlas) {
            region = atlas.findRegion("1282");
        }
    }
    public class Enemy1283 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1283 (TextureAtlas atlas) {
            region = atlas.findRegion("1283");
        }
    }
    public class Enemy1284 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1284 (TextureAtlas atlas) {
            region = atlas.findRegion("1284");
        }
    }
    public class Enemy1285 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1285 (TextureAtlas atlas) {
            region = atlas.findRegion("1285");
        }
    }
    public class Enemy1286 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1286 (TextureAtlas atlas) {
            region = atlas.findRegion("1286");
        }
    }
    public class Enemy1287 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1287 (TextureAtlas atlas) {
            region = atlas.findRegion("1287");
        }
    }
    public class Enemy1288 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1288 (TextureAtlas atlas) {
            region = atlas.findRegion("1288");
        }
    }
    public class Enemy1289 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1289 (TextureAtlas atlas) {
            region = atlas.findRegion("1289");
        }
    }
    public class Enemy1290 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1290 (TextureAtlas atlas) {
            region = atlas.findRegion("1290");
        }
    }
    public class Enemy1291 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1291 (TextureAtlas atlas) {
            region = atlas.findRegion("1291");
        }
    }
    public class Enemy1292 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1292 (TextureAtlas atlas) {
            region = atlas.findRegion("1292");
        }
    }
    public class Enemy1293 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1293 (TextureAtlas atlas) {
            region = atlas.findRegion("1293");
        }
    }
    public class Enemy1294 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1294 (TextureAtlas atlas) {
            region = atlas.findRegion("1294");
        }
    }
    public class Enemy1295 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1295 (TextureAtlas atlas) {
            region = atlas.findRegion("1295");
        }
    }
    public class Enemy1296 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1296 (TextureAtlas atlas) {
            region = atlas.findRegion("1296");
        }
    }
    public class Enemy1297 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1297 (TextureAtlas atlas) {
            region = atlas.findRegion("1297");
        }
    }
    public class Enemy1298 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1298 (TextureAtlas atlas) {
            region = atlas.findRegion("1298");
        }
    }
    public class Enemy1299 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1299 (TextureAtlas atlas) {
            region = atlas.findRegion("1299");
        }
    }
    public class Enemy1300 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1300 (TextureAtlas atlas) {
            region = atlas.findRegion("1300");
        }
    }
    public class Enemy1301 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1301 (TextureAtlas atlas) {
            region = atlas.findRegion("1301");
        }
    }
    public class Enemy1302 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1302 (TextureAtlas atlas) {
            region = atlas.findRegion("1302");
        }
    }
    public class Enemy1303 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1303 (TextureAtlas atlas) {
            region = atlas.findRegion("1303");
        }
    }
    public class Enemy1304 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1304 (TextureAtlas atlas) {
            region = atlas.findRegion("1304");
        }
    }
    public class Enemy1305 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1305 (TextureAtlas atlas) {
            region = atlas.findRegion("1305");
        }
    }
    public class Enemy1306 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1306 (TextureAtlas atlas) {
            region = atlas.findRegion("1306");
        }
    }
    public class Enemy1307 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1307 (TextureAtlas atlas) {
            region = atlas.findRegion("1307");
        }
    }
    public class Enemy1308 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1308 (TextureAtlas atlas) {
            region = atlas.findRegion("1308");
        }
    }
    public class Enemy1309 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1309 (TextureAtlas atlas) {
            region = atlas.findRegion("1309");
        }
    }
    public class Enemy1310 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1310 (TextureAtlas atlas) {
            region = atlas.findRegion("1310");
        }
    }
    public class Enemy1311 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1311 (TextureAtlas atlas) {
            region = atlas.findRegion("1311");
        }
    }
    public class Enemy1312 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1312 (TextureAtlas atlas) {
            region = atlas.findRegion("1312");
        }
    }
    public class Enemy1313 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1313 (TextureAtlas atlas) {
            region = atlas.findRegion("1313");
        }
    }
    public class Enemy1314 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1314 (TextureAtlas atlas) {
            region = atlas.findRegion("1314");
        }
    }
    public class Enemy1315 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1315 (TextureAtlas atlas) {
            region = atlas.findRegion("1315");
        }
    }
    public class Enemy1316 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1316 (TextureAtlas atlas) {
            region = atlas.findRegion("1316");
        }
    }
    public class Enemy1317 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1317 (TextureAtlas atlas) {
            region = atlas.findRegion("1317");
        }
    }
    public class Enemy1318 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1318 (TextureAtlas atlas) {
            region = atlas.findRegion("1318");
        }
    }
    public class Enemy1319 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1319 (TextureAtlas atlas) {
            region = atlas.findRegion("1319");
        }
    }
    public class Enemy1320 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1320 (TextureAtlas atlas) {
            region = atlas.findRegion("1320");
        }
    }
    public class Enemy1321 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1321 (TextureAtlas atlas) {
            region = atlas.findRegion("1321");
        }
    }
    public class Enemy1322 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1322 (TextureAtlas atlas) {
            region = atlas.findRegion("1322");
        }
    }
    public class Enemy1323 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1323 (TextureAtlas atlas) {
            region = atlas.findRegion("1323");
        }
    }
    public class Enemy1324 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1324 (TextureAtlas atlas) {
            region = atlas.findRegion("1324");
        }
    }
    public class Enemy1325 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1325 (TextureAtlas atlas) {
            region = atlas.findRegion("1325");
        }
    }
    public class Enemy1326 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1326 (TextureAtlas atlas) {
            region = atlas.findRegion("1326");
        }
    }
    public class Enemy1327 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1327 (TextureAtlas atlas) {
            region = atlas.findRegion("1327");
        }
    }
    public class Enemy1328 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1328 (TextureAtlas atlas) {
            region = atlas.findRegion("1328");
        }
    }
    public class Enemy1329 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1329 (TextureAtlas atlas) {
            region = atlas.findRegion("1329");
        }
    }
    public class Enemy1330 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1330 (TextureAtlas atlas) {
            region = atlas.findRegion("1330");
        }
    }
    public class Enemy1331 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1331 (TextureAtlas atlas) {
            region = atlas.findRegion("1331");
        }
    }
    public class Enemy1332 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1332 (TextureAtlas atlas) {
            region = atlas.findRegion("1332");
        }
    }
    public class Enemy1333 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1333 (TextureAtlas atlas) {
            region = atlas.findRegion("1333");
        }
    }
    public class Enemy1334 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1334 (TextureAtlas atlas) {
            region = atlas.findRegion("1334");
        }
    }
    public class Enemy1335 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1335 (TextureAtlas atlas) {
            region = atlas.findRegion("1335");
        }
    }
    public class Enemy1336 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1336 (TextureAtlas atlas) {
            region = atlas.findRegion("1336");
        }
    }
    public class Enemy1337 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1337 (TextureAtlas atlas) {
            region = atlas.findRegion("1337");
        }
    }
    public class Enemy1338 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1338 (TextureAtlas atlas) {
            region = atlas.findRegion("1338");
        }
    }
    public class Enemy1339 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1339 (TextureAtlas atlas) {
            region = atlas.findRegion("1339");
        }
    }
    public class Enemy1340 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1340 (TextureAtlas atlas) {
            region = atlas.findRegion("1340");
        }
    }
    public class Enemy1341 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1341 (TextureAtlas atlas) {
            region = atlas.findRegion("1341");
        }
    }
    public class Enemy1342 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1342 (TextureAtlas atlas) {
            region = atlas.findRegion("1342");
        }
    }
    public class Enemy1343 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1343 (TextureAtlas atlas) {
            region = atlas.findRegion("1343");
        }
    }
    public class Enemy1344 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1344 (TextureAtlas atlas) {
            region = atlas.findRegion("1344");
        }
    }
    public class Enemy1345 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1345 (TextureAtlas atlas) {
            region = atlas.findRegion("1345");
        }
    }
    public class Enemy1346 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1346 (TextureAtlas atlas) {
            region = atlas.findRegion("1346");
        }
    }
    public class Enemy1347 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1347 (TextureAtlas atlas) {
            region = atlas.findRegion("1347");
        }
    }
    public class Enemy1348 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1348 (TextureAtlas atlas) {
            region = atlas.findRegion("1348");
        }
    }
    public class Enemy1349 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1349 (TextureAtlas atlas) {
            region = atlas.findRegion("1349");
        }
    }
    public class Enemy1350 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1350 (TextureAtlas atlas) {
            region = atlas.findRegion("1350");
        }
    }
    public class Enemy1351 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1351 (TextureAtlas atlas) {
            region = atlas.findRegion("1351");
        }
    }
    public class Enemy1352 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1352 (TextureAtlas atlas) {
            region = atlas.findRegion("1352");
        }
    }
    public class Enemy1353 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1353 (TextureAtlas atlas) {
            region = atlas.findRegion("1353");
        }
    }
    public class Enemy1354 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1354 (TextureAtlas atlas) {
            region = atlas.findRegion("1354");
        }
    }
    public class Enemy1355 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1355 (TextureAtlas atlas) {
            region = atlas.findRegion("1355");
        }
    }
    public class Enemy1356 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1356 (TextureAtlas atlas) {
            region = atlas.findRegion("1356");
        }
    }
    public class Enemy1357 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1357 (TextureAtlas atlas) {
            region = atlas.findRegion("1357");
        }
    }
    public class Enemy1358 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1358 (TextureAtlas atlas) {
            region = atlas.findRegion("1358");
        }
    }
    public class Enemy1359 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1359 (TextureAtlas atlas) {
            region = atlas.findRegion("1359");
        }
    }
    public class Enemy1360 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1360 (TextureAtlas atlas) {
            region = atlas.findRegion("1360");
        }
    }
    public class Enemy1361 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1361 (TextureAtlas atlas) {
            region = atlas.findRegion("1361");
        }
    }
    public class Enemy1362 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1362 (TextureAtlas atlas) {
            region = atlas.findRegion("1362");
        }
    }
    public class Enemy1363 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1363 (TextureAtlas atlas) {
            region = atlas.findRegion("1363");
        }
    }
    public class Enemy1364 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1364 (TextureAtlas atlas) {
            region = atlas.findRegion("1364");
        }
    }
    public class Enemy1365 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1365 (TextureAtlas atlas) {
            region = atlas.findRegion("1365");
        }
    }
    public class Enemy1366 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1366 (TextureAtlas atlas) {
            region = atlas.findRegion("1366");
        }
    }
    public class Enemy1367 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1367 (TextureAtlas atlas) {
            region = atlas.findRegion("1367");
        }
    }
    public class Enemy1368 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1368 (TextureAtlas atlas) {
            region = atlas.findRegion("1368");
        }
    }
    public class Enemy1369 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1369 (TextureAtlas atlas) {
            region = atlas.findRegion("1369");
        }
    }
    public class Enemy1370 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1370 (TextureAtlas atlas) {
            region = atlas.findRegion("1370");
        }
    }
    public class Enemy1371 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1371 (TextureAtlas atlas) {
            region = atlas.findRegion("1371");
        }
    }
    public class Enemy1372 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1372 (TextureAtlas atlas) {
            region = atlas.findRegion("1372");
        }
    }
    public class Enemy1373 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1373 (TextureAtlas atlas) {
            region = atlas.findRegion("1373");
        }
    }
    public class Enemy1374 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1374 (TextureAtlas atlas) {
            region = atlas.findRegion("1374");
        }
    }
    public class Enemy1375 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1375 (TextureAtlas atlas) {
            region = atlas.findRegion("1375");
        }
    }
    public class Enemy1376 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1376 (TextureAtlas atlas) {
            region = atlas.findRegion("1376");
        }
    }
    public class Enemy1377 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1377 (TextureAtlas atlas) {
            region = atlas.findRegion("1377");
        }
    }
    public class Enemy1378 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1378 (TextureAtlas atlas) {
            region = atlas.findRegion("1378");
        }
    }
    public class Enemy1379 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1379 (TextureAtlas atlas) {
            region = atlas.findRegion("1379");
        }
    }
    public class Enemy1380 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1380 (TextureAtlas atlas) {
            region = atlas.findRegion("1380");
        }
    }
    public class Enemy1381 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1381 (TextureAtlas atlas) {
            region = atlas.findRegion("1381");
        }
    }
    public class Enemy1382 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1382 (TextureAtlas atlas) {
            region = atlas.findRegion("1382");
        }
    }
    public class Enemy1383 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1383 (TextureAtlas atlas) {
            region = atlas.findRegion("1383");
        }
    }
    public class Enemy1384 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1384 (TextureAtlas atlas) {
            region = atlas.findRegion("1384");
        }
    }
    public class Enemy1385 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1385 (TextureAtlas atlas) {
            region = atlas.findRegion("1385");
        }
    }
    public class Enemy1386 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1386 (TextureAtlas atlas) {
            region = atlas.findRegion("1386");
        }
    }
    public class Enemy1387 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1387 (TextureAtlas atlas) {
            region = atlas.findRegion("1387");
        }
    }
    public class Enemy1388 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1388 (TextureAtlas atlas) {
            region = atlas.findRegion("1388");
        }
    }
    public class Enemy1389 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1389 (TextureAtlas atlas) {
            region = atlas.findRegion("1389");
        }
    }
    public class Enemy1390 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1390 (TextureAtlas atlas) {
            region = atlas.findRegion("1390");
        }
    }
    public class Enemy1391 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1391 (TextureAtlas atlas) {
            region = atlas.findRegion("1391");
        }
    }
    public class Enemy1392 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1392 (TextureAtlas atlas) {
            region = atlas.findRegion("1392");
        }
    }
    public class Enemy1393 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1393 (TextureAtlas atlas) {
            region = atlas.findRegion("1393");
        }
    }
    public class Enemy1394 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1394 (TextureAtlas atlas) {
            region = atlas.findRegion("1394");
        }
    }
    public class Enemy1395 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1395 (TextureAtlas atlas) {
            region = atlas.findRegion("1395");
        }
    }
    public class Enemy1396 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1396 (TextureAtlas atlas) {
            region = atlas.findRegion("1396");
        }
    }
    public class Enemy1397 {
        public final TextureAtlas.AtlasRegion region;

        public Enemy1397 (TextureAtlas atlas) {
            region = atlas.findRegion("1397");
        }
    }
    public class Player {
        public final TextureAtlas.AtlasRegion region;

        public Player(TextureAtlas atlas) {
            region = atlas.findRegion("player");
        }
    }
}

